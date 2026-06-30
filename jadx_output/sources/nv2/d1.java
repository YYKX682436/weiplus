package nv2;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final nv2.d1 f340475b = new nv2.d1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.g2 f340476a = new com.tencent.mm.plugin.finder.assist.g2(30);

    public static void a(nv2.d1 d1Var, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, int i17, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 t21Var, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        int i27 = (i19 & 16) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 32) != 0 ? null : str;
        r45.t21 newLifeReportInfo = (i19 & 64) != 0 ? new r45.t21() : t21Var;
        r45.bc1 bc1Var2 = (i19 & 128) != 0 ? null : bc1Var;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        com.tencent.mars.xlog.Log.i("Finder.InteractActionMgr", "modFavStatus id:" + ((java.lang.Object) jz5.x.a(feed.getId())) + ' ' + feed.getUserName() + ' ' + z17);
        int favCount = feed.getFavCount();
        int favFlag = feed.getFavFlag();
        d1Var.d(feed, z17);
        nv2.m0 m0Var = new nv2.m0(feed, favFlag, favCount, z17, contextObj, d1Var);
        com.tencent.mm.plugin.finder.assist.g2.a(d1Var.f340476a, 600L, "feedFav_" + feed.getId() + '_' + feed.getObjectNonceId() + '_' + i17, new nv2.l0(feed, z17, contextObj, str2, i17, i27, newLifeReportInfo, bc1Var2, m0Var), null, kotlinx.coroutines.q1.f310570c, 8, null);
    }

    public static void b(nv2.d1 d1Var, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, boolean z18, int i17, int i18, r45.qt2 contextObj, java.lang.String str, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        int i27 = (i19 & 16) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 64) != 0 ? "" : str;
        r45.bc1 bc1Var2 = (i19 & 128) != 0 ? null : bc1Var;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        int likeCount = feed.getLikeCount();
        int likeFlag = feed.getLikeFlag();
        d1Var.e(feed, z17, z18);
        nv2.v0 v0Var = new nv2.v0(feed, likeFlag, likeCount, z17, contextObj, z18, d1Var);
        db2.c5 c5Var = new db2.c5(feed.getId(), feed.getDupFlag(), feed.getObjectNonceId(), z17, z18, i17, i27, feed.getEncryptedObjectId(), str2, bc1Var2);
        com.tencent.mm.plugin.finder.assist.g2.a(d1Var.f340476a, 600L, "feedLike_" + feed.getId() + '_' + feed.getObjectNonceId() + '_' + i17, new nv2.u0(c5Var, contextObj, v0Var), null, kotlinx.coroutines.q1.f310570c, 8, null);
    }

    public static void c(nv2.d1 d1Var, boolean z17, long j17, java.lang.String wxUsername, int i17, int i18, java.lang.String finderUsername, r45.qt2 qt2Var, boolean z18, r45.nv2 nv2Var, int i19, java.lang.Object obj) {
        boolean z19 = (i19 & 128) != 0 ? true : z18;
        r45.nv2 nv2Var2 = (i19 & 256) != 0 ? null : nv2Var;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        db2.k6 k6Var = new db2.k6(z17, finderUsername, wxUsername, i17, i18, null, java.lang.Long.valueOf(j17), nv2Var2, 32, null);
        k6Var.a(false);
        if (z19) {
            new db2.t3(k6Var, qt2Var).l().K(new nv2.y0(k6Var));
        }
        com.tencent.mm.plugin.finder.assist.g2.a(d1Var.f340476a, 600L, "{" + i17 + "}_" + j17, new nv2.a1(k6Var, qt2Var), null, null, 24, null);
    }

    public final void d(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17) {
        int favCount;
        int i17;
        r45.pm2 pm2Var;
        r45.ll2 ll2Var;
        r45.jn2 jn2Var;
        r45.pm2 pm2Var2;
        r45.ll2 ll2Var2;
        r45.jn2 jn2Var2;
        if (z17) {
            favCount = finderItem.getFavCount();
            if (finderItem.getFavFlag() != 1) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            favCount = finderItem.getFavCount();
            if (finderItem.getFavFlag() == 1) {
                i17 = -1;
            }
            i17 = 0;
        }
        int i18 = favCount + i17;
        nv2.b1 b1Var = nv2.b1.f340456d;
        b1Var.invoke(finderItem, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderItem.getExpectId());
        if (h17 != null) {
            r45.dm2 object_extend = h17.getFeedObject().getObject_extend();
            long j17 = -1;
            long j18 = (object_extend == null || (pm2Var2 = (r45.pm2) object_extend.getCustom(12)) == null || (ll2Var2 = (r45.ll2) pm2Var2.getCustom(0)) == null || (jn2Var2 = (r45.jn2) ll2Var2.getCustom(4)) == null) ? -1L : jn2Var2.getLong(0);
            r45.dm2 object_extend2 = finderItem.getFeedObject().getObject_extend();
            if (object_extend2 != null && (pm2Var = (r45.pm2) object_extend2.getCustom(12)) != null && (ll2Var = (r45.ll2) pm2Var.getCustom(0)) != null && (jn2Var = (r45.jn2) ll2Var.getCustom(4)) != null) {
                j17 = jn2Var.getLong(0);
            }
            if (j18 == j17) {
                b1Var.invoke(h17, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i18));
            }
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long id6 = finderItem.getId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = id6;
        iaVar.f6920c = z17 ? 1 : 2;
        iaVar.f6921d = 1;
        iaVar.f6919b = 5;
        feedUpdateEvent.e();
        com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = new com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent();
        java.lang.String u17 = pm0.v.u(finderItem.getId());
        am.qm qmVar = onFinderFeedInfoUpdatedEvent.f54571g;
        qmVar.f7718a = u17;
        qmVar.f7722e = finderItem.getFavCount();
        qmVar.f7721d = finderItem.getFavFlag() == 1;
        qmVar.f7720c = finderItem.getLikeCount();
        qmVar.f7719b = finderItem.getLikeFlag() != 0;
        onFinderFeedInfoUpdatedEvent.e();
    }

    public final void e(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, boolean z18) {
        int likeCount;
        int i17;
        java.lang.Object obj;
        if (z17) {
            likeCount = finderItem.getLikeCount();
            if (finderItem.getLikeFlag() == 0) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            likeCount = finderItem.getLikeCount();
            if (finderItem.getLikeFlag() != 0) {
                i17 = -1;
            }
            i17 = 0;
        }
        finderItem.setLikeCount(likeCount + i17);
        if (finderItem.getLikeFlag() == 1 && (!z17 || z18)) {
            finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() - 1);
        } else if (finderItem.getLikeFlag() != 1 && z17 && !z18) {
            finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() + 1);
        }
        if (!z17 || z18) {
            pm0.v.d0(finderItem.getLikeList(), nv2.c1.f340468d);
        } else {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = finderItem.getLikeList();
            java.util.Iterator<T> it = likeList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj).getUsername(), c01.z1.r())) {
                        break;
                    }
                }
            }
            if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj) == null) {
                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
                finderCommentInfo.setUsername(c01.z1.r());
                finderCommentInfo.setNickname(c01.z1.l());
                finderCommentInfo.setHeadUrl("");
                likeList.add(0, finderCommentInfo);
            }
        }
        finderItem.setLikeFlag((z17 && z18) ? 2 : z17 ? 1 : 0);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long id6 = finderItem.getId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = id6;
        iaVar.f6922e = (z17 && z18) ? 2 : z17 ? 1 : 0;
        iaVar.f6923f = finderItem.getLikeCount();
        iaVar.f6921d = 1;
        iaVar.f6919b = 4;
        feedUpdateEvent.e();
        com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = new com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent();
        java.lang.String u17 = pm0.v.u(finderItem.getId());
        am.qm qmVar = onFinderFeedInfoUpdatedEvent.f54571g;
        qmVar.f7718a = u17;
        qmVar.f7720c = finderItem.getLikeCount();
        qmVar.f7719b = finderItem.getLikeFlag() != 0;
        onFinderFeedInfoUpdatedEvent.e();
    }
}
