package yv0;

/* loaded from: classes5.dex */
public final class f extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f465961d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.maas.base.MJID f465962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yv0.h f465963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yv0.h hVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f465963f = hVar;
        this.f465961d = jz5.h.b(new yv0.e(this));
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer i() {
        java.lang.Object value = ((jz5.n) this.f465961d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer) value;
    }

    public final void j(double d17) {
        i().post(new yv0.c(this, d17));
    }

    public final void k(double d17, com.tencent.maas.moviecomposing.layout.OffsetRange offset) {
        kotlin.jvm.internal.o.g(offset, "offset");
        i().post(new yv0.d(this, d17, offset));
    }

    public final void l(android.graphics.Rect cachedFrame) {
        kotlin.jvm.internal.o.g(cachedFrame, "cachedFrame");
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.view.ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = cachedFrame.width();
        layoutParams.height = cachedFrame.height();
        itemView.setLayoutParams(layoutParams);
        i();
    }
}
