package com.tencent.mm.svg;

/* loaded from: classes12.dex */
public class WeChatSVG {
    static {
        if (n95.b.b()) {
            java.util.Set set = fp.d0.f265166a;
            fp.b0.f265163a.b("wechatsvg");
            nativeInit();
        }
    }

    public static native float[] getViewPort(long j17);

    private static native void nativeInit();

    public static native long parse(java.lang.String str);

    public static native void release(long j17);

    public static native int render(long j17, android.graphics.Canvas canvas);

    public static native int renderViewPort(long j17, android.graphics.Canvas canvas, float f17, float f18);
}
