package iv0;

/* loaded from: classes5.dex */
public final class c extends qv0.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dvb, bodyContainerLayout);
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String b17 = j65.q.b(getContext(), com.tencent.mm.R.string.mt7);
        kotlin.jvm.internal.o.f(b17, "safeGetString(...)");
        return b17;
    }
}
