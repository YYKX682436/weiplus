package dj4;

/* loaded from: classes10.dex */
public abstract class w {
    public static final void a(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new dj4.v(callback));
    }

    public static final android.graphics.Bitmap b(java.lang.String str) {
        android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(str);
        if (K != null) {
            int width = K.getWidth();
            int height = K.getHeight();
            boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
            int i17 = com.tencent.mm.sdk.platformtools.u1.f193003a.f193033a;
            if (width > i17) {
                K = com.tencent.mm.sdk.platformtools.x.k0(K, i17, K.getHeight(), true);
            } else if (height > i17) {
                K = com.tencent.mm.sdk.platformtools.x.k0(K, K.getWidth(), i17, true);
            }
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        return a17 == 0 ? K : com.tencent.mm.sdk.platformtools.x.z0(K, a17, 1.0f, 1.0f);
    }

    public static final void c(android.graphics.Bitmap bitmap, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (bitmap == null) {
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, path, false);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.StatusImgHandler", "save bitmap to image path:" + path + ", failed: " + e17);
        }
    }
}
