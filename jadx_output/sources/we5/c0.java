package we5;

/* loaded from: classes9.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ we5.n0 f445316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rd5.d f445317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f445318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, we5.n0 n0Var, rd5.d dVar2, android.os.Bundle bundle) {
        super(1);
        this.f445314d = f9Var;
        this.f445315e = dVar;
        this.f445316f = n0Var;
        this.f445317g = dVar2;
        this.f445318h = bundle;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.io ioVar = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        boolean a17 = com.tencent.mm.app.plugin.k.a();
        yb5.d dVar = this.f445315e;
        java.lang.String str = null;
        if (a17) {
            com.tencent.mm.storage.f9 f9Var = this.f445314d;
            if (f9Var.i2() && f9Var.b2()) {
                str = f9Var.W0();
            }
            ioVar = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).v0(f9Var);
        }
        java.lang.String str2 = str;
        this.f445316f.f0(it, this.f445317g, this.f445318h, str2, ioVar);
        this.f445316f.V(it, this.f445317g, dVar.t(), dVar.D(), this.f445315e, this.f445316f);
        return jz5.f0.f302826a;
    }
}
