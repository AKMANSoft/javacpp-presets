// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ISliceLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISliceLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the start offset
     * 
     *  @param start The start offset
     * 
     *  @see getStart
     *  */
    
    
    //!
    //!
    //!
    public native void setStart(@ByVal Dims start);

    /**
     *  \brief Get the start offset
     * 
     *  @return The start Offset
     * 
     *  @see setStart */
    
    
    //!
    //!
    //!
    public native @ByVal Dims getStart();

    /**
     *  \brief Set the output dimension
     * 
     *  @param size The output dimension
     * 
     *  @see getSize */
    
    
    //!
    //!
    //!
    public native void setSize(@ByVal Dims size);

    /**
     *  \brief Get the output dimension
     * 
     *  @return The output dimesion
     * 
     *  @see setSize */
    
    
    //!
    //!
    //!
    public native @ByVal Dims getSize();

    /**
     *  \brief Set the slicing stride
     * 
     *  @param stride The slicing stride
     * 
     *  @see getStride */
    
    
    //!
    //!
    //!
    public native void setStride(@ByVal Dims stride);

    /**
     *  \brief Get the slicing stride
     * 
     *  @return The slicing stride
     * 
     *  @see setStride */
    public native @ByVal Dims getStride();
}
