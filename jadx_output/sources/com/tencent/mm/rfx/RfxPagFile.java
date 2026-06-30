package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagFile extends com.tencent.mm.rfx.RfxPagComposition {
    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    private RfxPagFile(long j17) {
        super(j17);
    }

    public static com.tencent.mm.rfx.RfxPagFile Load(java.lang.String str) {
        return LoadFromPath(str);
    }

    private static native com.tencent.mm.rfx.RfxPagFile LoadFromAssets(android.content.res.AssetManager assetManager, java.lang.String str);

    private static native com.tencent.mm.rfx.RfxPagFile LoadFromBytes(byte[] bArr, int i17, java.lang.String str);

    private static native com.tencent.mm.rfx.RfxPagFile LoadFromPath(java.lang.String str);

    private static final native void nativeInit();

    public native java.lang.String analyze();

    public native com.tencent.mm.rfx.RfxPagFile copyOriginal();

    public native int[] getEditableIndices(int i17);

    public native com.tencent.mm.rfx.RfxPagLayer[] getLayersByEditableIndex(int i17, int i18);

    public native com.tencent.mm.rfx.RfxPagText getTextData(int i17);

    public native void nativeReplaceImage(int i17, long j17);

    public native int numImages();

    public native int numTexts();

    public native int numVideos();

    public native java.lang.String path();

    public void replaceImage(int i17, com.tencent.mm.rfx.RfxPagImage rfxPagImage) {
        if (rfxPagImage == null) {
            nativeReplaceImage(i17, 0L);
        } else {
            nativeReplaceImage(i17, rfxPagImage.nativeContext);
        }
    }

    public native void replaceText(int i17, com.tencent.mm.rfx.RfxPagText rfxPagText);

    public native void resetTextforAllTextLayersWithName(java.lang.String str);

    public native void setDuration(long j17);

    public native void setTextforAllTextLayersWithName(java.lang.String str, java.lang.String str2);

    public native void setTimeStretchMode(int i17);

    public native int timeStretchMode();

    public static com.tencent.mm.rfx.RfxPagFile Load(byte[] bArr) {
        return LoadFromBytes(bArr, bArr.length, "");
    }

    public static com.tencent.mm.rfx.RfxPagFile Load(android.content.res.AssetManager assetManager, java.lang.String str) {
        return LoadFromAssets(assetManager, str);
    }
}
