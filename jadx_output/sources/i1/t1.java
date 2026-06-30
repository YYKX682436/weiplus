package i1;

/* loaded from: classes14.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.w1 f287039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f287041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f287042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.r f287043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f287044i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(i1.w1 w1Var, java.lang.String str, float f17, float f18, yz5.r rVar, int i17) {
        super(2);
        this.f287039d = w1Var;
        this.f287040e = str;
        this.f287041f = f17;
        this.f287042g = f18;
        this.f287043h = rVar;
        this.f287044i = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        this.f287039d.j(this.f287040e, this.f287041f, this.f287042g, this.f287043h, (n0.o) obj, this.f287044i | 1);
        return jz5.f0.f302826a;
    }
}
