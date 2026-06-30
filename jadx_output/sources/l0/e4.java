package l0;

/* loaded from: classes14.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f314168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f314169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314171h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(long j17, a2.o1 o1Var, java.lang.Float f17, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f314167d = j17;
        this.f314168e = o1Var;
        this.f314169f = f17;
        this.f314170g = pVar;
        this.f314171h = i17;
        this.f314172i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        l0.h4.b(this.f314167d, this.f314168e, this.f314169f, this.f314170g, (n0.o) obj, this.f314171h | 1, this.f314172i);
        return jz5.f0.f302826a;
    }
}
