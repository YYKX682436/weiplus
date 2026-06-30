package nv2;

/* loaded from: classes2.dex */
public final class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.z1 f340637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340638b;

    public y1(nv2.z1 z1Var, nv2.o1 o1Var) {
        this.f340637a = z1Var;
        this.f340638b = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.pm2 pm2Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            nv2.z1 z1Var = this.f340637a;
            int likeCount = z1Var.f340491d.getLikeCount();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = z1Var.f340491d;
            int likeFlag = finderItem.getLikeFlag();
            int friendLikeCount = finderItem.getFriendLikeCount();
            r45.dm2 object_extend = finderItem.getFeedObject().getObject_extend();
            r45.wm2 wm2Var = (object_extend == null || (pm2Var = (r45.pm2) object_extend.getCustom(12)) == null) ? null : (r45.wm2) pm2Var.getCustom(10);
            boolean z17 = z1Var.f340494g;
            int i17 = 0;
            if (z17) {
                int i18 = finderItem.getLikeFlag() != 0 ? 0 : 1;
                finderItem.setLikeCount(finderItem.getLikeCount() + i18);
                if (wm2Var != null) {
                    wm2Var.set(1, java.lang.Integer.valueOf(wm2Var.getInteger(1) + i18));
                }
            } else {
                int i19 = finderItem.getLikeFlag() != 0 ? -1 : 0;
                finderItem.setLikeCount(finderItem.getLikeCount() + i19);
                if (wm2Var != null) {
                    wm2Var.set(1, java.lang.Integer.valueOf(wm2Var.getInteger(1) + i19));
                }
            }
            boolean z18 = z1Var.f340495h;
            if (likeFlag == 1 && (!z17 || z18)) {
                finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() - 1);
                if (wm2Var != null) {
                    wm2Var.set(2, java.lang.Integer.valueOf(wm2Var.getInteger(2) - 1));
                }
            } else if (likeFlag != 1 && z17 && !z18) {
                finderItem.setFriendLikeCount(finderItem.getFriendLikeCount() + 1);
                if (wm2Var != null) {
                    wm2Var.set(2, java.lang.Integer.valueOf(wm2Var.getInteger(2) + 1));
                }
            }
            if (!z17 || z18) {
                nv2.n1 n1Var = nv2.n1.f340551h;
                n1Var.o(finderItem.getLikeList());
                if (wm2Var != null && (list = wm2Var.getList(3)) != null) {
                    n1Var.o(list);
                }
            } else {
                nv2.n1 n1Var2 = nv2.n1.f340551h;
                n1Var2.a(finderItem.getLikeList());
                if (wm2Var != null && (list2 = wm2Var.getList(3)) != null) {
                    n1Var2.a(list2);
                }
            }
            finderItem.setLikeFlag((z17 && z18) ? 2 : z17 ? 1 : 0);
            if (wm2Var != null) {
                wm2Var.set(0, java.lang.Integer.valueOf((z17 && z18) ? 2 : z17 ? 1 : 0));
            }
            com.tencent.mars.xlog.Log.i("Finder.LikeLiveAction", "CgiFinderLiveLike end likeFlag:" + finderItem.getLikeFlag() + " likeCount " + finderItem.getLikeCount() + " friendLikeCount:" + finderItem.getFriendLikeCount() + ",  " + likeFlag + ' ' + likeCount + ", oldFriendLikeCount:" + friendLikeCount);
            nv2.n1.f340551h.m(z1Var);
            this.f340638b.a(fp0.u.f265290f, false);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6918a = z1Var.f340492e;
            if (z17 && z18) {
                i17 = 2;
            } else if (z17) {
                i17 = 1;
            }
            iaVar.f6922e = i17;
            iaVar.f6923f = finderItem.getLikeCount();
            iaVar.f6921d = 1;
            iaVar.f6919b = 4;
            feedUpdateEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
