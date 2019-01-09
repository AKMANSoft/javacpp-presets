// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_saliency;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;

import static org.bytedeco.javacpp.opencv_saliency.opencv_saliency.*;


/************************************ Specific Objectness Specialized Classes ************************************/

/**
 * \brief Objectness algorithms based on [3]
 * [3] Cheng, Ming-Ming, et al. "BING: Binarized normed gradients for objectness estimation at 300fps." IEEE CVPR. 2014.
 */

/** \brief the Binarized normed gradients algorithm from \cite BING
 */
@Namespace("cv::saliency") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_saliency.opencv_saliency_presets.class)
public class ObjectnessBING extends Objectness {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjectnessBING(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ObjectnessBING(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ObjectnessBING position(long position) {
        return (ObjectnessBING)super.position(position);
    }


  public ObjectnessBING() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @Ptr ObjectnessBING create();

  public native @Cast("bool") boolean computeSaliency( @ByVal Mat image, @ByVal Mat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal UMat image, @ByVal UMat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal GpuMat image, @ByVal GpuMat saliencyMap );

  public native void read();
  public native void write();

  /** \brief Return the list of the rectangles' objectness value,
    <p>
    in the same order as the *vector\<Vec4i\> objectnessBoundingBox* returned by the algorithm (in
    computeSaliencyImpl function). The bigger value these scores are, it is more likely to be an
    object window.
     */
  public native @StdVector FloatPointer getobjectnessValues();

  /** \brief This is a utility function that allows to set the correct path from which the algorithm will load
    the trained model.
    @param trainingPath trained model path
     */
  public native void setTrainingPath( @Str BytePointer trainingPath );
  public native void setTrainingPath( @Str String trainingPath );

  /** \brief This is a utility function that allows to set an arbitrary path in which the algorithm will save the
    optional results
    <p>
    (ie writing on file the total number and the list of rectangles returned by objectess, one for
    each row).
    @param resultsDir results' folder path
     */
  public native void setBBResDir( @Str BytePointer resultsDir );
  public native void setBBResDir( @Str String resultsDir );

  public native double getBase();
  public native void setBase(double val);
  public native int getNSS();
  public native void setNSS(int val);
  public native int getW();
  public native void setW(int val);

}