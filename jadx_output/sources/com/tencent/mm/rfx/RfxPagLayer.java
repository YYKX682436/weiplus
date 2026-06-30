package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagLayer {
    public static final int LayerTypeImage = 5;
    public static final int LayerTypeNull = 1;
    public static final int LayerTypePreCompose = 6;
    public static final int LayerTypeShape = 4;
    public static final int LayerTypeSolid = 2;
    public static final int LayerTypeText = 3;
    public static final int LayerTypeUnknown = 0;
    protected long nativeContext;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagLayer(long j17) {
        this.nativeContext = j17;
    }

    private native boolean nativeEquals(com.tencent.mm.rfx.RfxPagLayer rfxPagLayer);

    private static native void nativeInit();

    private native void nativeRelease();

    public native long duration();

    public native int editableIndex();

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.tencent.mm.rfx.RfxPagLayer) {
            return nativeEquals((com.tencent.mm.rfx.RfxPagLayer) obj);
        }
        return false;
    }

    public void finalize() {
        nativeRelease();
    }

    public native float frameRate();

    public int hashCode() {
        long j17 = this.nativeContext;
        return ((int) (j17 ^ (j17 >>> 32))) + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX;
    }

    public native java.lang.String layerName();

    public native int layerType();

    public native long startTime();
}
