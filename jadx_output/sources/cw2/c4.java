package cw2;

/* loaded from: classes10.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f223615d = finderLivePlayView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData3;
        com.tencent.mm.plugin.finder.storage.FeedData feedData4;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f223615d;
        java.lang.Object obj = null;
        if (finderLivePlayView.f130621y0) {
            kd2.r1 r1Var = finderLivePlayView.f130598J;
            if (r1Var != null) {
                kd2.p1 p1Var = (kd2.p1) ((kd2.c0) r1Var).f306711a.f306724a;
                if (p1Var.M0()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLivePlayerPause, feedId: ");
                    kd2.q0 q0Var = p1Var.C;
                    if (q0Var != null && (feedData3 = q0Var.f306806g) != null) {
                        obj = java.lang.Long.valueOf(feedData3.getFeedId());
                    }
                    sb6.append(obj);
                    com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb6.toString());
                    p1Var.k0().setMusicCtrlBtnStatus(false);
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("currFeed mediaType: ");
                    kd2.q0 q0Var2 = p1Var.C;
                    if (q0Var2 != null && (feedData4 = q0Var2.f306806g) != null) {
                        obj = java.lang.Integer.valueOf(feedData4.getMediaType());
                    }
                    sb7.append(obj);
                    sb7.append(", not live feed");
                    com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb7.toString());
                }
            }
        } else {
            kd2.r1 r1Var2 = finderLivePlayView.f130598J;
            if (r1Var2 != null) {
                kd2.p1 p1Var2 = (kd2.p1) ((kd2.c0) r1Var2).f306711a.f306724a;
                if (p1Var2.M0()) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onLivePlayerPlay, feedId: ");
                    kd2.q0 q0Var3 = p1Var2.C;
                    if (q0Var3 != null && (feedData = q0Var3.f306806g) != null) {
                        obj = java.lang.Long.valueOf(feedData.getFeedId());
                    }
                    sb8.append(obj);
                    com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb8.toString());
                    p1Var2.k0().setMusicCtrlBtnStatus(true);
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("currFeed mediaType: ");
                    kd2.q0 q0Var4 = p1Var2.C;
                    if (q0Var4 != null && (feedData2 = q0Var4.f306806g) != null) {
                        obj = java.lang.Integer.valueOf(feedData2.getMediaType());
                    }
                    sb9.append(obj);
                    sb9.append(", not live feed");
                    com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb9.toString());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
