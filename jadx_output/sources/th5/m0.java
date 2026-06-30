package th5;

/* loaded from: classes12.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f419409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f419411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f419412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ th5.q f419413h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(float f17, float f18, kotlin.jvm.internal.e0 e0Var, th5.p0 p0Var, th5.q qVar) {
        super(2);
        this.f419409d = f17;
        this.f419410e = f18;
        this.f419411f = e0Var;
        this.f419412g = p0Var;
        this.f419413h = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float f17 = this.f419409d;
            if (f17 > 0.0f) {
                float e17 = this.f419410e + (f17 * e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f));
                th5.o0.a(this.f419411f, this.f419412g, this.f419413h, e17);
            }
        }
        return jz5.f0.f302826a;
    }
}
