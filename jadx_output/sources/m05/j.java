package m05;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f322571d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f322572e;

    public j(com.tencent.mm.network.l0 l0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f322571d = l0Var;
        this.f322572e = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String uri;
        java.lang.String uri2;
        com.tencent.mm.network.l0 l0Var = this.f322571d;
        if (l0Var != null) {
            l0Var.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        }
        if (!((v0Var == null || (uri2 = v0Var.getUri()) == null || !r26.n0.B(uri2, "mmpay-bin", false)) ? false : true) == true || i18 == 0 || i19 == 0) {
            return;
        }
        if (((v0Var == null || (uri = v0Var.getUri()) == null || !uri.equals("/cgi-bin/mmpay-bin/cpucardgetconfig2")) ? false : true) == true && kotlin.jvm.internal.o.b("autoauth_errmsg_", str)) {
            com.tencent.mars.xlog.Log.w("WcPayReport", "ignore bad case");
            return;
        }
        v0Var.getUri();
        java.lang.String uri3 = v0Var.getUri();
        kotlin.jvm.internal.o.f(uri3, "getUri(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append(':');
        sb6.append(i19);
        java.lang.String errorCode = sb6.toString();
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "1", uri3, errorCode, str, "", java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) <= 1.0f ? 0 : 1));
    }
}
