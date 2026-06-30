package e0;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f245699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(e0.f1 f1Var, kotlinx.coroutines.y0 y0Var) {
        super(1);
        this.f245698d = f1Var;
        this.f245699e = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        e0.f1 f1Var = this.f245698d;
        if (intValue >= 0 && intValue < f1Var.f().a()) {
            kotlinx.coroutines.l.d(this.f245699e, null, null, new e0.r1(f1Var, intValue, null), 3, null);
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + f1Var.f().a() + ')').toString());
    }
}
