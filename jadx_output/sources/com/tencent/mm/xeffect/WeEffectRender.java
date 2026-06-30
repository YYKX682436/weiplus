package com.tencent.mm.xeffect;

/* loaded from: classes14.dex */
public class WeEffectRender {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f214802a = 0;

    static {
        tq5.k.a("xlabeffect");
    }

    public static void a(long j17, long j18, com.tencent.mm.xeffect.IWeEffectCallback iWeEffectCallback) {
        if (iWeEffectCallback != null) {
            com.tencent.mm.xeffect.WeEffectCallbackMgr.INSTANCE.setCallback(j17, j18, iWeEffectCallback);
            nSetEffectCallback(j17, j18, iWeEffectCallback);
        } else {
            com.tencent.mm.xeffect.WeEffectCallbackMgr.INSTANCE.setCallback(j17, j18, null);
            nSetEffectCallback(j17, j18, null);
        }
    }

    public static void b(long j17, com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback) {
        com.tencent.mm.xeffect.WeJsonMessageCallbackMgr.INSTANCE.setCallback(j17, iWeJsonMessageCallback);
        nSetJsonMessageCallback(j17, iWeJsonMessageCallback);
    }

    public static native long[] nAddEffectMaterialsFolder(long j17, java.lang.String str);

    public static native long nAddFaceAutoSlimer(long j17, java.lang.String str);

    public static native long nCreateFilter(long j17, java.lang.String str, float f17);

    public static native long nCreateFilterWithConfig(long j17, java.lang.String str);

    public static native long nCreateMakeUp(long j17, int i17, java.lang.String str);

    public static native long nCreateSticker(long j17, int i17, java.lang.String str);

    public static native void nDestroy(long j17);

    public static native void nEnableSkinSeg(long j17, boolean z17);

    public static native java.util.ArrayList<java.util.HashSet<java.lang.Integer>> nExportAction(long j17);

    public static native int nFaceTrack(long j17, java.nio.Buffer buffer, int i17, int i18, long j18);

    public static native int nFaceTrackWithAngle(long j17, java.nio.Buffer buffer, int i17, int i18, long j18, int i19);

    public static native android.graphics.RectF[] nGetFaceRect(long j17);

    public static native int nGetImageLabel(long j17);

    public static native int nGetResourceType(long j17, long j18);

    public static native int nGetSdkVersion();

    public static native int nGetSegmentTexture(long j17);

    public static native long nInit(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18);

    public static native java.lang.String nInitSettings(long j17, java.lang.String str, java.lang.String[] strArr);

    public static native long nInitWithMap(java.lang.String[] strArr, int i17, java.lang.String str, boolean z17, boolean z18, boolean z19, int i18, boolean z27);

    public static native boolean nNeedFaceTrack(long j17);

    public static native int nReceiveJsonMessage(long j17, long j18, java.lang.String str, int i17, int i18);

    public static native void nRemoveFilter(long j17, long j18);

    public static native int nRemoveResource(long j17, long j18);

    public static native int nRenderToBuffer(long j17, byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, boolean z17);

    public static native int nRenderToTexture(long j17, int i17, int i18, int i19, int i27, int i28, boolean z17, boolean z18);

    public static native int nRenderToTexture2(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, boolean z18, int i39, boolean z19);

    public static native int nRenderToTextureOutputRotate(long j17, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, boolean z18);

    public static native void nResetAnim(long j17, long j18);

    public static native void nSetAnim(long j17, long j18, int i17);

    public static native void nSetBeautyDeFaceWrinkle(long j17, float f17, float f18);

    public static native int nSetBeautySharpenFilter(long j17, float f17);

    public static native int nSetConfigFlags(long j17, java.lang.String str, float f17);

    public static native void nSetCustomSegmentSticker(long j17, int i17, int i18, int i19);

    public static native void nSetEffectCallback(long j17, long j18, com.tencent.mm.xeffect.IWeEffectCallback iWeEffectCallback);

    public static native int nSetEffectLevel(long j17, int i17, float f17, int i18);

    public static native void nSetFilterColorWeight(long j17, long j18, float f17);

    public static native void nSetFocalLength(long j17, float f17);

    private static native void nSetJsonMessageCallback(long j17, com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback);

    public static native void nSetMakeUpAlpha(long j17, long j18, float f17);

    public static native void nSetMakeupGlobalAlpha(long j17, float f17);

    public static native void nSetMouthMorph(long j17, float f17);

    public static native void nSetNativeLog(long j17);

    public static native void nSetRenderTextureCropSize(long j17, float f17);

    public static native void nSetSegment(long j17, boolean z17, int i17, int i18, int i19);

    public static native void nSetSegmentBgBlur(long j17, boolean z17, float f17, int i17);

    public static native int nSetSlimerRate(long j17, long j18, float f17);

    public static native void nSetTeethBright(long j17, float f17);

    public static native void nSetupReport(long j17, boolean z17);

    public static native void nShowDebugInfo(long j17, int i17, boolean z17);

    public static native int nTrackImageLabel(long j17, java.nio.Buffer buffer, int i17, int i18);

    public static native void nUpdateAnim(long j17, long j18);

    public static native void nUpdateSticker(long j17);
}
