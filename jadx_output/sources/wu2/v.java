package wu2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment f449705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader f449706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment, com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader) {
        super(1);
        this.f449705d = finderLikeFeedGridFragment;
        this.f449706e = finderLikedFeedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.e3 it = (com.tencent.mm.plugin.finder.feed.model.e3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.f107822a != 0) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f449705d;
            com.tencent.mm.plugin.finder.feed.kd kdVar = finderLikeFeedGridFragment.f129273v;
            if (kdVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View view = kdVar.f106185r;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
            com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f449706e;
            if (textView != null) {
                textView.setText(finderLikeFeedGridFragment.y0().getResources().getString(com.tencent.mm.R.string.cuu, java.lang.Integer.valueOf(finderLikedFeedLoader.f107473e)));
            }
            finderLikeFeedGridFragment.F0(finderLikedFeedLoader.f107473e);
        }
        return jz5.f0.f302826a;
    }
}
