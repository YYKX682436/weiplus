package cq;

@j95.b
/* loaded from: classes2.dex */
public final class k extends i95.w {

    /* renamed from: n, reason: collision with root package name */
    public static final cq.e f221221n = new cq.e(null);

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f221222o;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f221223d = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f221224e = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f221225f = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: g, reason: collision with root package name */
    public final dq.b f221226g = new dq.b();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.c2 f221227h = new com.tencent.mm.plugin.finder.playlist.c2();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f221228i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.data.dataservice.FinderDataService$beforeCleanCacheListener$1 f221229m;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f221222o = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sf).getValue()).r()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.data.dataservice.FinderDataService$beforeCleanCacheListener$1] */
    public k() {
        final gm0.b bVar = gm0.j1.b().f273245h;
        this.f221229m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(bVar) { // from class: com.tencent.mm.data.dataservice.FinderDataService$beforeCleanCacheListener$1
            {
                this.__eventId = 1489935310;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if ((event.f53999g.f7589a & 32) == 0) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("FinderDataService", "onBeforeCleanCache clear interaction easter egg");
                cq.k kVar = cq.k.this;
                kVar.f221226g.c(null);
                kVar.f221226g.b(null);
                return false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.finder.storage.FinderItem wi(cq.k r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
        /*
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = r4
        L6:
            if (r1 == 0) goto L11
            r0.getClass()
            int r3 = r1.length()
            if (r3 != 0) goto L12
        L11:
            r4 = 1
        L12:
            if (r4 == 0) goto L15
            goto L24
        L15:
            com.tencent.mm.sdk.platformtools.c0 r3 = r0.f221224e
            java.lang.Object r1 = r3.b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L24
            long r3 = r1.longValue()
            goto L26
        L24:
            r3 = 0
        L26:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.Ai(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.k.wi(cq.k, java.lang.String, int, int, java.lang.Object):com.tencent.mm.plugin.finder.storage.FinderItem");
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem Ai(long j17, int i17) {
        cq.f fVar;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (h17 != null && i17 != 0 && f221222o) {
            java.lang.String str = i17 + '_' + pm0.v.u(h17.getId());
            com.tencent.mm.sdk.platformtools.c0 c0Var = (com.tencent.mm.sdk.platformtools.c0) this.f221223d.b(java.lang.Integer.valueOf(i17));
            if (c0Var != null && (fVar = (cq.f) c0Var.b(str)) != null) {
                h17.getFeedObject().setRecommendReason(fVar.f221189c);
            }
        }
        return h17;
    }

    public final com.tencent.mm.plugin.finder.storage.t70 Bi() {
        return com.tencent.mm.plugin.finder.storage.t70.f127590a;
    }

    public final java.lang.String Di(int i17) {
        java.lang.String str = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 7 ? i17 != 8 ? i17 != 10 ? "" : "network" : "cleaner" : com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME : "preload" : "fans" : "feed" : "follow";
        if (str.length() == 0) {
            com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            return com.tencent.mm.plugin.finder.assist.e9.f102134c + "page/";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var2 = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102134c + "page/");
        sb6.append(str);
        sb6.append('/');
        return sb6.toString();
    }

    public final void Ni(com.tencent.mm.plugin.finder.storage.FinderItem feed, int i17, int i18, long j17) {
        r45.zu0 zu0Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        bu2.j.f24534a.n(feed, new bu2.h(i18, j17));
        r45.dm2 object_extend = feed.getFeedObject().getObject_extend();
        if (object_extend != null && (zu0Var = (r45.zu0) object_extend.getCustom(58)) != null) {
            Vi(feed.getUserName(), zu0Var);
        }
        Ri(feed.getFeedObject(), i17);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Fj(feed.getFeedObject(), i17);
    }

    public final void Ri(com.tencent.mm.protocal.protobuf.FinderObject feed, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (f221222o) {
            ((cq.f) ((com.tencent.mm.sdk.platformtools.c0) this.f221223d.c(java.lang.Integer.valueOf(i17), cq.j.f221217d)).c(i17 + '_' + pm0.v.u(feed.getId()), new cq.i(feed, i17))).f221189c = feed.getRecommendReason();
        }
    }

    public final void Ui(java.util.List feeds, int i17, int i18, long j17) {
        kotlin.jvm.internal.o.g(feeds, "feeds");
        java.util.Iterator it = feeds.iterator();
        while (it.hasNext()) {
            Ni((com.tencent.mm.plugin.finder.storage.FinderItem) it.next(), i17, i18, j17);
        }
    }

    public final void Vi(java.lang.String username, r45.zu0 interactionData) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(interactionData, "interactionData");
        if (username.length() == 0) {
            com.tencent.mars.xlog.Log.w("FinderDataService", "update, username is empty");
            return;
        }
        com.tencent.mm.sdk.platformtools.c0 c0Var = this.f221225f;
        r45.zu0 zu0Var = (r45.zu0) c0Var.b(username);
        if (zu0Var == null || zu0Var.getLong(3) < interactionData.getLong(3)) {
            c0Var.d(username, interactionData);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        dead();
    }
}
