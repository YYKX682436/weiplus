package rv0;

/* loaded from: classes5.dex */
public final class o5 extends qv0.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // qv0.f
    public boolean E(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return super.E(view);
    }

    @Override // qv0.f
    public boolean F(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return super.F(view);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfv, bodyContainerLayout);
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492487ll0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
    }
}
