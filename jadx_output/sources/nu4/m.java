package nu4;

/* loaded from: classes7.dex */
public final class m implements lu4.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f340257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340259f;

    public m(java.lang.String str, java.lang.String str2, nu4.b0 b0Var) {
        this.f340258e = str2;
        this.f340259f = b0Var;
        this.f340257d = str;
    }

    @Override // lu4.w
    public java.lang.String getId() {
        return this.f340257d;
    }

    @Override // lu4.w
    public void m(int i17) {
        java.lang.String str = this.f340258e;
        nu4.b0 b0Var = this.f340259f;
        try {
            nu4.k kVar = nu4.b0.f340241J;
            ((com.tencent.mm.sdk.platformtools.o4) nu4.b0.L.i()).A(str + "-MinBizPkgVersion", i17);
            java.lang.String str2 = b0Var.C;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(b0Var.C, e17, "setMinBizPkgVersion:" + str + ", " + i17, new java.lang.Object[0]);
        }
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        this.f340259f.t(eventType, event, valueCallback);
    }
}
