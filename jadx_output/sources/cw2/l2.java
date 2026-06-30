package cw2;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(1);
        this.f223827d = finderFullSeekBarLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" onSeekActio ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f223827d.H;
        sb6.append((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getDebugDescription());
        com.tencent.mars.xlog.Log.i("Finder.FullSeekBarLayout", sb6.toString());
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223827d;
        finderFullSeekBarLayout.R = -1;
        wu5.c hideSeekbarTask = finderFullSeekBarLayout.getHideSeekbarTask();
        if (hideSeekbarTask != null) {
            hideSeekbarTask.cancel(false);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout2 = this.f223827d;
        ku5.u0 u0Var = ku5.t0.f312615d;
        cw2.k2 k2Var = new cw2.k2(this.f223827d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        finderFullSeekBarLayout2.setHideSeekbarTask(t0Var.z(k2Var, 5000L, false));
        return jz5.f0.f302826a;
    }
}
