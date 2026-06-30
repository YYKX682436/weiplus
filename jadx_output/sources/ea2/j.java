package ea2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f250561e;

    public j(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f250560d = finderMusicTopicHeaderUIC;
        this.f250561e = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea2.g.b(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.f101758w, this.f250560d.getActivity(), this.f250561e.getFeedObject().getUserName(), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
