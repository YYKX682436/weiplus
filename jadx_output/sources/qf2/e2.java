package qf2;

/* loaded from: classes10.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(qf2.c3 c3Var, yz5.l lVar) {
        super(1);
        this.f362348d = c3Var;
        this.f362349e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorCancelVisitorBattle, result: ");
        sb6.append(booleanValue);
        sb6.append(", curBattle: ");
        qf2.c3 c3Var = this.f362348d;
        sb6.append(((mm2.o4) c3Var.business(mm2.o4.class)).Z);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", sb6.toString());
        if (booleanValue) {
            c3Var.f362312n = true;
            qf2.c3.b7(c3Var, "AnchorExit");
            db5.t7.h(c3Var.O6(), c3Var.O6().getResources().getString(com.tencent.mm.R.string.iqq));
        }
        yz5.l lVar = this.f362349e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f302826a;
    }
}
