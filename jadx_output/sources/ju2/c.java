package ju2;

/* loaded from: classes2.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f301809a;

    public c(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f301809a = baseFinderFeed;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f301809a;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = baseFinderFeed.getFeedObject().getFeedObject().getLikeList();
        java.lang.String g07 = likeList != null ? kz5.n0.g0(likeList, "#", null, null, 0, null, ju2.b.f301808d, 30, null) : null;
        jz5.l[] lVarArr = new jz5.l[4];
        nv2.o oVar = nv2.o.f340558e;
        lVarArr[0] = new jz5.l("finger_like_cnt", java.lang.Integer.valueOf(nv2.o.f340558e.b(baseFinderFeed.getFeedObject().getFeedObject())));
        nv2.h1 h1Var = nv2.n1.f340550g;
        lVarArr[1] = new jz5.l("like_cnt", java.lang.Integer.valueOf(nv2.n1.f340551h.l(baseFinderFeed.getFeedObject().getFeedObject())));
        if (g07 == null) {
            g07 = "";
        }
        lVarArr[2] = new jz5.l("thx_to_uin", g07);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        return kz5.c1.l(lVarArr);
    }
}
