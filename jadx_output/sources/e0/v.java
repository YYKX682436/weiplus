package e0;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0.f1 f1Var) {
        super(0);
        this.f245710d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int d17 = (this.f245710d.d() / 30) * 30;
        return e06.p.m(java.lang.Math.max(d17 - 100, 0), d17 + 30 + 100);
    }
}
