package th5;

/* loaded from: classes12.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f419415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f419416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f419417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.q f419418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(float f17, kotlin.jvm.internal.e0 e0Var, th5.p0 p0Var, th5.q qVar) {
        super(2);
        this.f419415d = f17;
        this.f419416e = e0Var;
        this.f419417f = p0Var;
        this.f419418g = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float f17 = this.f419415d;
            if (f17 > 0.0f) {
                float e17 = f17 * e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f);
                th5.o0.a(this.f419416e, this.f419417f, this.f419418g, e17);
            }
        }
        return jz5.f0.f302826a;
    }
}
