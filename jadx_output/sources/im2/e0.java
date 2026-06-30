package im2;

/* loaded from: classes3.dex */
public final class e0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292302a;

    public e0(im2.z3 z3Var) {
        this.f292302a = z3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        im2.z3 z3Var = this.f292302a;
        com.tencent.mars.xlog.Log.i(z3Var.f292635d, "#goMiniApp callback=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        z3Var.f292672z1 = null;
        cl0.e f17 = new cl0.g(str).f(ya.b.COUPON);
        if (f17 != null) {
            cl0.g k17 = f17.k(0);
            java.lang.String optString = k17.optString("stockId");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            if (optString.length() > 0) {
                im2.r rVar = new im2.r();
                java.lang.String optString2 = k17.optString("stockId");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                rVar.f292512a = optString2;
                java.lang.String optString3 = k17.optString("stockName");
                kotlin.jvm.internal.o.f(optString3, "optString(...)");
                rVar.f292513b = optString3;
                z3Var.f292672z1 = rVar;
            }
        }
        android.widget.TextView detailView = z3Var.Z6().getDetailView();
        im2.s sVar = z3Var.f292672z1;
        im2.r rVar2 = sVar instanceof im2.r ? (im2.r) sVar : null;
        detailView.setText(rVar2 != null ? rVar2.f292513b : null);
    }
}
