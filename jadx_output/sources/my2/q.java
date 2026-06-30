package my2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(my2.u uVar) {
        super(0);
        this.f332759d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        my2.u uVar = this.f332759d;
        com.tencent.mars.xlog.Log.i(uVar.f332765f, "forceUpdateBubble");
        r45.me2 me2Var = ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328784b6;
        if (me2Var == null) {
            com.tencent.mars.xlog.Log.i(uVar.f332765f, "update wording votingInfo is null");
            qo0.c.a(uVar.f332764e, qo0.b.f365439y2, null, 2, null);
        } else if (me2Var.getInteger(3) < 0 || !(me2Var.getInteger(4) == 1 || me2Var.getInteger(4) == 1)) {
            my2.b bVar = uVar.f332766g;
            if (bVar != null) {
                ((my2.y) bVar).F(new my2.p(uVar));
            }
        } else {
            my2.b bVar2 = uVar.f332766g;
            if (bVar2 != null) {
                ((my2.y) bVar2).G(new my2.o(uVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
