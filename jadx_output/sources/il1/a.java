package il1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f292028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.c0 f292029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.widget.c0 c0Var2) {
        super(0);
        this.f292028d = c0Var;
        this.f292029e = c0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.o6 t37;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f292028d;
        if (c0Var != null && (t37 = c0Var.t3()) != null && (l0Var = t37.H2) != null && (f0Var = l0Var.f91198d) != null) {
            f0Var.Z(this.f292029e, null, true);
        }
        return jz5.f0.f302826a;
    }
}
