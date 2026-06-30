package wc5;

/* loaded from: classes10.dex */
public final class w extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444647d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444648e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f444649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444647d = baseActivity;
        this.f444649f = new java.util.ArrayList();
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f444647d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void U6(ad5.l0 operation, ad5.j result, java.util.List msgInfoList) {
        uc5.d dVar;
        kotlin.jvm.internal.o.g(operation, "operation");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        if (!kotlin.jvm.internal.o.b(operation, ad5.d.f3242a)) {
            if (!kotlin.jvm.internal.o.b(operation, ad5.q.f3294a)) {
                if (!(kotlin.jvm.internal.o.b(operation, ad5.e.f3244a) ? true : kotlin.jvm.internal.o.b(operation, ad5.j0.f3273a) ? true : kotlin.jvm.internal.o.b(operation, ad5.y.f3328a))) {
                    kotlin.jvm.internal.o.b(operation, ad5.f.f3249a);
                    return;
                }
                if ((result instanceof ad5.i) && ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).r7()) {
                    com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6();
                    com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = msgHistoryGalleryUI.W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
                    com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) (W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView ? W6 : null);
                    if (msgHistoryGalleryActionBarView != null) {
                        msgHistoryGalleryActionBarView.setSelecting(false);
                    }
                    msgHistoryGalleryUI.w7(false);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: result=" + result + ", isSelecting=" + ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).r7());
            if (kotlin.jvm.internal.o.b(result, ad5.i.f3267a)) {
                if (((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).r7()) {
                    com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI2 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6();
                    com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W62 = msgHistoryGalleryUI2.W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
                    com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView2 = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) (W62 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView ? W62 : null);
                    if (msgHistoryGalleryActionBarView2 != null) {
                        msgHistoryGalleryActionBarView2.setSelecting(false);
                    }
                    msgHistoryGalleryUI2.w7(false);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.o.b(result, ad5.g.f3255a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: user cancelled");
                return;
            } else {
                if (result instanceof ad5.h) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onRetransmitFinished: failed - " + ((ad5.h) result).f3261b);
                    return;
                }
                return;
            }
        }
        if (!(result instanceof ad5.i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onDeleteFinished: result is not success");
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView m76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).m7();
        xm3.t0 b17 = xm3.u0.b(m76);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperationUIC", "onGalleryMessagesDeleted: adapter is not MsgHistoryGalleryRow");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(msgInfoList, 10));
        java.util.Iterator it = msgInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            arrayList.add(f9Var.Q0() + '#' + f9Var.getMsgId());
        }
        java.util.HashSet Q0 = kz5.n0.Q0(arrayList);
        boolean r76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).r7();
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = b17.I;
        mvvmList.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(new java.util.ArrayList(mvvmList.f152065o));
        kz5.h0.B(arrayList2, new wc5.t(Q0));
        yc5.m.f460914a.a(arrayList2);
        if (r76) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                uc5.l0 l0Var = (uc5.l0) it6.next();
                uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                if (h0Var != null && (dVar = h0Var.f426494d) != null) {
                    dVar.f426476d = uc5.a.f426469a;
                }
            }
        }
        ym3.f fVar = mvvmList.f152057d;
        uc5.y yVar = fVar instanceof uc5.y ? (uc5.y) fVar : null;
        if (yVar != null) {
            yVar.d(msgInfoList);
        }
        mvvmList.z(new wc5.u(arrayList2));
        if (r76) {
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI3 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6();
            com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W63 = msgHistoryGalleryUI3.W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView3 = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) (W63 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView ? W63 : null);
            if (msgHistoryGalleryActionBarView3 != null) {
                msgHistoryGalleryActionBarView3.setSelecting(false);
            }
            msgHistoryGalleryUI3.w7(false);
        }
        m76.post(new wc5.v(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        ((java.util.ArrayList) this.f444649f).clear();
        super.onFinished();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ad5.g gVar = null;
        if (this.f444648e) {
            this.f444648e = false;
            java.util.Set set = xc5.l.f453521r;
            xc5.l.f453521r = null;
            com.tencent.mm.view.recyclerview.WxRecyclerView m76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).m7();
            xm3.t0 b17 = xm3.u0.b(m76);
            if (b17 != null) {
                java.util.List data = b17.getData();
                if (set == null || set.isEmpty()) {
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = m76.getLayoutManager();
                    androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
                    if (gridLayoutManager != null) {
                        int w17 = gridLayoutManager.w();
                        int y17 = gridLayoutManager.y();
                        if (w17 >= 0 && w17 <= y17) {
                            while (true) {
                                java.lang.Object a07 = kz5.n0.a0(data, w17);
                                uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                                if (h0Var != null) {
                                    uc5.d dVar = h0Var.f426494d;
                                    dd5.n1 n1Var = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                                    if (n1Var != null) {
                                        n1Var.f426477e = null;
                                        b17.notifyItemRangeChanged(w17, 1, "force_content_refresh");
                                    }
                                }
                                if (w17 == y17) {
                                    break;
                                } else {
                                    w17++;
                                }
                            }
                        }
                    }
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet(set);
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = m76.getLayoutManager();
                    androidx.recyclerview.widget.GridLayoutManager gridLayoutManager2 = layoutManager2 instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager2 : null;
                    int w18 = gridLayoutManager2 != null ? gridLayoutManager2.w() : -1;
                    int y18 = gridLayoutManager2 != null ? gridLayoutManager2.y() : -1;
                    int i17 = 0;
                    for (java.lang.Object obj : data) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        uc5.l0 l0Var = (uc5.l0) obj;
                        if (hashSet.isEmpty()) {
                            break;
                        }
                        uc5.h0 h0Var2 = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                        if (h0Var2 != null) {
                            uc5.d dVar2 = h0Var2.f426494d;
                            dd5.n1 n1Var2 = dVar2 instanceof dd5.n1 ? (dd5.n1) dVar2 : null;
                            if (n1Var2 != null && hashSet.contains(java.lang.Long.valueOf(n1Var2.f229231h.getMsgId()))) {
                                hashSet.remove(java.lang.Long.valueOf(n1Var2.f229231h.getMsgId()));
                                n1Var2.f426477e = null;
                                if (w18 <= i17 && i17 <= y18) {
                                    b17.notifyItemRangeChanged(i17, 1, "force_content_refresh");
                                }
                            }
                        }
                        i17 = i18;
                    }
                }
            }
        }
        boolean z17 = ad5.q.f3299f;
        ad5.g gVar2 = ad5.g.f3255a;
        if (!z17) {
            yz5.p pVar = ad5.q.f3295b;
            java.lang.Object obj2 = ad5.q.f3296c;
            if (obj2 == null) {
                obj2 = kz5.p0.f313996d;
            }
            ad5.q.f3295b = null;
            ad5.q.f3296c = null;
            if (pVar != null) {
                pVar.invoke(gVar2, obj2);
                gVar = gVar2;
            }
        }
        if (gVar == null || !kotlin.jvm.internal.o.b(gVar, gVar2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryOperationUIC", "onResume: user cancelled retransmit");
    }
}
