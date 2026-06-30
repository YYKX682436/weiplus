package qy0;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.z f367600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f367601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f367602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f367604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(d0.z zVar, ty0.b1 b1Var, boolean z17, yz5.a aVar, int i17) {
        super(2);
        this.f367600d = zVar;
        this.f367601e = b1Var;
        this.f367602f = z17;
        this.f367603g = aVar;
        this.f367604h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        qy0.a1.b(this.f367600d, this.f367601e, this.f367602f, this.f367603g, (n0.o) obj, this.f367604h | 1);
        return jz5.f0.f302826a;
    }
}
