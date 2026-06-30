package e0;

/* loaded from: classes14.dex */
public final class k0 implements e0.h0, s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i1 f245624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f245625b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f245626c;

    /* renamed from: d, reason: collision with root package name */
    public final float f245627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f245628e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245629f;

    /* renamed from: g, reason: collision with root package name */
    public final int f245630g;

    /* renamed from: h, reason: collision with root package name */
    public final int f245631h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f245632i;

    public k0(e0.i1 i1Var, int i17, boolean z17, float f17, s1.u0 measureResult, java.util.List visibleItemsInfo, int i18, int i19, int i27, boolean z18, b0.y1 orientation, int i28) {
        kotlin.jvm.internal.o.g(measureResult, "measureResult");
        kotlin.jvm.internal.o.g(visibleItemsInfo, "visibleItemsInfo");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        this.f245624a = i1Var;
        this.f245625b = i17;
        this.f245626c = z17;
        this.f245627d = f17;
        this.f245628e = visibleItemsInfo;
        this.f245629f = i18;
        this.f245630g = i19;
        this.f245631h = i27;
        this.f245632i = measureResult;
    }

    @Override // e0.h0
    public int a() {
        return this.f245631h;
    }

    @Override // e0.h0
    public java.util.List b() {
        return this.f245628e;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f245632i.c();
    }

    @Override // e0.h0
    public int d() {
        return this.f245629f;
    }

    @Override // s1.u0
    public void e() {
        this.f245632i.e();
    }

    @Override // e0.h0
    public int f() {
        return this.f245630g;
    }

    @Override // s1.u0
    public int getHeight() {
        return this.f245632i.getHeight();
    }

    @Override // s1.u0
    public int getWidth() {
        return this.f245632i.getWidth();
    }
}
