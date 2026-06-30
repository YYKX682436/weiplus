package of1;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f345059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.a0 f345061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(of1.v0 v0Var, java.lang.String str, of1.a0 a0Var) {
        super(0);
        this.f345059d = v0Var;
        this.f345060e = str;
        this.f345061f = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        of1.a0 a0Var = this.f345061f;
        java.lang.String str = this.f345060e;
        of1.v0 v0Var = this.f345059d;
        try {
            java.lang.String Z = v0Var.Z();
            java.lang.String str2 = v0Var.E;
            java.lang.String D1 = v0Var.D1();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLoadUrl(url:");
            sb6.append(str);
            sb6.append("), viewHash:");
            com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("mView");
                throw null;
            }
            sb6.append(oVar.hashCode());
            sb6.append(", currentUrl:");
            sb6.append(Z);
            sb6.append(", commitUrl:");
            sb6.append(str2);
            sb6.append(", hasStartCalled:");
            sb6.append(v0Var.f181915J);
            sb6.append(", isFirstGetA8KeyResponded:");
            sb6.append(a0Var.f344884a);
            com.tencent.mars.xlog.Log.i(D1, sb6.toString());
            if (v0Var.f181915J) {
                of1.y yVar = new of1.y(str, Z, v0Var);
                if (a0Var.f344884a) {
                    yVar.invoke();
                } else {
                    a0Var.f344885b.addLast(yVar);
                }
            } else {
                of1.v0.C1(v0Var, str);
            }
            v0Var.f345027f2 = str;
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            v0Var.f345027f2 = str;
            throw th6;
        }
    }
}
