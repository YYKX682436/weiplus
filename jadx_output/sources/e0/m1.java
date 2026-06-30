package e0;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.s f245651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(e0.f1 f1Var, e0.s sVar) {
        super(0);
        this.f245650d = f1Var;
        this.f245651e = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float d17;
        float e17;
        e0.f1 f1Var = this.f245650d;
        if (f1Var.f245589o) {
            e17 = ((e0.u) this.f245651e).e();
            d17 = 1.0f;
        } else {
            d17 = f1Var.d();
            e17 = f1Var.e() / 100000.0f;
        }
        return java.lang.Float.valueOf(e17 + d17);
    }
}
