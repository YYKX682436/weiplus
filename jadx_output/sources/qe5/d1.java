package qe5;

/* loaded from: classes12.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qe5.n1 n1Var) {
        super(0);
        this.f362086d = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qe5.n1 n1Var = this.f362086d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.y());
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209725m);
            nVar.f306904c = false;
            nVar.f306905d = com.tencent.mm.ui.report.l.f209687h;
            Q62.B3(nVar);
        }
        return jz5.f0.f302826a;
    }
}
