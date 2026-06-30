package org.libpag;

/* loaded from: classes13.dex */
public class PAGLayer {
    public static final int LayerTypeImage = 5;
    public static final int LayerTypeNull = 1;
    public static final int LayerTypePreCompose = 6;
    public static final int LayerTypeShape = 4;
    public static final int LayerTypeSolid = 2;
    public static final int LayerTypeText = 3;
    public static final int LayerTypeUnknown = 0;
    protected long nativeContext;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGLayer(long j17) {
        this.nativeContext = j17;
    }

    private native void getTotalMatrix(float[] fArr);

    private native void matrix(float[] fArr);

    private native boolean nativeEquals(org.libpag.PAGLayer pAGLayer);

    private static native void nativeInit();

    private native void nativeRelease();

    private native void setMatrix(float[] fArr);

    public native long currentTime();

    public native long duration();

    public native int editableIndex();

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.libpag.PAGLayer) {
            return nativeEquals((org.libpag.PAGLayer) obj);
        }
        return false;
    }

    public native boolean excludedFromTimeline();

    public void finalize() {
        nativeRelease();
    }

    public native float frameRate();

    public native android.graphics.RectF getBounds();

    public native double getProgress();

    public android.graphics.Matrix getTotalMatrix() {
        float[] fArr = new float[9];
        getTotalMatrix(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public native long globalToLocalTime(long j17);

    public int hashCode() {
        long j17 = this.nativeContext;
        return ((int) (j17 ^ (j17 >>> 32))) + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX;
    }

    public native java.lang.String layerName();

    public native int layerType();

    public native long localTimeToGlobal(long j17);

    public native org.libpag.PAGMarker[] markers();

    public android.graphics.Matrix matrix() {
        float[] fArr = new float[9];
        matrix(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public native org.libpag.PAGComposition parent();

    public native void resetMatrix();

    public native void setCurrentTime(long j17);

    public native void setExcludedFromTimeline(boolean z17);

    public void setMatrix(android.graphics.Matrix matrix) {
        if (matrix == null) {
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        setMatrix(fArr);
    }

    public native void setProgress(double d17);

    public native void setStartTime(long j17);

    public native void setVisible(boolean z17);

    public native long startTime();

    public native org.libpag.PAGLayer trackMatteLayer();

    public native boolean visible();
}
