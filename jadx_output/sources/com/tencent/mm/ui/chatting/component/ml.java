package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.d2.class)
@java.lang.Deprecated
/* loaded from: classes9.dex */
public class ml extends com.tencent.mm.ui.chatting.component.a implements sb5.d2, com.tencent.mm.storage.f8 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199516e = new com.tencent.mm.ui.chatting.component.SilenceMsgComponent$1(this, com.tencent.mm.app.a0.f53288d);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199516e.dead();
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).f195121h.j(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f198580d.D();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            try {
                m0();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.SilenceMsgComponent", e17, "silenceMsgImp handleIdelScrollChange", new java.lang.Object[0]);
            }
        }
    }

    public void m0() {
        com.tencent.mm.storage.f9 item;
        yb5.d dVar = this.f198580d;
        android.view.View f17 = dVar.f(dVar.j());
        if (f17 != null && f17.getTop() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceTopLoadData true");
            if (!this.f198580d.D() || (item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getItem(0)) == null || item.getMsgId() == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange check fault[%d, %d, %d, %d, %d, %d, %d, %s]", java.lang.Integer.valueOf(item.w0()), java.lang.Integer.valueOf(item.A0()), java.lang.Long.valueOf(item.getMsgId()), java.lang.Long.valueOf(item.I0()), java.lang.Long.valueOf(item.F0()), java.lang.Long.valueOf(item.getCreateTime()), java.lang.Integer.valueOf(item.getType()), item.Q0());
            if ((item.w0() & 1) == 0 || (item.w0() & 4) == 0) {
                return;
            }
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B.setIsTopShowAll(false);
            return;
        }
        if (this.f198580d.D()) {
            yb5.d dVar2 = this.f198580d;
            if (dVar2.f(dVar2.p().getChildCount() - 1) != null) {
                sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
                if (this.f198580d.o() == this.f198580d.p().s().getCount() - 1) {
                    com.tencent.mm.storage.f9 f9Var = null;
                    int i17 = 1;
                    while (true) {
                        if (i17 >= 5) {
                            break;
                        }
                        f9Var = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getItem(((com.tencent.mm.ui.chatting.adapter.k) zVar).getCount() - i17);
                        if (f9Var != null && f9Var.getMsgId() != 0 && (f9Var.w0() & 1) != 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found i[%s]", java.lang.Integer.valueOf(i17));
                            break;
                        }
                        i17++;
                    }
                    if (f9Var == null || f9Var.getMsgId() == 0) {
                        if ((f9Var != null) && ((f9Var.w0() & 2) != 0)) {
                            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).q5(f9Var.Q0());
                            if (q57 == null || q57.getMsgId() == 0 || q57.getCreateTime() <= f9Var.getCreateTime()) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s] not need notify", java.lang.Integer.valueOf(q57.w0()), java.lang.Integer.valueOf(q57.A0()), java.lang.Long.valueOf(q57.getMsgId()), java.lang.Long.valueOf(q57.I0()), java.lang.Long.valueOf(q57.F0()), java.lang.Long.valueOf(q57.getCreateTime()), java.lang.Integer.valueOf(q57.getType()), q57.Q0());
                            return;
                        }
                        return;
                    }
                    com.tencent.mm.storage.f9 k27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().k2(f9Var.Q0(), f9Var.F0());
                    if (k27 != null && k27.getMsgId() != 0 && k27.getMsgId() == f9Var.getMsgId() && (k27.w0() & 1) == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange found msg not fault msgId[%s] flag[%s]", java.lang.Long.valueOf(k27.getMsgId()), java.lang.Integer.valueOf(k27.w0()));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s]", java.lang.Integer.valueOf(f9Var.w0()), java.lang.Integer.valueOf(f9Var.A0()), java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.F0()), java.lang.Long.valueOf(f9Var.getCreateTime()), java.lang.Integer.valueOf(f9Var.getType()), f9Var.Q0());
                    if ((f9Var.w0() & 1) == 0 || (f9Var.w0() & 4) != 0) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceBottomLoadData");
                    ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).i1(false);
                    ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).h1(true);
                    ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B.c(true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found");
                    gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.il(this, f9Var));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // com.tencent.mm.storage.f8
    public void p(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l8 l8Var) {
        com.tencent.mm.storage.f9 f9Var;
        ?? r76;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify cvs.getUsername[%s] tid[%d]", l4Var.h1(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        yb5.d dVar = this.f198580d;
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.SilenceMsgComponent", "[onMsgChangeNotify] ChattingUI is not in Foreground!!");
            return;
        }
        if (dVar.D() && this.f198580d.u().d1().equals(l4Var.h1())) {
            sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
            int T0 = l4Var.T0();
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            int M0 = kVar.M0();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(T0);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(M0);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify newCvsCount[%d], total[%d], dealHistoryGetMsg[%b], UnDeliverCount[%d]", valueOf, valueOf2, bool, java.lang.Integer.valueOf(l4Var.c1()));
            if (T0 <= M0 || (f9Var = l4Var.f195084f2) == null || f9Var.getMsgId() == 0) {
                return;
            }
            int i17 = T0 - M0;
            int w07 = f9Var.w0();
            java.lang.Long valueOf3 = java.lang.Long.valueOf(f9Var.I0());
            java.lang.Long valueOf4 = java.lang.Long.valueOf(f9Var.F0());
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(w07);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify receive get msg svrId[%d], seq[%d], flag[%d], stack[%s]", valueOf3, valueOf4, valueOf5, new com.tencent.mm.sdk.platformtools.z3());
            if ((w07 & 2) == 0) {
                return;
            }
            if (this.f198580d.p() != null) {
                yb5.d dVar2 = this.f198580d;
                if (dVar2.f460719n != null) {
                    if ((w07 & 4) == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down dealHistoryGetMsg: %b", bool);
                        int j17 = this.f198580d.j();
                        int count = kVar.getCount();
                        int count2 = kVar.getCount();
                        int i18 = count2 - count;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down talker[%s],firstVisiblePosition:%d, new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d, needCheckHistoryTips:%b", this.f198580d.u().d1(), java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(T0), java.lang.Integer.valueOf(M0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(count2), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(i18), 0, bool);
                        if (i18 > 1) {
                            com.tencent.mm.pluginsdk.ui.tools.v3 p17 = this.f198580d.p();
                            int firstVisiblePosition = p17.getFirstVisiblePosition();
                            android.view.View view = (j17 < firstVisiblePosition || j17 > (p17.getChildCount() + firstVisiblePosition) + (-1)) ? p17.s().getView(j17, null, p17.f()) : p17.getChildAt(j17 - firstVisiblePosition);
                            int top = view == null ? 0 : view.getTop();
                            com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B;
                            int bottomHeight = top - (mMChattingListView == null ? 0 : mMChattingListView.getBottomHeight());
                            this.f198580d.p().k(this.f198580d.p().s());
                            this.f198580d.U(j17, bottomHeight, false, false);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s firstView %s scrollY %s %s", java.lang.Integer.valueOf(j17), view, java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(bottomHeight));
                            this.f198580d.p().post(new com.tencent.mm.ui.chatting.component.jl(this, j17, bottomHeight, kVar));
                            this.f198580d.p().postDelayed(new com.tencent.mm.ui.chatting.component.kl(this, j17, bottomHeight, kVar), 200L);
                            return;
                        }
                        return;
                    }
                    int j18 = dVar2.j();
                    int o17 = this.f198580d.o();
                    com.tencent.mm.storage.f9 item = kVar.getItem(j18);
                    com.tencent.mm.storage.f9 item2 = kVar.getItem(o17);
                    int count3 = kVar.getCount();
                    int count4 = kVar.getCount();
                    int i19 = count4 - count3;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up talker[%s],new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d needCheckHistoryTips:%b", this.f198580d.u().d1(), java.lang.Integer.valueOf(T0), java.lang.Integer.valueOf(M0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(count4), java.lang.Integer.valueOf(count3), java.lang.Integer.valueOf(i19), 0, bool);
                    if (item2 != null && item2.getMsgId() != 0 && item2.getCreateTime() < f9Var.getCreateTime()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr lastVisibleMsg getCreateTime < lastInsert msg");
                        r76 = 1;
                    } else if (i19 > 0) {
                        kVar.I0(i19);
                        java.lang.Object[] objArr = new java.lang.Object[5];
                        objArr[0] = java.lang.Integer.valueOf(j18);
                        r76 = 1;
                        objArr[1] = java.lang.Integer.valueOf(o17);
                        objArr[2] = java.lang.Long.valueOf(item == null ? -1L : item.getCreateTime());
                        objArr[3] = java.lang.Long.valueOf(item2 != null ? item2.getCreateTime() : -1L);
                        objArr[4] = java.lang.Long.valueOf(f9Var.getCreateTime());
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s, lastVisiblePosition %s, createtime[%s, %s, %s]", objArr);
                        java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i19);
                        int i27 = i19 + 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up nowCount > preCount on set select:%d position %d, firstVisiblePosition %s", valueOf6, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(j18));
                        yb5.d dVar3 = this.f198580d;
                        dVar3.U(i27, ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar3.f460708c.a(sb5.z0.class))).r0() + ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B.getTopHeight(), false, false);
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.ll(this, i19));
                    } else {
                        r76 = 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up incTotal incCount[%d, %d, %d] keep same", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), 0);
                    }
                    ((com.tencent.mm.ui.chatting.ChattingUIFragment) this.f198580d.f460719n).B.d(false);
                    if (l4Var.c1() < r76) {
                        ((com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class))).v0(r76);
                        return;
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr something is null %s %s %s", this.f198580d.p(), kVar, this.f198580d.f460719n);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }
}
