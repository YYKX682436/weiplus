package f0;

/* loaded from: classes14.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(f0.r1 r1Var) {
        super(0);
        this.f258005d = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f0.r1 r1Var = this.f258005d;
        return java.lang.Float.valueOf(r1Var.d() + (r1Var.e() / 100000.0f));
    }
}
