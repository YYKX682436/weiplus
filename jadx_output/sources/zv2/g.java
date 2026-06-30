package zv2;

/* loaded from: classes10.dex */
public final class g implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.m f476404a;

    public g(zv2.m mVar) {
        this.f476404a = mVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zv2.m mVar = this.f476404a;
        com.tencent.mars.xlog.Log.i("Finder.FinderChooseProductWidget", "onReceiveValue value" + str);
        try {
            so2.x4 x4Var = so2.z4.f410732k;
            kotlin.jvm.internal.o.d(str);
            so2.z4 a17 = x4Var.a(str, so2.a5.f410254d);
            mVar.f476397f = a17 != null ? a17.a() : null;
            mVar.f476419r = a17 != null ? a17.f410742j : null;
            mVar.f476412h = a17 != null ? a17.f410733a : null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderChooseProductWidget", th6, "", new java.lang.Object[0]);
            mVar.f476397f = null;
        }
        mVar.i(mVar.f476397f);
    }
}
