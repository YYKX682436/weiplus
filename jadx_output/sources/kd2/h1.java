package kd2;

/* loaded from: classes2.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f306753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, kd2.p1 p1Var) {
        super(0);
        this.f306753d = feedUpdateEvent;
        this.f306754e = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f306753d;
        feedUpdateEvent.f54252g.getClass();
        am.ia iaVar = feedUpdateEvent.f54252g;
        if (iaVar.f6919b == 19) {
            kd2.p1 p1Var = this.f306754e;
            kd2.q0 q0Var = p1Var.C;
            java.lang.Long valueOf = (q0Var == null || (feedData = q0Var.f306806g) == null) ? null : java.lang.Long.valueOf(feedData.getLiveId());
            com.tencent.mars.xlog.Log.i("FinderVideoPassive", "feedChangeListener id:" + iaVar.f6918a + " liveId:" + valueOf + ", liveStatus:" + iaVar.f6925h);
            long j17 = iaVar.f6918a;
            if (j17 != 0 && valueOf != null && j17 == valueOf.longValue() && iaVar.f6925h == 2) {
                com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView k07 = p1Var.k0();
                k07.setContentDescription(k07.getResources().getString(com.tencent.mm.R.string.jp7));
                k07.isVideoEnd = true;
                k07.setMusicCtrlBtnStatus(false);
                kd2.q0 q0Var2 = p1Var.C;
                com.tencent.mm.plugin.finder.storage.FeedData feedData2 = q0Var2 != null ? q0Var2.f306806g : null;
                if (feedData2 != null) {
                    feedData2.setLiveStatus(2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
