package kv0;

/* loaded from: classes5.dex */
public final class a extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel {
    public final hv0.i A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = new hv0.i();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfx, bodyContainerLayout);
    }

    public final hv0.i getPanelAnimation() {
        return this.A;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public android.graphics.drawable.Drawable getPanelBackground() {
        return new android.graphics.drawable.ColorDrawable(j65.q.a(getContext()).getColor(com.tencent.mm.R.color.acy, null));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        float panelHeight = getPanelHeight();
        hv0.i iVar = this.A;
        iVar.f285260a = panelHeight;
        setPanelAnimation(iVar);
    }
}
