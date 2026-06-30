package jv0;

/* loaded from: classes5.dex */
public final class a extends qv0.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // qv0.f
    public boolean D() {
        return false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.y(false);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dvd, bodyContainerLayout);
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String b17 = j65.q.b(getContext(), com.tencent.mm.R.string.lkl);
        kotlin.jvm.internal.o.f(b17, "safeGetString(...)");
        return b17;
    }

    @Override // qv0.f, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Boolean bool = (java.lang.Boolean) j("ket_should_intercept_outside_touch_event", java.lang.Boolean.TRUE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void s() {
        setResult(java.lang.Boolean.valueOf(getUserActed$plugin_mj_template_release()));
    }
}
