// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Implementation details

// START_SKIP_DOXYGEN

// Interface to access the raw ref-counted data buffer.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorBuffer extends Pointer {
    static { Loader.load(); }

  public TensorBuffer(Pointer data_ptr) { super((Pointer)null); allocate(data_ptr); }
  private native void allocate(Pointer data_ptr);

  // data() points to a memory region of size() bytes.
  //
  // NOTE(mrry): The `data()` method is not virtual for performance reasons.
  // It can be called multiple times when the contents of a `Tensor` are
  // accessed, and so making it non-virtual allows the body to be inlined.
  public native Pointer data();
  @Virtual(true) public native @Cast("size_t") @Const({false, false, true}) long size();

  // If this TensorBuffer is sub-buffer of another TensorBuffer,
  // returns that TensorBuffer. Otherwise, returns this.
  @Virtual(true) public native TensorBuffer root_buffer();

  // Fill metadata about the allocation into the proto.
  @Virtual(true) public native @Const({false, false, true}) void FillAllocationDescription(
        AllocationDescription proto);

  // Whether this TensorBuffer owns the underlying memory.
  @Virtual public native @Cast("bool") @Const({false, false, true}) boolean OwnsMemory();
}
