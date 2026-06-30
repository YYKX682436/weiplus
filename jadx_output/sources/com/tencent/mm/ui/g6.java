package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class g6 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.FindMoreFriendsUI f208619a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f208620b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208621c;

    public g6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        java.lang.Object obj = new java.lang.Object();
        this.f208620b = obj;
        com.tencent.mm.ui.FindMoreGameRedLogic$1 findMoreGameRedLogic$1 = new com.tencent.mm.ui.FindMoreGameRedLogic$1(this, com.tencent.mm.app.a0.f53288d);
        this.f208621c = findMoreGameRedLogic$1;
        synchronized (obj) {
            this.f208619a = findMoreFriendsUI;
            findMoreGameRedLogic$1.alive();
        }
        findMoreFriendsUI.mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: com.tencent.mm.ui.FindMoreGameRedLogic$2
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    synchronized (com.tencent.mm.ui.g6.this.f208620b) {
                        com.tencent.mm.ui.g6.this.f208621c.dead();
                        com.tencent.mm.ui.g6.this.f208619a = null;
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r2.f373899s == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r2 = i95.n0.c(r0)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            zy2.fa r2 = r2.nk()
            java.lang.String r3 = "Game.Entrance"
            r45.f03 r2 = r2.I0(r3)
            if (r2 != 0) goto L1f
            goto L25
        L1f:
            int r2 = r2.f373899s
            r4 = 1
            if (r2 != r4) goto L25
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 == 0) goto L29
            return r1
        L29:
            i95.m r1 = i95.n0.c(r0)
            zy2.b6 r1 = (zy2.b6) r1
            c61.l7 r1 = (c61.l7) r1
            zy2.fa r1 = r1.nk()
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            c61.l7 r0 = (c61.l7) r0
            zy2.fa r0 = r0.nk()
            com.tencent.mm.plugin.finder.extension.reddot.jb r0 = r0.L0(r3)
            boolean r0 = r1.p(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.g6.a():boolean");
    }

    public boolean b() {
        return ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ee, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f6570d) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.autogen.events.QueryGameMessageEvent r18) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.g6.c(com.tencent.mm.autogen.events.QueryGameMessageEvent):void");
    }
}
