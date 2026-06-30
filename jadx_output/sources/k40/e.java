package k40;

/* loaded from: classes8.dex */
public final class e implements l92.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303964a;

    public e(yz5.l lVar) {
        this.f303964a = lVar;
    }

    @Override // l92.a
    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
    }

    @Override // l92.a
    public int b() {
        return 3930;
    }

    @Override // l92.a
    public void c(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
        if (i17 == 0 && i18 == 0) {
            this.f303964a.invoke(resp);
        }
    }
}
