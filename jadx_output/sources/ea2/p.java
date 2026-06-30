package ea2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r23 f250576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250577e;

    public p(r45.r23 r23Var, com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250576d = r23Var;
        this.f250577e = finderMusicTopicHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initEffectTemplate$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((r45.rz6) this.f250576d.getCustom(1)) != null) {
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250577e;
            finderMusicTopicHeaderUIC.e7("EffectTemplate", finderMusicTopicHeaderUIC.getActivity(), finderMusicTopicHeaderUIC.X6());
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.p7(finderMusicTopicHeaderUIC, 108, null, null, 0, 14, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initEffectTemplate$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
