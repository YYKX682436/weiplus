package ea2;

/* loaded from: classes2.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250586d;

    public w(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250586d = finderMusicTopicHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initPost$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250586d;
        finderMusicTopicHeaderUIC.e7("HeaderPost", finderMusicTopicHeaderUIC.getActivity(), finderMusicTopicHeaderUIC.X6());
        kotlin.jvm.internal.o.d(view);
        hc2.v0.d(view, "music_topic_page_post_button", "view_clk", false, finderMusicTopicHeaderUIC.a7(), null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initPost$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
