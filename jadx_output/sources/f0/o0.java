package f0;

/* loaded from: classes14.dex */
public final class o0 implements f0.l0, s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.w1 f258172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f258173b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f258174c;

    /* renamed from: d, reason: collision with root package name */
    public final float f258175d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f258176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f258178g;

    public o0(f0.w1 w1Var, int i17, boolean z17, float f17, s1.u0 measureResult, java.util.List visibleItemsInfo, int i18, int i19, int i27, boolean z18, b0.y1 orientation, int i28) {
        kotlin.jvm.internal.o.g(measureResult, "measureResult");
        kotlin.jvm.internal.o.g(visibleItemsInfo, "visibleItemsInfo");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        this.f258172a = w1Var;
        this.f258173b = i17;
        this.f258174c = z17;
        this.f258175d = f17;
        this.f258176e = visibleItemsInfo;
        this.f258177f = i27;
        this.f258178g = measureResult;
    }

    @Override // f0.l0
    public int a() {
        return this.f258177f;
    }

    @Override // f0.l0
    public java.util.List b() {
        return this.f258176e;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f258178g.c();
    }

    @Override // s1.u0
    public void e() {
        this.f258178g.e();
    }

    @Override // s1.u0
    public int getHeight() {
        return this.f258178g.getHeight();
    }

    @Override // s1.u0
    public int getWidth() {
        return this.f258178g.getWidth();
    }
}
