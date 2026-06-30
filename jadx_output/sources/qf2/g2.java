package qf2;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar) {
        super(1);
        this.f362384d = c3Var;
        this.f362385e = u4Var;
        this.f362386f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "anchorFinishVisitorBattle, result: " + booleanValue + ", curBattle: " + ((mm2.o4) this.f362384d.business(mm2.o4.class)).Z + ' ');
        if (booleanValue) {
            this.f362385e.f234156c = 0;
        }
        yz5.l lVar = this.f362386f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f302826a;
    }
}
