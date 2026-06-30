package hw0;

/* loaded from: classes5.dex */
public final class p extends ov0.t {

    /* renamed from: y1, reason: collision with root package name */
    public boolean f285477y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setStyleDataList(java.util.List<kw0.a> list) {
        android.view.View stylePageView = getStylePageView();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView = stylePageView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) stylePageView : null;
        if (replaceStyleView != null) {
            replaceStyleView.setStyleDataList(list);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public void E() {
        super.E();
        if (getEditPurpose$plugin_mj_template_release() != mv0.c.f331532d || this.f285477y1) {
            return;
        }
        java.util.Objects.toString(getEditText().getText());
        this.f285477y1 = true;
        getEditText().selectAll();
    }

    @Override // ov0.t
    public void L() {
        getNextBtn().setVisibility(8);
    }

    public final void S(int i17) {
        android.view.View stylePageView = getStylePageView();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView = stylePageView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) stylePageView : null;
        if (replaceStyleView != null) {
            replaceStyleView.a(i17);
        }
    }

    public final mv0.c getEditPurpose$plugin_mj_template_release() {
        mv0.c cVar = (mv0.c) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "key_edit_purpose", null, 2, null);
        return cVar == null ? mv0.c.f331533e : cVar;
    }

    public final void setFancyTextUiState(kw0.e state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.List<kw0.a> list = state.f312801a;
        if (list.isEmpty()) {
            return;
        }
        kw0.k kVar = state.f312803c;
        if (kVar instanceof kw0.f) {
            return;
        }
        boolean z17 = kVar instanceof kw0.g;
        int i17 = state.f312802b;
        if (!z17) {
            if (kVar instanceof kw0.i) {
                setStyleDataList(list);
                S(i17);
                return;
            } else {
                if (kVar instanceof kw0.j) {
                    S(i17);
                    return;
                }
                return;
            }
        }
        kw0.g gVar = (kw0.g) kVar;
        kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f312805a);
        if (aVar != null) {
            android.view.View stylePageView = getStylePageView();
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView = stylePageView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) stylePageView : null;
            if (replaceStyleView != null) {
                iw0.c cVar = replaceStyleView.f69314e;
                cVar.getClass();
                cVar.x(gVar.f312805a, aVar);
            }
        }
        if (kVar instanceof kw0.h) {
            S(i17);
        }
    }

    public final void setSelectedCallback(mw0.h stickerStyleCallback) {
        kotlin.jvm.internal.o.g(stickerStyleCallback, "stickerStyleCallback");
        android.view.View stylePageView = getStylePageView();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView = stylePageView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView) stylePageView : null;
        if (replaceStyleView == null) {
            return;
        }
        replaceStyleView.setSelectedStickerStyleCallback(stickerStyleCallback);
    }
}
