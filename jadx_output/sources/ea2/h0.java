package ea2;

/* loaded from: classes2.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f250557e;

    public h0(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, boolean z17) {
        this.f250556d = finderMusicTopicHeaderUIC;
        this.f250557e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showLikeTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250556d;
        if (this.f250557e) {
            finderMusicTopicHeaderUIC.e7("BottomBar", finderMusicTopicHeaderUIC.getActivity(), finderMusicTopicHeaderUIC.X6());
        } else {
            finderMusicTopicHeaderUIC.getClass();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity context = finderMusicTopicHeaderUIC.getContext();
            bw5.o50 o50Var = new bw5.o50();
            o50Var.i("1010");
            com.tencent.mm.plugin.finder.assist.i0.gl((com.tencent.mm.plugin.finder.assist.i0) c17, context, o50Var, bw5.ar0.TingScene_FinderProfileMusicianList, false, false, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showLikeTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
