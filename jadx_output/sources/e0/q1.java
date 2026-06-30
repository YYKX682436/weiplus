package e0;

/* loaded from: classes10.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f245690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f245691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z17, kotlinx.coroutines.y0 y0Var, e0.f1 f1Var) {
        super(2);
        this.f245690d = z17;
        this.f245691e = y0Var;
        this.f245692f = f1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        if (this.f245690d) {
            floatValue = floatValue2;
        }
        kotlinx.coroutines.l.d(this.f245691e, null, null, new e0.p1(this.f245692f, floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
