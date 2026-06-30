package gx0;

/* loaded from: classes5.dex */
public final class i9 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276533d;

    public i9(gx0.p9 p9Var) {
        this.f276533d = p9Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        gx0.p9 p9Var = this.f276533d;
        ex0.a0 a0Var = p9Var.u7().f276642r;
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "observeTimelineViewModelReady: timelineViewModel is null");
            return;
        }
        a0Var.f257115y.observe(p9Var.getActivity(), new gx0.h9(p9Var));
    }
}
