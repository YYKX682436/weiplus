package qi2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.k0 f363529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(qi2.k0 k0Var) {
        super(0);
        this.f363529d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.l a17;
        qf2.y1 y1Var;
        fj2.s.f263183a.a(ml2.k1.f327638e);
        qi2.k0 k0Var = this.f363529d;
        zh2.c cVar = k0Var.f363553h;
        if (cVar != null && (a17 = cVar.a()) != null && (y1Var = (qf2.y1) a17.U0(qf2.y1.class)) != null) {
            y1Var.g7(true, new qi2.h0(k0Var));
        }
        return jz5.f0.f302826a;
    }
}
