package te2;

/* loaded from: classes5.dex */
public final class t3 implements te2.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418427d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418428e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f418429f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView f418430g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f418431h;

    public t3(android.view.View root, com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, com.tencent.mm.ui.MMActivity activity, te2.n3 n3Var, gk2.e buContext) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f418427d = root;
        this.f418428e = activity;
        this.f418429f = buContext;
        this.f418430g = finderLiveGameWelfareTaskProgressView;
        if (finderLiveGameWelfareTaskProgressView != null) {
            finderLiveGameWelfareTaskProgressView.setOnClickListener(new te2.s3(this));
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418428e;
    }
}
