package f0;

/* loaded from: classes10.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f258075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(boolean z17, kotlinx.coroutines.y0 y0Var, f0.r1 r1Var) {
        super(2);
        this.f258074d = z17;
        this.f258075e = y0Var;
        this.f258076f = r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        if (this.f258074d) {
            floatValue = floatValue2;
        }
        kotlinx.coroutines.l.d(this.f258075e, null, null, new f0.e2(this.f258076f, floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
