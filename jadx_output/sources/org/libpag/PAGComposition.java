package org.libpag;

/* loaded from: classes13.dex */
public class PAGComposition extends org.libpag.PAGLayer {
    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGComposition(long j17) {
        super(j17);
    }

    public static native org.libpag.PAGComposition Make(int i17, int i18);

    private static native void nativeInit();

    public native void addLayer(org.libpag.PAGLayer pAGLayer);

    public native void addLayerAt(org.libpag.PAGLayer pAGLayer, int i17);

    public native java.nio.ByteBuffer audioBytes();

    public native org.libpag.PAGMarker[] audioMarkers();

    public native long audioStartTime();

    public native boolean contains(org.libpag.PAGLayer pAGLayer);

    public native org.libpag.PAGLayer getLayerAt(int i17);

    public native int getLayerIndex(org.libpag.PAGLayer pAGLayer);

    public native org.libpag.PAGLayer[] getLayersByName(java.lang.String str);

    public native org.libpag.PAGLayer[] getLayersUnderPoint(float f17, float f18);

    public native int height();

    public native int numChildren();

    public native void removeAllLayers();

    public native org.libpag.PAGLayer removeLayer(org.libpag.PAGLayer pAGLayer);

    public native org.libpag.PAGLayer removeLayerAt(int i17);

    public native void setContentSize(int i17, int i18);

    public native void setLayerIndex(org.libpag.PAGLayer pAGLayer, int i17);

    public native void swapLayer(org.libpag.PAGLayer pAGLayer, org.libpag.PAGLayer pAGLayer2);

    public native void swapLayerAt(int i17, int i18);

    public native int width();
}
