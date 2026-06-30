package e0;

/* loaded from: classes14.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(e0.f1 f1Var) {
        super(0);
        this.f245643d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e0.f1 f1Var = this.f245643d;
        return java.lang.Float.valueOf(f1Var.d() + (f1Var.e() / 100000.0f));
    }
}
