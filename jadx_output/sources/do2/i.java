package do2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f242085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f242086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView f242087f;

    public i(r45.mb4 mb4Var, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView) {
        this.f242085d = mb4Var;
        this.f242086e = finderThumbPlayerProxy;
        this.f242087f = finderMegaVideoMiniView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mb4 mb4Var = this.f242085d;
        r45.gn2 gn2Var = (r45.gn2) mb4Var.getCustom(45);
        boolean z17 = gn2Var != null && gn2Var.getBoolean(1);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f242086e;
        if (z17) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.h0(finderThumbPlayerProxy, new cw2.t4((r45.gn2) mb4Var.getCustom(45), com.tencent.mm.pluginsdk.ui.e1.CROP), false, 2, null);
        }
        finderThumbPlayerProxy.setVideoViewCallback(this.f242087f.getVideoViewCallback());
        zy2.g5.u(finderThumbPlayerProxy, null, 1, null);
    }
}
