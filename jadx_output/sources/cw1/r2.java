package cw1;

/* loaded from: classes12.dex */
public final class r2 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f223286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f223287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f223288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f223289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f223291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f223292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f223293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223294i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f223295j;

    public r2(java.util.List list, byte[] bArr, long j17, long j18, int i17, com.tencent.mm.ui.widget.dialog.u3 u3Var, cw1.o0 o0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI, boolean z17) {
        this.f223286a = list;
        this.f223287b = bArr;
        this.f223288c = j17;
        this.f223289d = j18;
        this.f223290e = i17;
        this.f223291f = u3Var;
        this.f223292g = o0Var;
        this.f223293h = h0Var;
        this.f223294i = cleanCacheUI;
        this.f223295j = z17;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
    }

    @Override // aw1.w
    public void b(boolean z17, long j17, int i17) {
        if (z17) {
            return;
        }
        if (!this.f223286a.isEmpty()) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Aa(this.f223286a);
        }
        if (this.f223287b[6] != Byte.MAX_VALUE) {
            ft.w3 w3Var = (ft.w3) i95.n0.c(ft.w3.class);
            w3Var.getClass();
            ((com.tencent.mm.plugin.appbrand.j0) w3Var).wi("ACTION_CLEAN_APPBRAND_COMMON_SPACE", false);
            ft.w3 w3Var2 = (ft.w3) i95.n0.c(ft.w3.class);
            w3Var2.getClass();
            ((com.tencent.mm.plugin.appbrand.j0) w3Var2).wi("ACTION_CLEAN_ALL_APPBRAND_SPACE", false);
        }
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent aggressiveCleanCacheEvent = new com.tencent.mm.autogen.events.AggressiveCleanCacheEvent();
        aggressiveCleanCacheEvent.f53972g.f7202a = this.f223290e;
        aggressiveCleanCacheEvent.e();
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.q2(this.f223291f, this.f223292g, this.f223287b, this.f223293h, this.f223294i, this.f223289d, this.f223295j));
        mt1.b0.s(4, java.lang.System.currentTimeMillis() - this.f223288c, java.lang.Long.valueOf(this.f223289d));
    }
}
