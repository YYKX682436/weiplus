package ml2;

/* loaded from: classes3.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final nm5.c a(so2.j5 rvFeed) {
        int i17;
        kotlin.jvm.internal.o.g(rvFeed, "rvFeed");
        boolean z17 = true;
        if (rvFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) rvFeed;
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            r2 = liveInfo != null ? liveInfo.getLong(0) : 0L;
            r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
            i17 = liveInfo2 != null ? liveInfo2.getInteger(1) : 0;
        } else {
            if (rvFeed instanceof so2.j1) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((so2.j1) rvFeed).f410439d;
                r45.nw1 liveInfo3 = finderObject.getLiveInfo();
                r2 = liveInfo3 != null ? liveInfo3.getLong(0) : 0L;
                r45.nw1 liveInfo4 = finderObject.getLiveInfo();
                i17 = liveInfo4 != null ? liveInfo4.getInteger(1) : 0;
                return nm5.j.d(java.lang.Long.valueOf(r2), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            }
            i17 = -1;
        }
        z17 = false;
        return nm5.j.d(java.lang.Long.valueOf(r2), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final java.lang.String b(so2.j5 rvFeed) {
        java.lang.String nickname;
        kotlin.jvm.internal.o.g(rvFeed, "rvFeed");
        return rvFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) rvFeed).getFeedObject().getNickName() : (!(rvFeed instanceof so2.j1) || (nickname = ((so2.j1) rvFeed).f410439d.getNickname()) == null) ? "" : nickname;
    }
}
