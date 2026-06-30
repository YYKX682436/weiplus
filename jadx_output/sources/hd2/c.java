package hd2;

/* loaded from: classes10.dex */
public final class c implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f280454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f280455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f280456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f280457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f280458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f280459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f280462j;

    public c(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.ViewGroup viewGroup, android.widget.ProgressBar progressBar, android.widget.ImageView imageView, long j17, long j18, long j19, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.g0 g0Var) {
        this.f280453a = finderCommentShareDialogFragment;
        this.f280454b = viewGroup;
        this.f280455c = progressBar;
        this.f280456d = imageView;
        this.f280457e = j17;
        this.f280458f = j18;
        this.f280459g = j19;
        this.f280460h = str;
        this.f280461i = str2;
        this.f280462j = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("FinderCommentShareDialogFragment", "imageLoader: download:" + z17);
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        finderCommentResourceLoadingStruct.q(pm0.v.u(this.f280457e));
        finderCommentResourceLoadingStruct.p(pm0.v.u(this.f280458f));
        finderCommentResourceLoadingStruct.f56686f = 2L;
        finderCommentResourceLoadingStruct.f56687g = !z17 ? 1L : 0L;
        finderCommentResourceLoadingStruct.f56688h = java.lang.System.currentTimeMillis() - this.f280459g;
        finderCommentResourceLoadingStruct.f56689i = finderCommentResourceLoadingStruct.b("Url", this.f280460h, true);
        finderCommentResourceLoadingStruct.f56692l = finderCommentResourceLoadingStruct.b("Token", this.f280461i, true);
        finderCommentResourceLoadingStruct.f56690j = this.f280462j.f310121d;
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, z17 ? 2L : 3L, 1L, false);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
        this.f280453a.getClass();
        pm0.v.X(new hd2.a(z17, this.f280454b, this.f280456d, this.f280455c));
    }
}
