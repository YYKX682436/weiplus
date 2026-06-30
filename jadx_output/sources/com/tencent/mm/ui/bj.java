package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class bj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SplashWelcomeView f197977e;

    public bj(com.tencent.mm.ui.SplashWelcomeView splashWelcomeView, java.lang.String str) {
        this.f197977e = splashWelcomeView;
        this.f197976d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.SplashWelcomeView splashWelcomeView;
        if (!com.tencent.mm.vfs.w6.j(this.f197976d)) {
            com.tencent.mars.xlog.Log.i("SplashWelcomeView", "cannot find %s", this.f197976d);
            return;
        }
        try {
            try {
                java.lang.String str = this.f197976d;
                byte[] N = com.tencent.mm.vfs.w6.N(str, 0, (int) com.tencent.mm.vfs.w6.k(str));
                if (N != null && N.length > 0) {
                    com.tencent.mm.ui.SplashWelcomeView splashWelcomeView2 = this.f197977e;
                    int length = N.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(N);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/SplashWelcomeView$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/SplashWelcomeView$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    splashWelcomeView2.f197094g = decodeByteArray;
                    com.tencent.mars.xlog.Log.i("SplashWelcomeView", "ready to play animation, hasDrawed %s", java.lang.Boolean.valueOf(this.f197977e.f197091d));
                    this.f197977e.f197093f = true;
                }
                splashWelcomeView = this.f197977e;
                if (!splashWelcomeView.f197091d) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("SplashWelcomeView", e17, "decode new welcome image error: %s", e17.getMessage());
                splashWelcomeView = this.f197977e;
                if (!splashWelcomeView.f197091d) {
                    return;
                }
            }
            splashWelcomeView.d();
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.SplashWelcomeView splashWelcomeView3 = this.f197977e;
            if (splashWelcomeView3.f197091d) {
                splashWelcomeView3.d();
            }
            throw th6;
        }
    }
}
