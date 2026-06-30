package rn2;

/* loaded from: classes3.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(rn2.t2 t2Var) {
        super(2);
        this.f397805d = t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rn2.f fVar;
        rn2.b bVar = (rn2.b) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        rn2.t2 t2Var = this.f397805d;
        if (bVar != null && (fVar = t2Var.f397854f) != null) {
            ((rn2.c1) fVar).B(bVar.f397646c);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = t2Var.M;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", "choosePrizeSource " + bVar + ", pos:" + intValue);
        return jz5.f0.f302826a;
    }
}
