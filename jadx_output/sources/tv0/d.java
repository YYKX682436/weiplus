package tv0;

/* loaded from: classes5.dex */
public final class d extends qv0.f {
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f422184J;
    public final jz5.g K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = jz5.h.b(new tv0.b(this));
        this.f422184J = jz5.h.b(new tv0.c(this));
        this.K = jz5.h.b(new tv0.a(this));
    }

    private final android.widget.TextView getMcEditCropPlayerTime() {
        java.lang.Object value = ((jz5.n) this.I).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // qv0.f
    public boolean D() {
        return false;
    }

    public final void K(com.tencent.maas.model.time.MJTime currentTime) {
        kotlin.jvm.internal.o.g(currentTime, "currentTime");
        getMcEditCropPlayerTime().setText(ou0.f.d((long) currentTime.toMilliseconds()));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.w(true);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dvc, bodyContainerLayout);
    }

    public final android.view.View getBtnReset$plugin_mj_template_release() {
        java.lang.Object value = ((jz5.n) this.K).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView getTimelineView$plugin_mj_template_release() {
        java.lang.Object value = ((jz5.n) this.f422184J).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView) value;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.mtq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
