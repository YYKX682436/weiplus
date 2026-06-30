package nv2;

/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: g, reason: collision with root package name */
    public static final nv2.h1 f340550g = new nv2.h1(null);

    /* renamed from: h, reason: collision with root package name */
    public static final nv2.n1 f340551h = new nv2.n1();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f340552a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_like_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f340553b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f340554c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f340555d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f340556e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f340557f;

    public n1() {
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.finder.storage.u90) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39131v).getValue()).y0()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.storage.t90 t90Var = (com.tencent.mm.plugin.finder.storage.t90) it.next();
                this.f340556e.put(java.lang.Long.valueOf(t90Var.field_localId), t90Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLikeActionMgr", th6, "restoreLocalLikeFeed", new java.lang.Object[0]);
        }
        this.f340553b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f340554c = new java.util.concurrent.ConcurrentHashMap();
        this.f340555d = new java.util.concurrent.ConcurrentHashMap();
        this.f340556e = new java.util.HashMap();
        this.f340557f = new nv2.m1(this);
    }

    public static void c(nv2.n1 n1Var, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, boolean z18, int i17, int i18, nv2.i1 i1Var, r45.qt2 contextObj, java.lang.String str, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        int i27 = (i19 & 16) != 0 ? 0 : i18;
        nv2.i1 i1Var2 = (i19 & 32) != 0 ? null : i1Var;
        java.lang.String str2 = (i19 & 128) != 0 ? "" : str;
        r45.bc1 bc1Var2 = (i19 & 256) != 0 ? null : bc1Var;
        n1Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeActionMgr", "dolike " + feed.getUserName() + ' ' + z17);
        long j17 = feed.field_id;
        nv2.g1 g1Var = new nv2.g1(feed, j17, feed.getObjectNonceId(), z17, z18, i17, i27, i1Var2, contextObj, bc1Var2);
        g1Var.f340500m = str2 != null ? str2 : "";
        n1Var.f340554c.put(java.lang.Long.valueOf(j17), g1Var);
        n1Var.f(g1Var);
    }

    public final void a(java.util.LinkedList newList) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(newList, "newList");
        synchronized (newList) {
            java.util.Iterator it = newList.iterator();
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
                newList.add(0, finderCommentInfo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.f340616h == nv2.x1.f340626d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r6.f340616h == nv2.x1.f340626d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(long r6, com.tencent.mm.plugin.finder.storage.yj0 r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "commentObj"
            kotlin.jvm.internal.o.g(r8, r0)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            int r6 = r8.getLikeCount()
            return r6
        L10:
            int r0 = r8.getLikeFlag()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            com.tencent.mm.plugin.finder.storage.t70 r3 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r3 = r3.j()
            java.lang.Object r3 = r3.r()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.util.concurrent.ConcurrentHashMap r4 = r5.f340555d
            if (r3 == r2) goto L58
            int r3 = com.tencent.mm.plugin.finder.storage.t70.M
            if (r3 != r2) goto L58
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.get(r6)
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            if (r6 == 0) goto L7c
            nv2.j1 r7 = new nv2.j1
            long r3 = r8.t0()
            r7.<init>(r3, r2, r2)
            java.lang.Object r6 = r6.get(r7)
            nv2.w1 r6 = (nv2.w1) r6
            if (r6 == 0) goto L7c
            nv2.x1 r7 = nv2.x1.f340626d
            nv2.x1 r6 = r6.f340616h
            if (r6 != r7) goto L7d
        L56:
            r1 = r2
            goto L7d
        L58:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.get(r6)
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            if (r6 == 0) goto L7c
            nv2.j1 r7 = new nv2.j1
            long r3 = r8.t0()
            r7.<init>(r3, r9, r2)
            java.lang.Object r6 = r6.get(r7)
            nv2.w1 r6 = (nv2.w1) r6
            if (r6 == 0) goto L7c
            nv2.x1 r7 = nv2.x1.f340626d
            nv2.x1 r6 = r6.f340616h
            if (r6 != r7) goto L7d
            goto L56
        L7c:
            r1 = r0
        L7d:
            if (r0 == 0) goto L87
            if (r0 == r1) goto L87
            int r6 = r8.getLikeCount()
            int r6 = r6 - r2
            return r6
        L87:
            if (r0 != 0) goto L91
            if (r0 == r1) goto L91
            int r6 = r8.getLikeCount()
            int r6 = r6 + r2
            return r6
        L91:
            int r6 = r8.getLikeCount()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.n1.b(long, com.tencent.mm.plugin.finder.storage.yj0, int):int");
    }

    public final void d(long j17, java.lang.String str, java.lang.String objectNonceId, com.tencent.mm.plugin.finder.storage.yj0 comment, nv2.x1 likeType, int i17, nv2.i1 i1Var, r45.qt2 contextObj, boolean z17, com.tencent.mm.protobuf.g gVar, int i18, java.lang.String str2) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(likeType, "likeType");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeActionMgr", "doLikeBullet " + j17 + " comment:" + comment + " likeType:" + likeType + " scene " + i17);
        e(j17, str, objectNonceId, comment, likeType, i17, i1Var, contextObj, z17, gVar, i18, str2);
    }

    public final void e(long j17, java.lang.String str, java.lang.String objectNonceId, com.tencent.mm.plugin.finder.storage.yj0 comment, nv2.x1 likeType, int i17, nv2.i1 i1Var, r45.qt2 contextObj, boolean z17, com.tencent.mm.protobuf.g gVar, int i18, java.lang.String str2) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(likeType, "likeType");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeActionMgr", "doLikeComment " + j17 + " comment:" + comment + " likeType:" + likeType + " scene " + i17);
        nv2.w1 w1Var = new nv2.w1(j17, str, objectNonceId, comment, likeType, i17, i1Var, contextObj, z17, gVar, i18, str2);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f340555d;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentHashMap()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.concurrent.ConcurrentHashMap) obj).put(new nv2.j1(comment.t0(), i17, nv2.r1.a(likeType)), w1Var);
        f(w1Var);
    }

    public final void f(nv2.r rVar) {
        this.f340552a.b(new nv2.q1(rVar), new nv2.k1(this, rVar));
    }

    public final int g(com.tencent.mm.protocal.protobuf.FinderObject feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.m2().r()).booleanValue() && feed.getId() != 0) {
            boolean z17 = false;
            boolean z18 = feed.getLikeFlag() == 1;
            nv2.g1 g1Var = (nv2.g1) this.f340554c.get(java.lang.Long.valueOf(feed.getId()));
            if (g1Var == null) {
                z17 = z18;
            } else if (g1Var.f340494g && !g1Var.f340495h) {
                z17 = true;
            }
            return (!z18 || z18 == z17) ? (z18 || z18 == z17) ? feed.getFriendLikeCount() : feed.getFriendLikeCount() + 1 : feed.getFriendLikeCount() - 1;
        }
        return feed.getFriendLikeCount();
    }

    public final java.util.LinkedList h(com.tencent.mm.protocal.protobuf.FinderObject feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.m2().r()).booleanValue()) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = feed.getLikeList();
            kotlin.jvm.internal.o.f(likeList, "getLikeList(...)");
            return likeList;
        }
        if (feed.getId() == 0) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList2 = feed.getLikeList();
            kotlin.jvm.internal.o.f(likeList2, "getLikeList(...)");
            return likeList2;
        }
        boolean z17 = false;
        boolean z18 = feed.getLikeFlag() == 1;
        nv2.g1 g1Var = (nv2.g1) this.f340554c.get(java.lang.Long.valueOf(feed.getId()));
        if (g1Var == null) {
            z17 = z18;
        } else if (g1Var.f340494g && !g1Var.f340495h) {
            z17 = true;
        }
        if (z18 && z18 != z17) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList3 = feed.getLikeList();
            kotlin.jvm.internal.o.f(likeList3, "getLikeList(...)");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(likeList3);
            o(linkedList);
            return linkedList;
        }
        if (z18 || z18 == z17) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList4 = feed.getLikeList();
            kotlin.jvm.internal.o.f(likeList4, "getLikeList(...)");
            return likeList4;
        }
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList5 = feed.getLikeList();
        kotlin.jvm.internal.o.f(likeList5, "getLikeList(...)");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(likeList5);
        a(linkedList2);
        return linkedList2;
    }

    public final boolean i(long j17, com.tencent.mm.plugin.finder.storage.yj0 commentObj, int i17) {
        nv2.w1 w1Var;
        boolean z17;
        nv2.w1 w1Var2;
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.getLikeFlag() == 1;
        }
        boolean z18 = commentObj.getLikeFlag() == 1;
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f340555d;
        if (intValue == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
            if (concurrentHashMap2 != null && (w1Var = (nv2.w1) concurrentHashMap2.get(new nv2.j1(commentObj.t0(), i17, 1))) != null) {
                nv2.x1 x1Var = nv2.x1.f340626d;
                nv2.x1 x1Var2 = w1Var.f340616h;
                z17 = x1Var2 == x1Var;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" get from cache ");
                sb6.append(x1Var2);
                sb6.append(' ');
                z18 = z17;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return z18;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (concurrentHashMap3 != null && (w1Var2 = (nv2.w1) concurrentHashMap3.get(new nv2.j1(commentObj.t0(), 1, 1))) != null) {
            nv2.x1 x1Var3 = nv2.x1.f340626d;
            nv2.x1 x1Var4 = w1Var2.f340616h;
            z17 = x1Var4 == x1Var3;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" get from cache ");
            sb7.append(x1Var4);
            sb7.append(' ');
            z18 = z17;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z18;
    }

    public final boolean j(long j17, com.tencent.mm.plugin.finder.storage.yj0 commentObj) {
        nv2.w1 w1Var;
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        if (j17 == 0) {
            return commentObj.u0().getRecommend_flag() == 1;
        }
        boolean z17 = commentObj.u0().getRecommend_flag() == 1;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f340555d.get(java.lang.Long.valueOf(j17));
        if (concurrentHashMap != null && (w1Var = (nv2.w1) concurrentHashMap.get(new nv2.j1(commentObj.t0(), 2, 9))) != null) {
            nv2.x1 x1Var = nv2.x1.f340629g;
            nv2.x1 x1Var2 = w1Var.f340616h;
            boolean z18 = x1Var2 == x1Var;
            java.util.Objects.toString(x1Var2);
            z17 = z18;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z17;
    }

    public final jz5.l k(com.tencent.mm.protocal.protobuf.FinderObject feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.m2().r()).booleanValue()) {
            return new jz5.l(java.lang.Boolean.valueOf(feed.getLikeFlag() != 0), java.lang.Boolean.valueOf(feed.getLikeFlag() == 2));
        }
        if (feed.getId() == 0) {
            return new jz5.l(java.lang.Boolean.valueOf(feed.getLikeFlag() != 0), java.lang.Boolean.valueOf(feed.getLikeFlag() == 2));
        }
        boolean z17 = feed.getLikeFlag() != 0;
        boolean z18 = feed.getLikeFlag() == 2;
        nv2.g1 g1Var = (nv2.g1) this.f340554c.get(java.lang.Long.valueOf(feed.getId()));
        if (g1Var != null) {
            z17 = g1Var.f340494g;
            z18 = g1Var.f340495h;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    public final int l(com.tencent.mm.protocal.protobuf.FinderObject f17) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        kotlin.jvm.internal.o.g(f17, "f");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) t70Var.m2().r()).booleanValue() && f17.getId() != 0) {
            if ((((java.lang.Number) t70Var.w0().r()).intValue() == 1) && (h17 = bu2.j.f24534a.h(f17.getId())) != null && (feedObject = h17.getFeedObject()) != null) {
                f17 = feedObject;
            }
            boolean z17 = f17.getLikeFlag() != 0;
            nv2.g1 g1Var = (nv2.g1) this.f340554c.get(java.lang.Long.valueOf(f17.getId()));
            boolean z18 = g1Var != null ? g1Var.f340494g : z17;
            return (!z17 || z17 == z18) ? (z17 || z17 == z18) ? f17.getLikeCount() : f17.getLikeCount() + 1 : f17.getLikeCount() - 1;
        }
        return f17.getLikeCount();
    }

    public final void m(nv2.g1 action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f340554c;
        long j17 = action.f340492e;
        nv2.g1 g1Var = (nv2.g1) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (g1Var != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (action.f340575c >= g1Var.f340575c) {
                concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    public final void n(nv2.w1 action, int i17) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f340555d.get(java.lang.Long.valueOf(action.f340612d));
        if (concurrentHashMap != null) {
            nv2.j1 j1Var = new nv2.j1(action.f340615g.t0(), action.f340617i, i17);
            nv2.w1 w1Var = (nv2.w1) concurrentHashMap.get(j1Var);
            if (w1Var != null) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (action.f340575c >= w1Var.f340575c) {
                    concurrentHashMap.remove(j1Var);
                }
            }
        }
    }

    public final void o(java.util.LinkedList newList) {
        kotlin.jvm.internal.o.g(newList, "newList");
        pm0.v.d0(newList, nv2.l1.f340538d);
    }

    public final void p() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f340553b;
        nv2.r rVar = (nv2.r) concurrentLinkedQueue.poll();
        if (rVar == null) {
            return;
        }
        boolean b17 = rVar.b();
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeActionMgr", "tryNext isValid:" + b17 + " action:" + rVar + " size:" + concurrentLinkedQueue.size());
        if (b17) {
            f(rVar);
        } else {
            p();
        }
    }
}
