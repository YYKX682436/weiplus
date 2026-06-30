package na2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment f335979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment finderPostPlayFragment) {
        super(1);
        this.f335979d = finderPostPlayFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.w5 response = (com.tencent.mm.plugin.finder.feed.model.w5) obj;
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.Object response2 = response.getResponse();
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment finderPostPlayFragment = this.f335979d;
        if (response2 != null && (response2 instanceof r45.l91)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("First tab refresh callback: title=");
            r45.l91 l91Var = (r45.l91) response2;
            sb6.append(l91Var.getString(1));
            sb6.append(", subTitle=");
            sb6.append(l91Var.getString(2));
            sb6.append(", favStatus=");
            sb6.append(l91Var.getInteger(6));
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewTabUIC", sb6.toString());
            com.tencent.mm.ui.MMActivity y07 = finderPostPlayFragment.y0();
            com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI finderPostPlayUI = y07 instanceof com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI ? (com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI) y07 : null;
            if (finderPostPlayUI != null) {
                java.lang.String string = l91Var.getString(1);
                java.lang.String string2 = l91Var.getString(2);
                com.tencent.mars.xlog.Log.i("FinderPostPlayNewUI", "updateTitle: title=" + string + ", subTitle=" + string2);
                pf5.z zVar = pf5.z.f353948a;
                na2.k kVar = (na2.k) zVar.a(finderPostPlayUI).a(na2.k.class);
                kVar.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateTitle: title=" + string + ", subTitle=" + string2);
                if (string != null && (textView2 = kVar.f335966g) != null) {
                    textView2.setText(string);
                }
                if (string2 != null && (textView = kVar.f335967h) != null) {
                    textView.setText(string2);
                }
                int integer = l91Var.getInteger(6);
                com.tencent.mars.xlog.Log.i("FinderPostPlayNewUI", "updateFavStatus: favStatus=" + integer);
                ((na2.k) zVar.a(finderPostPlayUI).a(na2.k.class)).V6(integer);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = finderPostPlayFragment.f110045w;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(baseFinderFeedLoader.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("First tab refresh callback: fallback firstFeed=");
        sb7.append(baseFinderFeed != null ? java.lang.Long.valueOf(baseFinderFeed.getItemId()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewTabUIC", sb7.toString());
        com.tencent.mm.ui.MMActivity activity = finderPostPlayFragment.y0();
        kotlin.jvm.internal.o.g(activity, "activity");
        na2.f fVar = (na2.f) pf5.z.f353948a.a(activity).e(na2.f.class);
        if (fVar != null && fVar.f335957d == null) {
            if (baseFinderFeed == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onRecommendTabFetchRefreshDone: firstFeed is null, skip");
            } else {
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                fVar.f335957d = feedObject;
                fVar.f335958e = baseFinderFeed;
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onRecommendTabFetchRefreshDone: prepare audio track from recommend first feedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
                qd2.g gVar = (qd2.g) ((jz5.n) fVar.f335960g).getValue();
                if (gVar.f361728b == null && feedObject != null) {
                    gVar.f361728b = feedObject;
                    gVar.d(null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
