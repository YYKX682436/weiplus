package s01;

/* loaded from: classes11.dex */
public class y implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f401938d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f401939e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401940f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f401941g = new kk.l(64);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f401942h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f401943i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f401944m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public final kk.j f401945n = new kk.l(64);

    public y() {
        gm0.j1.n().f273288b.a(1352, this);
        gm0.j1.n().f273288b.a(1365, this);
        gm0.j1.n().f273288b.a(od1.b.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1354, this);
        gm0.j1.n().f273288b.a(1357, this);
        gm0.j1.n().f273288b.a(bb1.e.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1355, this);
        gm0.j1.n().f273288b.a(1358, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1361, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.media.k2.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(cc1.u.CTRL_INDEX, this);
    }

    public void a(java.util.LinkedList linkedList, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f401940f) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                s01.x xVar = new s01.x(str, str2);
                if (!this.f401939e.contains(xVar)) {
                    this.f401938d.add(xVar);
                    ((com.tencent.mm.sdk.platformtools.r2) this.f401941g).put(str2, new java.lang.Long(currentTimeMillis));
                }
            }
            c();
        }
    }

    public void b(java.util.LinkedList linkedList, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f401944m) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                s01.x xVar = new s01.x(str, str2);
                if (this.f401943i.contains(xVar)) {
                    return;
                }
                this.f401942h.add(xVar);
                ((com.tencent.mm.sdk.platformtools.r2) this.f401945n).put(str2, new java.lang.Long(currentTimeMillis));
            }
            d();
        }
    }

    public final void c() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f401940f) {
            if (this.f401939e.isEmpty()) {
                if (this.f401938d.isEmpty()) {
                    return;
                }
                java.util.Iterator it = this.f401938d.iterator();
                while (it.hasNext()) {
                    s01.x xVar = (s01.x) it.next();
                    r45.rj rjVar = new r45.rj();
                    rjVar.f384940d = xVar.f401936a;
                    rjVar.f384941e = xVar.f401937b;
                    linkedList.add(rjVar);
                }
                if (linkedList.isEmpty()) {
                    return;
                }
                this.f401939e.addAll(this.f401938d);
                this.f401938d.clear();
                gm0.j1.n().f273288b.g(new s01.i0(linkedList));
            }
        }
    }

    public final void d() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (this.f401944m) {
            if (this.f401943i.isEmpty()) {
                if (this.f401942h.isEmpty()) {
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it = this.f401942h.iterator();
                while (it.hasNext()) {
                    s01.x xVar = (s01.x) it.next();
                    java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(xVar.f401936a);
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                        hashMap.put(xVar.f401936a, linkedList2);
                    }
                    linkedList2.add(xVar.f401937b);
                }
                for (java.lang.String str : hashMap.keySet()) {
                    java.util.LinkedList linkedList3 = (java.util.LinkedList) hashMap.get(str);
                    if (linkedList3 != null && !linkedList3.isEmpty()) {
                        r45.ao aoVar = new r45.ao();
                        aoVar.f370161d = str;
                        aoVar.f370162e = linkedList3;
                        linkedList.add(aoVar);
                    }
                }
                this.f401943i.addAll(this.f401942h);
                this.f401942h.clear();
                gm0.j1.n().f273288b.g(new s01.k0(linkedList, null));
            }
        }
    }

    public s01.g0 e(java.lang.String str, r45.j53 j53Var, r01.w2 w2Var) {
        s01.g0 g0Var = new s01.g0(str, j53Var, w2Var);
        gm0.j1.n().f273288b.g(g0Var);
        return g0Var;
    }

    public void f(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Long l17 = (java.lang.Long) ((kk.l) this.f401941g).get(str);
        if (l17 == null || l17.longValue() + i17 < java.lang.System.currentTimeMillis()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f401940f) {
                s01.x xVar = new s01.x(str2, str);
                if (!this.f401939e.contains(xVar)) {
                    this.f401938d.add(xVar);
                    ((com.tencent.mm.sdk.platformtools.r2) this.f401941g).put(str, new java.lang.Long(currentTimeMillis));
                    c();
                }
            }
        }
    }

    public void finalize() {
        gm0.j1.n().f273288b.q(1352, this);
        gm0.j1.n().f273288b.q(1365, this);
        gm0.j1.n().f273288b.q(od1.b.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1354, this);
        gm0.j1.n().f273288b.q(1357, this);
        gm0.j1.n().f273288b.q(bb1.e.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1355, this);
        gm0.j1.n().f273288b.q(1358, this);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1361, this);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.media.k2.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(cc1.u.CTRL_INDEX, this);
        super.finalize();
    }

    public void g(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Long l17 = (java.lang.Long) ((kk.l) this.f401945n).get(str);
        if (l17 == null || l17.longValue() + i17 < java.lang.System.currentTimeMillis()) {
            j(str, str2);
        }
    }

    public void h(java.lang.String str, r01.w2 w2Var) {
        gm0.j1.n().f273288b.g(new s01.j0(str, w2Var));
    }

    public void i(java.lang.String str, java.lang.String str2, r01.w2 w2Var) {
        if (w2Var == null) {
            return;
        }
        s01.a0 d17 = s01.r.d(str2);
        if (d17 == null || d17.field_userId.equals(str)) {
            h(str2, w2Var);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        r45.ao aoVar = new r45.ao();
        aoVar.f370161d = str2;
        aoVar.f370162e = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(aoVar);
        gm0.j1.n().f273288b.g(new s01.k0(linkedList2, w2Var));
    }

    public void j(java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f401944m) {
            s01.x xVar = new s01.x(str2, str);
            if (this.f401943i.contains(xVar)) {
                return;
            }
            this.f401942h.add(xVar);
            ((com.tencent.mm.sdk.platformtools.r2) this.f401945n).put(str, new java.lang.Long(currentTimeMillis));
            d();
        }
    }

    public boolean k(r45.j53 j53Var, java.lang.String str, boolean z17) {
        if (j53Var == null || j53Var.f377592d == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatNetworkMgr", "fullBizChat or fullBizChat.chat or brandUserName == null");
            return false;
        }
        if (j53Var.f377593e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatNetworkMgr", "members==null");
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new s01.w(this, j53Var, str, z17), "Thread-internalHandleFullBizChatInfo");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(r45.j53 r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.y.l(r45.j53, java.lang.String, boolean):boolean");
    }

    public boolean m(r45.xj xjVar, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(xjVar.f390153d)) {
            return false;
        }
        s01.a0 a0Var = new s01.a0();
        a0Var.field_userId = xjVar.f390153d;
        a0Var.field_userName = xjVar.f390154e;
        a0Var.field_brandUserName = str;
        a0Var.field_headImageUrl = xjVar.f390156g;
        a0Var.field_profileUrl = xjVar.f390157h;
        a0Var.field_UserVersion = xjVar.f390155f;
        a0Var.field_addMemberUrl = xjVar.f390159m;
        if (!r01.q3.Vi().J0(a0Var)) {
            r01.q3.Vi().insert(a0Var);
        }
        s01.h hVar = new s01.h();
        hVar.field_bizChatServId = a0Var.field_userId;
        hVar.field_brandUserName = a0Var.field_brandUserName;
        hVar.field_chatName = a0Var.field_userName;
        hVar.field_chatType = 1;
        return s01.r.m(hVar) != null;
    }

    public s01.p0 n(java.lang.String str, r45.pj pjVar, r01.w2 w2Var) {
        s01.p0 p0Var = new s01.p0(str, pjVar, w2Var);
        gm0.j1.n().f273288b.g(p0Var);
        return p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x04ee, code lost:
    
        if (r11 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0553, code lost:
    
        if (r12.moveToFirst() != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0555, code lost:
    
        r14.add(r12.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0560, code lost:
    
        if (r12.moveToNext() != false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0562, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0709, code lost:
    
        if (r11 == false) goto L434;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r11, int r12, java.lang.String r13, com.tencent.mm.modelbase.m1 r14) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.y.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
