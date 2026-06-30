package wu2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment f449703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader f449704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment, com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader) {
        super(0);
        this.f449703d = finderLikeFeedGridFragment;
        this.f449704e = finderLikedFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f449703d;
        com.tencent.mm.plugin.finder.feed.kd kdVar = finderLikeFeedGridFragment.f129273v;
        if (kdVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        kdVar.f106180m.setEnableLoadMore(finderLikeFeedGridFragment.G0().getSize() > 10);
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f449704e;
        if (finderLikedFeedLoader.f107473e > 0) {
            com.tencent.mm.plugin.finder.feed.kd kdVar2 = finderLikeFeedGridFragment.f129273v;
            if (kdVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = kdVar2.f106180m.getF213435x();
            android.view.View findViewById = f213435x != null ? f213435x.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.kd kdVar3 = finderLikeFeedGridFragment.f129273v;
            if (kdVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = kdVar3.f106180m.getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setVisibility(0);
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f1d, java.lang.Integer.valueOf(finderLikedFeedLoader.f107473e)));
            }
        } else {
            com.tencent.mm.plugin.finder.feed.kd kdVar4 = finderLikeFeedGridFragment.f129273v;
            if (kdVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = kdVar4.f106180m.getF213435x();
            android.view.View findViewById2 = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById2;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.kd kdVar5 = finderLikeFeedGridFragment.f129273v;
            if (kdVar5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = kdVar5.f106180m.getF213435x();
            android.widget.TextView textView2 = f213435x4 != null ? (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
