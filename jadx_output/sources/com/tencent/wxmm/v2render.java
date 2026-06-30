package com.tencent.wxmm;

/* loaded from: classes.dex */
public class v2render {
    private byte _hellAccFlag_;
    public float mBrightness = 1.2f;
    public float mContrast = 1.93f;
    public float mSaturation = 1.05f;
    public final int MSG_RENDER = 0;
    public final int MSG_FLUSH = 1;
    public final int MSG_RESET = 2;
    public final int FLAG_RGBA = 0;
    public final int FLAG_RGBAClip = 1;
    public final int FLAG_YV12 = 0;
    public final int FLAG_YV12Edge = 1;
    public final int FLAG_NV12 = 2;
    public final int FLAG_NV21 = 3;
    public final int FLAG_Angle90 = 4;
    public final int FLAG_Angle270 = 12;
    public final int FLAG_Mirror = 16;
    public final int RenderLocal = 0;
    public final int RenderRemote = 1;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipGLRender");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static int getGLVersion() {
        return 2;
    }

    public native void Init(int i17, java.lang.Object obj, int i18);

    public native void Uninit(int i17);

    public native void render32(int[] iArr, int i17, int i18, int i19, int i27);

    public native void render8(byte[] bArr, int i17, int i18, int i19, int i27);

    public native void setMode(int i17, int i18, int i19, int i27);

    public native void setParam(float f17, float f18, float f19, int i17);
}
