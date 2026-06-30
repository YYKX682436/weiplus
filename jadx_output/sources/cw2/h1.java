package cw2;

/* loaded from: classes2.dex */
public final class h1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView f223738a;

    public h1(com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView finderFullSeeLaterView) {
        this.f223738a = finderFullSeeLaterView;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView finderFullSeeLaterView = this.f223738a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = finderFullSeeLaterView.getFeed();
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((feed == null || (feedObject3 = feed.getFeedObject()) == null) ? 0L : feedObject3.getId()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed2 = finderFullSeeLaterView.getFeed();
        if (feed2 == null || (feedObject = feed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str2 = feedObject2.getSessionBuffer()) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        lVarArr[2] = new jz5.l("click_playpercent", java.lang.Float.valueOf(finderFullSeeLaterView.getPlayPercent()));
        return kz5.c1.k(lVarArr);
    }
}
