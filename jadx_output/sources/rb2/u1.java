package rb2;

/* loaded from: classes10.dex */
public final class u1 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f393782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f393783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f393784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393787h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393788i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f393789j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f393790k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f393792m;

    public u1(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, long j19, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.jvm.internal.g0 g0Var) {
        this.f393780a = z2Var;
        this.f393781b = s0Var;
        this.f393782c = j17;
        this.f393783d = j18;
        this.f393784e = j60Var;
        this.f393785f = viewGroup;
        this.f393786g = view;
        this.f393787h = view2;
        this.f393788i = view3;
        this.f393789j = j19;
        this.f393790k = h0Var;
        this.f393791l = str;
        this.f393792m = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "imageLoader: download:" + z17);
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        finderCommentResourceLoadingStruct.q(pm0.v.u(this.f393783d));
        finderCommentResourceLoadingStruct.p(pm0.v.u(this.f393782c));
        finderCommentResourceLoadingStruct.f56686f = 2L;
        finderCommentResourceLoadingStruct.f56687g = !z17 ? 1L : 0L;
        finderCommentResourceLoadingStruct.f56688h = java.lang.System.currentTimeMillis() - this.f393789j;
        finderCommentResourceLoadingStruct.f56689i = finderCommentResourceLoadingStruct.b("Url", (java.lang.String) this.f393790k.f310123d, true);
        finderCommentResourceLoadingStruct.f56692l = finderCommentResourceLoadingStruct.b("Token", this.f393791l, true);
        finderCommentResourceLoadingStruct.f56690j = this.f393792m.f310121d;
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, z17 ? 2L : 3L, 1L, false);
        rb2.z2 z2Var = this.f393780a;
        in5.s0 s0Var = this.f393781b;
        long j17 = this.f393782c;
        long j18 = this.f393783d;
        r45.j60 j60Var = this.f393784e;
        android.view.ViewGroup loadLayout = this.f393785f;
        kotlin.jvm.internal.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f393786g;
        kotlin.jvm.internal.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f393787h;
        kotlin.jvm.internal.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f393788i;
        kotlin.jvm.internal.o.f(loadFailText, "$loadFailText");
        rb2.z2.B(z2Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, z17);
    }
}
