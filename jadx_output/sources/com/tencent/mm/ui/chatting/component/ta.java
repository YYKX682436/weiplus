package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.p0.class)
/* loaded from: classes15.dex */
public final class ta extends com.tencent.mm.ui.chatting.component.a implements sb5.p0, xg3.h0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f199974f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199975g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f199976h;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f199980o;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f199973e = "MicroMsg.EmojiEggComponent";

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.n9 f199977i = new com.tencent.mm.ui.chatting.n9();

    /* renamed from: m, reason: collision with root package name */
    public final xq.q f199978m = new xq.q();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f199979n = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final yz5.l f199981p = new com.tencent.mm.ui.chatting.component.ha(this);

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f199982q = new com.tencent.mm.ui.chatting.component.ea(this);

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f199983r = new com.tencent.mm.ui.chatting.component.qa(this);

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f199984s = com.tencent.mm.ui.chatting.component.ga.f199092d;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnScrollChangedListener f199985t = new com.tencent.mm.ui.chatting.component.pa(this);

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f199986u = jz5.h.b(new com.tencent.mm.ui.chatting.component.la(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f199987v = jz5.h.b(new com.tencent.mm.ui.chatting.component.ia(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f199988w = jz5.h.b(new com.tencent.mm.ui.chatting.component.ka(this));

    /* renamed from: x, reason: collision with root package name */
    public final xq.b f199989x = new com.tencent.mm.ui.chatting.component.sa(this);

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.ta.E():void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        n0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199975g = false;
        n0();
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3001) {
            this.f199977i.getClass();
        }
    }

    @Override // ul5.j
    public void c(int i17) {
        if (i17 != 0) {
            p0();
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 msgStorage, xg3.l0 notifyInfo) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(msgStorage, "msgStorage");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        boolean z17 = this.f199974f;
        yz5.l lVar = this.f199982q;
        java.util.ArrayList msgList = notifyInfo.f454412c;
        java.lang.String str = notifyInfo.f454411b;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.D0("insert", str)) {
                kotlin.jvm.internal.o.f(msgList, "msgList");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = msgList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (((java.lang.Boolean) ((com.tencent.mm.ui.chatting.component.ea) lVar).invoke(next)).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                if (it6.hasNext()) {
                    java.lang.Object next2 = it6.next();
                    if (it6.hasNext()) {
                        long msgId = ((com.tencent.mm.storage.f9) next2).getMsgId();
                        do {
                            java.lang.Object next3 = it6.next();
                            long msgId2 = ((com.tencent.mm.storage.f9) next3).getMsgId();
                            if (msgId < msgId2) {
                                next2 = next3;
                                msgId = msgId2;
                            }
                        } while (it6.hasNext());
                    }
                    obj = next2;
                } else {
                    obj = null;
                }
                this.f199976h = (com.tencent.mm.storage.f9) obj;
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("insert", str)) {
            kotlin.jvm.internal.o.f(msgList, "msgList");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it7 = msgList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next4 = it7.next();
                if (((java.lang.Boolean) ((com.tencent.mm.ui.chatting.component.ea) lVar).invoke(next4)).booleanValue()) {
                    arrayList2.add(next4);
                }
            }
            com.tencent.mm.ui.chatting.component.fa faVar = new com.tencent.mm.ui.chatting.component.fa(this, false, arrayList2);
            this.f199984s = faVar;
            pm0.v.W(faVar);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0("update", str)) {
            kotlin.jvm.internal.o.f(msgList, "msgList");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it8 = msgList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next5 = it8.next();
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) next5;
                if ((f9Var.F & 4) == 4 || f9Var.getType() == 10000) {
                    arrayList3.add(next5);
                }
            }
            pm0.v.X(new com.tencent.mm.ui.chatting.component.na(arrayList3, this));
        }
        kotlin.jvm.internal.o.f(msgList, "msgList");
        yz5.l lVar2 = this.f199983r;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it9 = msgList.iterator();
        while (it9.hasNext()) {
            java.lang.Object next6 = it9.next();
            if (((java.lang.Boolean) ((com.tencent.mm.ui.chatting.component.qa) lVar2).invoke(next6)).booleanValue()) {
                arrayList4.add(next6);
            }
        }
        pm0.v.X(new com.tencent.mm.ui.chatting.component.oa(arrayList4, this));
    }

    public final kh5.h m0() {
        return (kh5.h) ((jz5.n) this.f199988w).getValue();
    }

    public final void n0() {
        pm0.v.C(this.f199984s);
        this.f199984s = com.tencent.mm.ui.chatting.component.ra.f199824d;
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B.getViewTreeObserver().removeOnScrollChangedListener(this.f199985t);
        com.tencent.mm.ui.chatting.n9 n9Var = this.f199977i;
        n9Var.getClass();
        n9Var.h();
        n9Var.getClass();
        d30.a aVar = (d30.a) ((e30.e) i95.n0.c(e30.e.class));
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "cleanPrefetch: ");
        java.util.HashSet hashSet = (java.util.HashSet) aVar.f226125d;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((j60.a0) ((k60.f) i95.n0.c(k60.f.class))).getClass();
            com.tencent.mm.plugin.game.luggage.p1.f(str);
        }
        hashSet.clear();
        n9Var.f202031n = null;
        this.f199978m.d();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        this.f199979n.clear();
        this.f199980o = null;
    }

    public void o0() {
        int paddingTop = ((vb5.l) ((vb5.m) this.f198580d.f460708c.a(vb5.m.class))).f198580d.p().getPaddingTop();
        com.tencent.mars.xlog.Log.i(this.f199973e, "updateTipsBarHeight: " + paddingTop);
        com.tencent.mm.ui.chatting.n9 n9Var = this.f199977i;
        if (n9Var.f202026i != paddingTop) {
            n9Var.f202026i = paddingTop;
            com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = n9Var.f202019b;
            if (chattingAnimFrame != null) {
                chattingAnimFrame.setPadding(0, paddingTop, 0, 0);
            }
        }
    }

    public final void p0() {
        xq.b viewProvider = this.f199989x;
        this.f199978m.e(viewProvider);
        kh5.h hVar = this.f199977i.f202020c;
        if (hVar == null) {
            return;
        }
        kotlin.jvm.internal.o.g(viewProvider, "viewProvider");
        while (true) {
            java.util.ArrayList arrayList = hVar.f308079s;
            if (!(!arrayList.isEmpty())) {
                return;
            }
            kh5.c cVar = (kh5.c) kz5.n0.X(arrayList);
            long j17 = cVar.f308066c.f299863b;
            if (j17 != 0 && ((com.tencent.mm.ui.chatting.component.sa) viewProvider).b(j17) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "[ME]: onChattingViewUpdate: view not found for msgId = " + j17);
                return;
            }
            hVar.m1(hVar.f308077q, cVar.f308065b, cVar.f308066c);
            arrayList.remove(0);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.n5
    public void q(float f17, boolean z17) {
        p0();
    }

    @Override // ul5.j
    public void w(int i17) {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        xq.q qVar = this.f199978m;
        if (qVar.f456009a == null) {
            qVar.f456009a = (android.widget.FrameLayout) this.f198580d.g().findViewById(com.tencent.mm.R.id.f483653bl0);
        }
        this.f199974f = false;
        com.tencent.mm.storage.f9 f9Var = this.f199976h;
        if (f9Var != null) {
            com.tencent.mm.ui.chatting.component.fa faVar = new com.tencent.mm.ui.chatting.component.fa(this, true, kz5.b0.c(f9Var));
            this.f199984s = faVar;
            pm0.v.W(faVar);
        }
        this.f199976h = null;
        m0().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME] start: " + i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.f199974f = true;
        com.tencent.mm.ui.chatting.n9 n9Var = this.f199977i;
        n9Var.getClass();
        n9Var.h();
        this.f199978m.d();
        kh5.h m07 = m0();
        m07.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME] stop");
        android.os.Handler handler = m07.f308075o;
        java.lang.Runnable runnable = m07.f308082v;
        handler.removeCallbacks(runnable);
        ((kh5.d) runnable).run();
    }
}
