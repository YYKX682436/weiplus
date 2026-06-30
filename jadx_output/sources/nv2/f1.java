package nv2;

/* loaded from: classes2.dex */
public final class f1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.g1 f340487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340488b;

    public f1(nv2.g1 g1Var, nv2.o1 o1Var) {
        this.f340487a = g1Var;
        this.f340488b = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        r45.yz3 yz3Var;
        r45.zu0 zu0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.LikeActionTask", "LikeActionTask callback " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        int i17 = fVar.f70615a;
        nv2.o1 o1Var = this.f340488b;
        nv2.g1 g1Var = this.f340487a;
        if (i17 == 0 && fVar.f70616b == 0) {
            int likeCount = g1Var.f340491d.getLikeCount();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = g1Var.f340491d;
            int likeFlag = finderItem.getLikeFlag();
            int friendLikeCount = finderItem.getFriendLikeCount();
            boolean z17 = g1Var.f340494g;
            if (z17) {
                finderItem.setLikeCount(finderItem.getLikeCount() + (finderItem.getLikeFlag() != 0 ? 0 : 1));
            } else {
                finderItem.setLikeCount(finderItem.getLikeCount() + (finderItem.getLikeFlag() != 0 ? -1 : 0));
            }
            boolean z18 = g1Var.f340495h;
            if (likeFlag == 1 && (!z17 || z18)) {
                finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() - 1);
            } else if (likeFlag != 1 && z17 && !z18) {
                finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() + 1);
            }
            if (!z17 || z18) {
                nv2.n1.f340551h.o(finderItem.getLikeList());
            } else {
                nv2.n1.f340551h.a(finderItem.getLikeList());
            }
            finderItem.setLikeFlag((z17 && z18) ? 2 : z17 ? 1 : 0);
            com.tencent.mars.xlog.Log.i("Finder.LikeAction", "CgiFinderLikeFeed end likeFlag:" + finderItem.getLikeFlag() + " likeCount " + finderItem.getLikeCount() + " friendLikeCount:" + finderItem.getFriendLikeCount() + ",  " + likeFlag + ' ' + likeCount + ", oldFriendLikeCount:" + friendLikeCount);
            nv2.n1.f340551h.m(g1Var);
            o1Var.a(fp0.u.f265290f, false);
            r45.yz3 yz3Var2 = (r45.yz3) ((r45.rd1) fVar.f70618d).getCustom(2);
            if (yz3Var2 != null && (zu0Var = (r45.zu0) yz3Var2.getCustom(2)) != null) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((cq.k) c17).Vi(finderItem.getUserName(), zu0Var);
            }
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            am.ia iaVar = feedUpdateEvent.f54252g;
            long j17 = g1Var.f340492e;
            iaVar.f6918a = j17;
            iaVar.f6922e = (z17 && z18) ? 2 : z17 ? 1 : 0;
            iaVar.f6923f = finderItem.getLikeCount();
            iaVar.f6921d = 1;
            r45.yz3 yz3Var3 = (r45.yz3) ((r45.rd1) fVar.f70618d).getCustom(2);
            iaVar.f6928k = yz3Var3 != null ? yz3Var3.getInteger(0) : 0;
            r45.yz3 yz3Var4 = (r45.yz3) ((r45.rd1) fVar.f70618d).getCustom(2);
            if (yz3Var4 == null || (str = yz3Var4.getString(1)) == null) {
                str = "";
            }
            iaVar.f6929l = str;
            iaVar.f6919b = 4;
            feedUpdateEvent.e();
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = new com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent();
            java.lang.String u17 = pm0.v.u(j17);
            am.qm qmVar = onFinderFeedInfoUpdatedEvent.f54571g;
            qmVar.f7718a = u17;
            nv2.o oVar = nv2.o.f340558e;
            qmVar.f7722e = oVar.b(finderItem.getFeedObject());
            qmVar.f7721d = oVar.c(finderItem.getFeedObject());
            qmVar.f7720c = finderItem.getLikeCount();
            qmVar.f7719b = finderItem.getLikeFlag() != 0;
            onFinderFeedInfoUpdatedEvent.e();
            r45.rd1 rd1Var = (r45.rd1) fVar.f70618d;
            if (rd1Var != null && (yz3Var = (r45.yz3) rd1Var.getCustom(2)) != null) {
                nv2.e1.a(yz3Var, z17, j17, false);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Map b17 = com.tencent.mm.plugin.finder.convert.qe.U.b(finderItem);
            if (b17 != null) {
                linkedHashMap.putAll(b17);
            }
            java.util.Map b18 = com.tencent.mm.plugin.finder.report.d2.f124994a.b(g1Var.f340498k, null);
            if (b18 != null) {
                linkedHashMap.putAll(b18);
            }
            linkedHashMap.put("is_action_like", java.lang.Integer.valueOf(z17 ? 1 : 0));
            linkedHashMap.put("is_private", java.lang.Integer.valueOf(z18 ? 1 : 0));
            linkedHashMap.put("is_long_video", 0);
            linkedHashMap.put("old_like_count", java.lang.Integer.valueOf(likeCount));
            linkedHashMap.put("cur_like_count", java.lang.Integer.valueOf(finderItem.getFriendLikeCount()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_real_click", null, linkedHashMap, 24617);
        } else if (i17 == 4) {
            nv2.n1.f340551h.m(g1Var);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent2 = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            am.ia iaVar2 = feedUpdateEvent2.f54252g;
            iaVar2.f6918a = g1Var.f340492e;
            iaVar2.f6919b = 4;
            feedUpdateEvent2.e();
            o1Var.a(fp0.u.f265291g, false);
        } else {
            o1Var.a(fp0.u.f265291g, true);
        }
        return jz5.f0.f302826a;
    }
}
