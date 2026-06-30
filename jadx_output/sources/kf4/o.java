package kf4;

/* loaded from: classes4.dex */
public final class o implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final kf4.o f307484d = new kf4.o();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f307485e = java.util.Collections.synchronizedMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f307486f = java.util.Collections.synchronizedMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f307487g = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f307488h = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f307489i = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f307490m = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.LinkedList f307491n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$snsPermissionNotifyListener$1 f307492o;

    /* renamed from: p, reason: collision with root package name */
    public static final yz5.r f307493p;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$snsPermissionNotifyListener$1] */
    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f307492o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPermissionNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$snsPermissionNotifyListener$1
            {
                this.__eventId = 26482458;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent) {
                com.tencent.mm.autogen.events.SnsPermissionNotifyEvent event = snsPermissionNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new kf4.j(event));
                return false;
            }
        };
        f307493p = kf4.l.f307483d;
    }

    public static final void a(kf4.o oVar) {
        oVar.getClass();
        java.util.Iterator it = f307491n.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView = (com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView) ((ze4.i) it.next());
            snsStoryHeaderView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyUserListChange", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            snsStoryHeaderView.c(false);
            java.util.LinkedList linkedList = (java.util.LinkedList) snsStoryHeaderView.f170659f;
            if (linkedList.size() > 0) {
                ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Bi((java.lang.String) linkedList.get(0), false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyUserListChange", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0311 A[Catch: all -> 0x03f2, TryCatch #0 {, blocks: (B:75:0x01e7, B:76:0x01eb, B:78:0x01f1, B:82:0x0238, B:84:0x023e, B:86:0x024e, B:88:0x0256, B:90:0x0263, B:93:0x0276, B:94:0x0280, B:95:0x0289, B:98:0x02cd, B:103:0x02e9, B:105:0x02f7, B:106:0x02f9, B:107:0x0309, B:109:0x0311, B:111:0x031e, B:112:0x0344, B:115:0x0388, B:120:0x0331, B:121:0x033b, B:122:0x02fe, B:124:0x0306), top: B:74:0x01e7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kf4.o r21) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf4.o.b(kf4.o):void");
    }

    public final boolean c(java.lang.String str) {
        return (str == null || str.length() == 0) || com.tencent.mm.sdk.platformtools.t8.D0(str, ef4.w.f252468t.e());
    }

    public java.util.LinkedHashMap d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNewReplyList: size ");
        java.util.Map userReplyStateMap = f307486f;
        sb6.append(userReplyStateMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", sb6.toString());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        synchronized (this) {
            kotlin.jvm.internal.o.f(userReplyStateMap, "userReplyStateMap");
            java.util.Iterator it = userReplyStateMap.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                kf4.p pVar = (kf4.p) entry.getValue();
                new java.util.ArrayList();
                pVar.getClass();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public java.util.List e() {
        java.util.LinkedList linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUnreadList: size ");
        java.util.List displayUnreadUserList = f307488h;
        sb6.append(displayUnreadUserList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", sb6.toString());
        kotlin.jvm.internal.o.f(displayUnreadUserList, "displayUnreadUserList");
        synchronized (displayUnreadUserList) {
            linkedList = new java.util.LinkedList(displayUnreadUserList);
        }
        return linkedList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r9 = r9.f316976d;
        kotlin.jvm.internal.o.e(r9, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
        r9 = (nf4.f) r9;
        r3 = r9.getUserName();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", "[StoryExtInfo] onNotifyChange: event " + r8 + ' ' + r3);
        r5 = kf4.o.f307485e;
        kotlin.jvm.internal.o.f(r5, "userStateMap");
        r5.put(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (kotlin.jvm.internal.o.b(r8, "notify_story_preload") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        pm0.v.L("ContactSyncFetcher_checkContactState", true, kf4.g.f307475d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r8.equals("notify_story_read") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r8.equals("notify_story_invalid") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r8.equals("notify_story_valid") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r8.equals("notify_story_preload") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r8.equals("notify_story_unread") == false) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0016. Please report as an issue. */
    @Override // l75.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotifyChange(java.lang.String r8, l75.w0 r9) {
        /*
            r7 = this;
            r0 = 1
            java.lang.String r1 = "ContactSyncFetcher_checkContactState"
            java.lang.String r2 = "MicroMsg.ContactSyncFetcher"
            if (r8 == 0) goto L90
            if (r9 == 0) goto L90
            java.lang.Object r3 = r9.f316976d
            boolean r3 = r3 instanceof nf4.f
            if (r3 == 0) goto L90
            int r3 = r8.hashCode()
            java.lang.String r4 = "notify_story_preload"
            switch(r3) {
                case -1921532343: goto L42;
                case -533270468: goto L38;
                case 356729399: goto L2e;
                case 398324054: goto L24;
                case 632036207: goto L1a;
                default: goto L19;
            }
        L19:
            goto L86
        L1a:
            java.lang.String r3 = "notify_story_unread"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L48
            goto L86
        L24:
            java.lang.String r3 = "notify_story_read"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L48
            goto L86
        L2e:
            java.lang.String r3 = "notify_story_invalid"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L48
            goto L86
        L38:
            java.lang.String r3 = "notify_story_valid"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L48
            goto L86
        L42:
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L86
        L48:
            java.lang.Object r9 = r9.f316976d
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo"
            kotlin.jvm.internal.o.e(r9, r3)
            nf4.f r9 = (nf4.f) r9
            java.lang.String r3 = r9.getUserName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[StoryExtInfo] onNotifyChange: event "
            r5.<init>(r6)
            r5.append(r8)
            r6 = 32
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            java.lang.String r2 = "userStateMap"
            java.util.Map r5 = kf4.o.f307485e
            kotlin.jvm.internal.o.f(r5, r2)
            r5.put(r3, r9)
            boolean r8 = kotlin.jvm.internal.o.b(r8, r4)
            if (r8 != 0) goto Lb5
            kf4.g r8 = kf4.g.f307475d
            pm0.v.L(r1, r0, r8)
            goto Lb5
        L86:
            java.lang.String r9 = "[StoryExtInfo] unknown event "
            java.lang.String r8 = r9.concat(r8)
            com.tencent.mars.xlog.Log.i(r2, r8)
            goto Lb5
        L90:
            if (r8 == 0) goto Lb5
            if (r9 == 0) goto Lb5
            java.lang.Object r3 = r9.f316976d
            boolean r3 = r3 instanceof nf4.j
            if (r3 == 0) goto Lb5
            java.lang.String r3 = "notify_story_info_delete"
            boolean r3 = kotlin.jvm.internal.o.b(r8, r3)
            if (r3 == 0) goto Lac
            kf4.i r8 = new kf4.i
            r8.<init>(r9)
            pm0.v.L(r1, r0, r8)
            goto Lb5
        Lac:
            java.lang.String r9 = "[StoryInfo] unknown event "
            java.lang.String r8 = r9.concat(r8)
            com.tencent.mars.xlog.Log.i(r2, r8)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf4.o.onNotifyChange(java.lang.String, l75.w0):void");
    }
}
