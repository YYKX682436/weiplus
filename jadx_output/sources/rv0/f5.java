package rv0;

/* loaded from: classes5.dex */
public final class f5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final dx0.n f400001d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer f400002e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.maas.base.MJID f400003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.k5 f400004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(rv0.k5 k5Var, android.view.View view, dx0.n thumbnailProviderManager) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(thumbnailProviderManager, "thumbnailProviderManager");
        this.f400004g = k5Var;
        this.f400001d = thumbnailProviderManager;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.qao);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f400002e = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer) findViewById;
    }
}
