package ev0;

/* loaded from: classes5.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel f256850d;

    public i0(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        this.f256850d = soundTrackPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createClipView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel.c(this.f256850d);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createClipView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
