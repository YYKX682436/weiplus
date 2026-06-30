package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagComposition extends com.tencent.mm.rfx.RfxPagLayer {
    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagComposition(long j17) {
        super(j17);
    }

    private static native void nativeInit();

    public native java.nio.ByteBuffer audioBytes();

    public native com.tencent.mm.rfx.RfxPagMarker[] audioMarkers();

    public native long audioStartTime();

    public native com.tencent.mm.rfx.RfxPagLayer getLayerAt(int i17);

    public native int getLayerIndex(com.tencent.mm.rfx.RfxPagLayer rfxPagLayer);

    public native com.tencent.mm.rfx.RfxPagLayer[] getLayersByName(java.lang.String str);

    public native int height();

    public native int numChildren();

    public native void setLayerIndex(com.tencent.mm.rfx.RfxPagLayer rfxPagLayer, int i17);

    public native int width();
}
