package ro2;

/* loaded from: classes2.dex */
public final class b implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398029g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398030h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398031i;

    public b(com.tencent.mm.plugin.finder.convert.qe qeVar, android.view.View view, in5.s0 s0Var, int i17, int i18, boolean z17) {
        this.f398026d = qeVar;
        this.f398027e = view;
        this.f398028f = s0Var;
        this.f398029g = i17;
        this.f398030h = i18;
        this.f398031i = z17;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f398026d.K1(this.f398027e, 8);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.I0().r()).booleanValue()) {
            this.f398026d.K1(this.f398027e, 8);
        }
        ro2.r.g(this.f398028f);
        ro2.r.i(this.f398026d, this.f398028f, this.f398029g, this.f398030h, this.f398031i, false);
    }
}
