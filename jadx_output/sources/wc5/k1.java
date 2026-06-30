package wc5;

/* loaded from: classes10.dex */
public final class k1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444591d;

    /* renamed from: e, reason: collision with root package name */
    public int f444592e;

    /* renamed from: f, reason: collision with root package name */
    public kn5.e f444593f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f444594g;

    /* renamed from: h, reason: collision with root package name */
    public final kn5.a f444595h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f444596i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f444597m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444591d = baseActivity;
        this.f444595h = new wc5.z0(this);
        this.f444596i = new wc5.g1(this);
        this.f444597m = new wc5.f1(this);
    }

    public static final void T6(wc5.k1 k1Var, xm3.t0 t0Var, uc5.c cVar) {
        int u07;
        com.tencent.mm.plugin.mvvmlist.MvvmList l76;
        com.tencent.mm.view.recyclerview.WxRecyclerView m76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).m7();
        int itemCount = t0Var.getItemCount();
        java.util.Iterator it = t0Var.I.f152065o.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uc5.l0 l0Var = (uc5.l0) it.next();
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f426494d;
                dVar.getClass();
                kotlin.jvm.internal.o.g(cVar, "<set-?>");
                dVar.f426476d = cVar;
            }
        }
        if (!((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).q7() && (l76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) k1Var.V6()).l7()) != null) {
            l76.d(new wc5.i1(cVar));
        }
        m76.getRecycledViewPool();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = m76.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        int i17 = gridLayoutManager != null ? gridLayoutManager.f11861w : 1;
        int i18 = (i17 + 2) * i17;
        int childCount = m76.getChildCount();
        int i19 = Integer.MAX_VALUE;
        int i27 = Integer.MIN_VALUE;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = m76.getChildAt(i28);
            if (childAt != null && (u07 = m76.u0(childAt)) != -1) {
                if (u07 < i19) {
                    i19 = u07;
                }
                if (u07 > i27) {
                    i27 = u07;
                }
            }
        }
        if (i19 <= i27) {
            int i29 = i19 - i18;
            int i37 = i29 >= 0 ? i29 : 0;
            int i38 = i27 + i18;
            int i39 = itemCount - 1;
            if (i38 > i39) {
                i38 = i39;
            }
            t0Var.notifyItemRangeChanged(i37, (i38 - i37) + 1, "state_update");
        }
    }

    public final java.util.List U6() {
        java.util.List<uc5.l0> data;
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).m7());
        if (b17 == null || (data = b17.getData()) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : data) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            uc5.d dVar = h0Var != null ? h0Var.f426494d : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            uc5.c cVar = ((uc5.d) obj).f426476d;
            if ((cVar instanceof uc5.b) && ((uc5.b) cVar).f426471a) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final uc5.r V6() {
        android.view.LayoutInflater.Factory factory = this.f444591d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void W6(java.lang.String uniqueId, uc5.c newState) {
        com.tencent.mm.plugin.mvvmlist.MvvmList l76;
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(newState, "newState");
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).m7());
        if (b17 == null) {
            return;
        }
        uc5.c cVar = null;
        for (uc5.l0 l0Var : b17.I.f152065o) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f426494d;
                if (kotlin.jvm.internal.o.b(dVar.v(), uniqueId)) {
                    if (cVar == null) {
                        cVar = dVar.f426476d;
                    }
                    dVar.getClass();
                    dVar.f426476d = newState;
                }
            }
        }
        if (!((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).q7() && (l76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).l7()) != null) {
            l76.d(new wc5.j1(uniqueId, newState));
        }
        if (cVar != null) {
            int i17 = (((newState instanceof uc5.b) && ((uc5.b) newState).f426471a) ? 1 : 0) - (((cVar instanceof uc5.b) && ((uc5.b) cVar).f426471a) ? 1 : 0);
            if (i17 != 0) {
                this.f444592e += i17;
                X6();
            }
        }
    }

    public final void X6() {
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView)) {
            W6 = null;
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) W6;
        if (msgHistoryGalleryActionBarView == null) {
            return;
        }
        msgHistoryGalleryActionBarView.setFilterOptionCount(this.f444592e);
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W62 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class);
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView msgHistoryGalleryToolBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView) (W62 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView ? W62 : null);
        if (msgHistoryGalleryToolBarView == null) {
            return;
        }
        msgHistoryGalleryToolBarView.setButtonsEnabled(this.f444592e > 0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        kn5.e eVar = this.f444593f;
        if (eVar != null) {
            ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) V6()).m7().U0(eVar);
        }
        this.f444593f = null;
        super.onFinished();
    }
}
