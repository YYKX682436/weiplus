package wu2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment f449682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment) {
        super(1);
        this.f449682d = finderFavFeedFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = this.f449682d;
        if (finderFavFeedFragment.G0().f107411g != 0) {
            com.tencent.mm.plugin.finder.feed.l7 l7Var = finderFavFeedFragment.f129256v;
            if (l7Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View view = l7Var.f106185r;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
            if (textView != null) {
                textView.setText(finderFavFeedFragment.y0().getResources().getString(com.tencent.mm.R.string.cuu, java.lang.Integer.valueOf(finderFavFeedFragment.G0().f107411g)));
            }
            finderFavFeedFragment.F0(finderFavFeedFragment.G0().f107411g);
        }
        if (!((com.tencent.mm.plugin.finder.feed.model.b1) it).getHasMore()) {
            com.tencent.mm.plugin.finder.feed.l7 l7Var2 = finderFavFeedFragment.f129256v;
            if (l7Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            l7Var2.W();
            finderFavFeedFragment.A = true;
        }
        return jz5.f0.f302826a;
    }
}
