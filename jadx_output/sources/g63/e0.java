package g63;

/* loaded from: classes8.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g63.f0 f0Var) {
        super(2);
        this.f269102d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g63.t0 t0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List result = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        g63.f0 f0Var = this.f269102d;
        if (booleanValue) {
            g63.j jVar = f0Var.f269107b;
            jVar.getClass();
            pm0.v.X(new g63.i(jVar, result));
            g63.t0 t0Var2 = f0Var.f269106a;
            if (t0Var2 != null) {
                ((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var2).T6().f1753e.N(result.size());
            }
            if (result.size() < 10 && (t0Var = f0Var.f269106a) != null) {
                ((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var).f141992h = false;
            }
        } else {
            g63.t0 t0Var3 = f0Var.f269106a;
            if (t0Var3 != null) {
                pm0.v.X(new g63.l0((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var3));
            }
        }
        return jz5.f0.f302826a;
    }
}
