package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.b0.class)
/* loaded from: classes9.dex */
public final class v4 extends com.tencent.mm.ui.chatting.component.a implements sb5.b0, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public ic5.f f200113e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f200114f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f200115g = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ((java.util.LinkedHashMap) this.f200114f).clear();
            ((java.util.LinkedHashMap) this.f200115g).clear();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        com.tencent.mm.ui.chatting.adapter.k kVar;
        android.view.View O0;
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ic5.f fVar = this.f200113e;
            if (fVar == null) {
                kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
                throw null;
            }
            fVar.f290439a = true;
            sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
            java.lang.Object p17 = this.f198580d.p();
            kotlin.jvm.internal.o.e(p17, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) p17;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (O0 = (kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar).O0(j17)) == null) {
                return;
            }
            int top = O0.getTop() - recyclerView.getPaddingTop();
            kVar.h(new java.lang.Object());
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.component.s4(recyclerView, this, kVar, linearLayoutManager, top, j17));
        }
    }

    @Override // yn.d
    public void X() {
        com.tencent.mm.storage.f9 f9Var;
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ic5.f fVar = this.f200113e;
            if (fVar == null) {
                kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
                throw null;
            }
            fVar.f290439a = false;
            java.lang.Object p17 = this.f198580d.p();
            kotlin.jvm.internal.o.e(p17, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) p17;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
            int w17 = ((linearLayoutManager.w() + linearLayoutManager.y()) / 2) - this.f198580d.p().getHeaderViewsCount();
            java.util.ArrayList arrayList = ((com.tencent.mm.ui.chatting.adapter.k) zVar).I.f152065o;
            kotlin.jvm.internal.o.f(arrayList, "getDataMap(...)");
            rd5.d dVar = (rd5.d) kz5.n0.a0(arrayList, w17);
            long msgId = (dVar == null || (f9Var = dVar.f394254d.f445300b) == null) ? -1L : f9Var.getMsgId();
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            android.view.View O0 = kVar.O0(msgId);
            int top = O0 != null ? O0.getTop() - recyclerView.getPaddingTop() : 0;
            kVar.h(new java.lang.Object());
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.component.t4(recyclerView, this, zVar, msgId, linearLayoutManager, top));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f200113e = new ic5.f();
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            if (kotlin.jvm.internal.o.b(l0Var != null ? l0Var.f454410a : null, this.f198580d.x())) {
                if (!kotlin.jvm.internal.o.b(l0Var != null ? l0Var.f454411b : null, "delete")) {
                    if (!kotlin.jvm.internal.o.b(l0Var != null ? l0Var.f454411b : null, "update")) {
                        return;
                    }
                }
                java.util.ArrayList<com.tencent.mm.storage.f9> arrayList = l0Var.f454412c;
                if (arrayList != null) {
                    for (com.tencent.mm.storage.f9 f9Var : arrayList) {
                        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) this.f200115g).get(java.lang.Long.valueOf(f9Var.getMsgId()));
                        if (str != null) {
                            if (kotlin.jvm.internal.o.b(l0Var.f454411b, "update") && !f9Var.P2()) {
                                boolean z17 = false;
                                if (f9Var.isVideo() || f9Var.J2()) {
                                    com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(f9Var.Q0(), f9Var.getMsgId());
                                    if (k17 != null && k17.P2()) {
                                        z17 = true;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotifyChange: update msgId:");
                                    sb6.append(f9Var.getMsgId());
                                    sb6.append(" groupId:");
                                    sb6.append(str);
                                    sb6.append(" oriMsgType:");
                                    sb6.append(f9Var.P2());
                                    sb6.append(" dbMsgType:");
                                    sb6.append(k17 != null ? java.lang.Integer.valueOf(k17.getType()) : null);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", sb6.toString());
                                }
                                if (!z17) {
                                }
                            }
                            java.util.Map map = this.f200114f;
                            com.tencent.mm.ui.chatting.component.p4 p4Var = (com.tencent.mm.ui.chatting.component.p4) ((java.util.LinkedHashMap) map).get(str);
                            if (p4Var != null) {
                                com.tencent.mm.ui.chatting.component.u4 u4Var = new com.tencent.mm.ui.chatting.component.u4(f9Var);
                                java.util.List list = p4Var.f199673b;
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "onNotifyChange: deleted:" + kz5.h0.B(list, u4Var) + " msgId:" + f9Var.getMsgId() + " [" + kz5.n0.g0(p4Var.f199673b, null, null, null, 0, null, null, 63, null) + "] groupId:" + str);
                                if (list.size() <= 1) {
                                    map.remove(str);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void m0(rd5.d msgData) {
        boolean z17;
        fd5.c cVar;
        we5.s0 s0Var;
        java.util.List list;
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "expandMsg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - com.tencent.mm.ui.chatting.component.w4.f200150a < 500) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemMediaGroupComponent", "mediaGroup op ignored by global cooldown");
            z17 = true;
        } else {
            com.tencent.mm.ui.chatting.component.w4.f200150a = currentTimeMillis;
            z17 = false;
        }
        if (z17) {
            return;
        }
        ic5.f fVar = this.f200113e;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
            throw null;
        }
        java.lang.String a17 = fVar.a(msgData.f394254d.f445300b);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "expandMsg groupId: ".concat(a17));
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f200114f;
        java.lang.Object obj = linkedHashMap.get(a17);
        if (obj == null) {
            obj = new com.tencent.mm.ui.chatting.component.p4(a17, null, 0, 6, null);
            linkedHashMap.put(a17, obj);
        }
        java.util.List list2 = ((com.tencent.mm.ui.chatting.component.p4) obj).f199673b;
        list2.clear();
        qd5.i iVar = msgData instanceof qd5.i ? (qd5.i) msgData : null;
        if (iVar != null && (s0Var = iVar.f361911o) != null && (list = s0Var.f445387a) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!((rd5.d) obj2).f394254d.f445300b.P2()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rd5.d dVar = (rd5.d) it.next();
                this.f200115g.put(java.lang.Long.valueOf(dVar.f394254d.f445300b.getMsgId()), a17);
                arrayList2.add(java.lang.Long.valueOf(dVar.f394254d.f445300b.getMsgId()));
            }
            list2.addAll(arrayList2);
        }
        com.tencent.mm.ui.chatting.component.o4 o4Var = (com.tencent.mm.ui.chatting.component.o4) ((sb5.a0) this.f198580d.f460708c.a(sb5.a0.class));
        o4Var.getClass();
        if (!r26.n0.N(a17)) {
            o4Var.f199622g.add(a17);
        }
        java.lang.Object p17 = this.f198580d.p();
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView != null) {
            com.tencent.mm.ui.chatting.view.i2.c(recyclerView, a17, new com.tencent.mm.ui.chatting.component.q4(this, o4Var, a17));
        }
        java.lang.Object p18 = this.f198580d.p();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = p18 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p18 : null;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = layoutManager instanceof com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager ? (com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager) layoutManager : null;
        if (chattingLinearLayoutManager != null && (cVar = (fd5.c) chattingLinearLayoutManager.W(fd5.c.class)) != null) {
            cVar.c();
        }
        ic5.f fVar2 = this.f200113e;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
            throw null;
        }
        com.tencent.mm.storage.f9 msg = msgData.f394254d.f445300b;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!fVar2.f290439a) {
            java.lang.String a18 = fVar2.a(msg);
            if (!r26.n0.N(a18)) {
                fVar2.f290440b.add(a18);
            }
        }
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        if (zVar != null) {
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).h(new java.lang.Object());
        }
    }

    public java.lang.String n0(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        ic5.f fVar = this.f200113e;
        if (fVar != null) {
            return fVar.a(msgInfo);
        }
        kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
        throw null;
    }

    public boolean o0(com.tencent.mm.storage.f9 msgInfo) {
        com.tencent.mm.ui.chatting.component.p4 p4Var;
        java.util.List list;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (!((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            return false;
        }
        ic5.f fVar = this.f200113e;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
            throw null;
        }
        java.lang.String a17 = fVar.a(msgInfo);
        if (r26.n0.N(a17) || (p4Var = (com.tencent.mm.ui.chatting.component.p4) ((java.util.LinkedHashMap) this.f200114f).get(a17)) == null || (list = p4Var.f199673b) == null) {
            return false;
        }
        java.lang.Long l17 = (java.lang.Long) kz5.n0.Z(list);
        return l17 != null && l17.longValue() == msgInfo.getMsgId();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            java.lang.Object p17 = this.f198580d.p();
            androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
            if (recyclerView == null) {
                return;
            }
            n3.t1 t1Var = new n3.t1(recyclerView);
            while (t1Var.hasNext()) {
                com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) ((android.view.View) t1Var.next()).findViewById(com.tencent.mm.R.id.sr8);
                if (chattingMediaGroupMvvmView != null) {
                    chattingMediaGroupMvvmView.z();
                }
            }
        }
    }
}
