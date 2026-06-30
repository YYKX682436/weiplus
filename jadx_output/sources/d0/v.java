package d0;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.r0 f225218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f225221h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.d f225222i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s1.o1 o1Var, s1.r0 r0Var, s1.x0 x0Var, int i17, int i18, z0.d dVar) {
        super(1);
        this.f225217d = o1Var;
        this.f225218e = r0Var;
        this.f225219f = x0Var;
        this.f225220g = i17;
        this.f225221h = i18;
        this.f225222i = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        d0.y.b(layout, this.f225217d, this.f225218e, this.f225219f.getLayoutDirection(), this.f225220g, this.f225221h, this.f225222i);
        return jz5.f0.f302826a;
    }
}
