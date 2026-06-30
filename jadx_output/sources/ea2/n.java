package ea2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250574d;

    public n(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250574d = finderMusicTopicHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initBottomBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f250574d.d7().f434717f.findViewById(com.tencent.mm.R.id.k0e).performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initBottomBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
