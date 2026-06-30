package f0;

/* loaded from: classes5.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f258111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f0.r1 r1Var, kotlinx.coroutines.y0 y0Var) {
        super(1);
        this.f258110d = r1Var;
        this.f258111e = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        f0.r1 r1Var = this.f258110d;
        if (intValue >= 0 && intValue < r1Var.f().a()) {
            kotlinx.coroutines.l.d(this.f258111e, null, null, new f0.g2(r1Var, intValue, null), 3, null);
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + r1Var.f().a() + ')').toString());
    }
}
