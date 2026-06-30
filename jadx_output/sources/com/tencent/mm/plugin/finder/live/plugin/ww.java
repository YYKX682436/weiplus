package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ww extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114996p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f114997q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f114998r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114996p = statusMonitor;
        this.f114997q = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mm.plugin.finder.live.plugin.lv lvVar = (com.tencent.mm.plugin.finder.live.plugin.lv) X0(com.tencent.mm.plugin.finder.live.plugin.lv.class);
        android.view.View findViewById = (lvVar == null || (viewGroup = lvVar.f365323d) == null) ? null : viewGroup.findViewById(com.tencent.mm.R.id.f8q);
        if (findViewById != null) {
            android.view.ViewParent parent = findViewById.getParent();
            this.f114998r = parent instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout ? (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent : null;
        }
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        pm2.a aVar = ((mm2.y2) P0(mm2.y2.class)).f329560m;
        com.tencent.mars.xlog.Log.i("FinderLiveLuckyMoneyBubblePlugin", "onMicUserChanged: curWidgetMode: " + aVar + " luckyMicMap.size:" + this.f114997q.size() + ", audienceLinkMicUserList.size:" + ((mm2.o4) P0(mm2.o4.class)).f329327v.size() + ", micUserMap:" + micUserMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f114997q;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String v17 = v1((java.lang.String) entry.getKey());
                if (!kotlin.jvm.internal.o.b(v17, ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n) && !micUserMap.containsKey(v17)) {
                    com.tencent.mars.xlog.Log.i("FinderLiveLuckyMoneyBubblePlugin", "old mic " + entry.getValue() + " removed, sdkUserID:" + v17);
                    arrayList.add(entry.getKey());
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x1((java.lang.String) it.next());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = micUserMap.entrySet().iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) it6.next()).getKey();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f114997q;
            synchronized (concurrentHashMap2) {
                for (java.util.Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    java.lang.String v18 = v1((java.lang.String) entry2.getKey());
                    com.tencent.mars.xlog.Log.i("FinderLiveLuckyMoneyBubblePlugin", "micModeChangeRemove oldLuckyMicKey: " + ((java.lang.String) entry2.getKey()) + " micUserId: " + v18);
                    if (kotlin.jvm.internal.o.b(str, v18)) {
                        if (!kotlin.jvm.internal.o.b(entry2.getKey(), t1(str, aVar, u1()))) {
                            arrayList2.add(entry2.getKey());
                        }
                    }
                }
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            x1((java.lang.String) it7.next());
        }
        java.util.Iterator it8 = micUserMap.entrySet().iterator();
        while (it8.hasNext()) {
            w1(aVar, u1(), (java.lang.String) ((java.util.Map.Entry) it8.next()).getKey());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w("FinderLiveLuckyMoneyBubblePlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            pm2.a aVar = ((mm2.y2) P0(mm2.y2.class)).f329560m;
            boolean u17 = u1();
            java.lang.String str = ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n;
            if (str == null) {
                str = "";
            }
            w1(aVar, u17, str);
            return;
        }
        if (ordinal == 27) {
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
            rl2.j jVar = (rl2.j) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66996t).getValue();
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", "clearCache liveId:" + j17);
            jVar.f397200f.clear();
            jVar.f397199e.delete("FinderLiveLuckyMoneyInfo", "liveId=?", new java.lang.String[]{pm0.v.u(j17)});
            return;
        }
        if (ordinal != 183 || bundle == null || (string = bundle.getString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID")) == null) {
            return;
        }
        java.util.Iterator it = this.f114997q.entrySet().iterator();
        while (it.hasNext()) {
            te2.c4 c4Var = (te2.c4) ((te2.w3) ((jz5.l) ((java.util.Map.Entry) it.next()).getValue()).f302833d);
            c4Var.getClass();
            java.util.Iterator it6 = c4Var.f417925i.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((te2.z3) obj).f418557b.equals(string)) {
                        break;
                    }
                }
            }
            te2.z3 z3Var = (te2.z3) obj;
            if (z3Var != null) {
                c4Var.h(z3Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f114997q;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((java.util.Map.Entry) it.next()).getKey());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            x1((java.lang.String) it6.next());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t1(java.lang.String r6, pm2.a r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            xh2.c r0 = (xh2.c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.LinkedList r0 = r0.f454531a
            if (r0 == 0) goto L3b
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r3 = r2
            xh2.a r3 = (xh2.a) r3
            java.lang.String r3 = r3.b()
            boolean r3 = kotlin.jvm.internal.o.b(r3, r6)
            if (r3 == 0) goto L1b
            goto L34
        L33:
            r2 = r1
        L34:
            xh2.a r2 = (xh2.a) r2
            if (r2 == 0) goto L3b
            xh2.i r0 = r2.f454521b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L41
            int r2 = r0.f454553e
            goto L42
        L41:
            r2 = 1
        L42:
            if (r0 == 0) goto L47
            int r3 = r0.f454557i
            goto L48
        L47:
            r3 = 0
        L48:
            r4 = 2
            boolean r3 = pm0.v.z(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r6 = 64
            r4.append(r6)
            int r7 = r7.ordinal()
            r4.append(r7)
            r4.append(r6)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            r4.append(r6)
            if (r0 == 0) goto L78
            int r7 = r0.f454555g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L78:
            r4.append(r1)
            r4.append(r6)
            r4.append(r8)
            java.lang.String r6 = r4.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ww.t1(java.lang.String, pm2.a, boolean):java.lang.String");
    }

    public final boolean u1() {
        boolean z17;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        xh2.i iVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        if (cVar != null && cVar.f454533c == 1) {
            java.util.Iterator it = cVar.f454531a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((xh2.a) obj).b(), ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n)) {
                    break;
                }
            }
            xh2.a aVar = (xh2.a) obj;
            if (aVar != null && (iVar = aVar.f454521b) != null && iVar.f454555g == 2) {
                z17 = true;
                if (z17 && !((mm2.o4) P0(mm2.o4.class)).A7()) {
                    if (((mm2.y2) P0(mm2.y2.class)).a7()) {
                        xh2.c cVar2 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
                        if (((cVar2 == null || (linkedList = cVar2.f454531a) == null) ? 0 : linkedList.size()) > 1) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        z17 = false;
        return z17 ? true : true;
    }

    public final java.lang.String v1(java.lang.String str) {
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"@"}, false, 0, 6, null);
        java.lang.String str2 = f07.isEmpty() ^ true ? (java.lang.String) f07.get(0) : "";
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        if (((r9 == null || (r4 = r9.f454521b) == null || r4.f454555g != 2) ? false : true) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0173, code lost:
    
        if (r5 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(pm2.a r51, boolean r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ww.w1(pm2.a, boolean, java.lang.String):void");
    }

    public final void x1(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("FinderLiveLuckyMoneyBubblePlugin", "unregister sdkUserId:".concat(key));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f114997q;
        jz5.l lVar = (jz5.l) concurrentHashMap.get(key);
        if (lVar == null) {
            return;
        }
        te2.w3 w3Var = (te2.w3) lVar.f302833d;
        te2.x3 x3Var = (te2.x3) lVar.f302834e;
        ((te2.c4) w3Var).onDetach();
        x3Var.release();
        concurrentHashMap.remove(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ww.y1():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }
}
