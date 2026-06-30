package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f209191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.c f209193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f209194h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.d f209195i;

    public b(com.tencent.mm.ui.mmfb.sdk.d dVar, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, com.tencent.mm.ui.mmfb.sdk.c cVar, java.lang.Object obj) {
        this.f209195i = dVar;
        this.f209190d = str;
        this.f209191e = bundle;
        this.f209192f = str2;
        this.f209193g = cVar;
        this.f209194h = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.mmfb.sdk.c cVar = this.f209193g;
        try {
            ((v61.o0) cVar).a(this.f209195i.f209196a.f(this.f209190d, this.f209191e, this.f209192f), this.f209194h);
        } catch (java.io.FileNotFoundException e17) {
            v61.o0 o0Var = (v61.o0) cVar;
            o0Var.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "onFileNotFoundException");
            v61.q0.a(o0Var.f433467a, 2, e17.getMessage());
        } catch (java.net.MalformedURLException e18) {
            v61.o0 o0Var2 = (v61.o0) cVar;
            o0Var2.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "onMalformedURLException");
            v61.q0.a(o0Var2.f433467a, 2, e18.getMessage());
        } catch (java.io.IOException e19) {
            v61.o0 o0Var3 = (v61.o0) cVar;
            o0Var3.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "onIOException");
            v61.q0.a(o0Var3.f433467a, 2, e19.getMessage());
        }
    }
}
