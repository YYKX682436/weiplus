package com.tencent.mm.ui.chatting.history.components;

/* loaded from: classes10.dex */
public final class MsgHistoryGalleryPreviewTransitionUIC extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f201743d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC$previewExitEventListener$1 f201744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC$previewExitEventListener$1] */
    public MsgHistoryGalleryPreviewTransitionUIC(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f201743d = baseActivity;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f201744e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC$previewExitEventListener$1
            {
                this.__eventId = -801824477;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent msgHistoryGalleryPreviewExitEvent) {
                android.view.View findViewByPosition;
                com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent event = msgHistoryGalleryPreviewExitEvent;
                kotlin.jvm.internal.o.g(event, "event");
                android.view.LayoutInflater.Factory factory = com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC.this.f201743d;
                uc5.r rVar = factory instanceof uc5.r ? (uc5.r) factory : null;
                if (rVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "controller is null");
                    return false;
                }
                com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar;
                androidx.recyclerview.widget.f2 adapter = msgHistoryGalleryUI.m7().getAdapter();
                xm3.t0 t0Var = adapter instanceof xm3.t0 ? (xm3.t0) adapter : null;
                if (t0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "adapter is null");
                    return false;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = msgHistoryGalleryUI.m7().getLayoutManager();
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
                if (gridLayoutManager == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "layoutManager is null");
                    return false;
                }
                long j17 = event.f54498g.f8198a;
                int w17 = gridLayoutManager.w();
                int y17 = gridLayoutManager.y();
                java.util.List data = t0Var.getData();
                java.util.Iterator it = new e06.k(w17, y17).iterator();
                while (((e06.j) it).hasNext()) {
                    int b17 = ((kz5.x0) it).b();
                    java.lang.Object a07 = kz5.n0.a0(data, b17);
                    uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                    if (h0Var != null) {
                        uc5.d dVar = h0Var.f426494d;
                        uc5.d dVar2 = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                        if (dVar2 == null) {
                            dVar2 = dVar instanceof dd5.d3 ? (dd5.d3) dVar : null;
                            if (dVar2 != null) {
                            }
                        }
                        if (dVar2.p().getMsgId() == j17 && (findViewByPosition = gridLayoutManager.findViewByPosition(b17)) != null) {
                            int[] iArr = new int[2];
                            findViewByPosition.getLocationOnScreen(iArr);
                            int i17 = iArr[0];
                            am.wj wjVar = event.f54499h;
                            wjVar.f8288a = i17;
                            wjVar.f8289b = iArr[1];
                            wjVar.f8290c = findViewByPosition.getWidth();
                            wjVar.f8291d = findViewByPosition.getHeight();
                        }
                    }
                }
                return true;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        dead();
    }
}
