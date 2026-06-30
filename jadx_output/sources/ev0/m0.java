package ev0;

/* loaded from: classes5.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel f256859d;

    public m0(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        this.f256859d = soundTrackPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createMainView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
        Ai.put("view_id", "mjpublisher_touch_bgm_adjust_lyric");
        ((cy1.a) rVar).yj("mjpublisher_touch_bgm_adjust_lyric", null, Ai, 6, false);
        com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel = this.f256859d;
        soundTrackPanel.f69197h = !soundTrackPanel.f69197h;
        yz5.l onLyricVisibleChangedListener = soundTrackPanel.getOnLyricVisibleChangedListener();
        if (onLyricVisibleChangedListener != null) {
            onLyricVisibleChangedListener.invoke(java.lang.Boolean.valueOf(soundTrackPanel.f69197h));
        }
        if (soundTrackPanel.f69197h) {
            android.widget.TextView textView = soundTrackPanel.f69201o;
            if (textView == null) {
                kotlin.jvm.internal.o.o("lyricTitle");
                throw null;
            }
            textView.setText(soundTrackPanel.getContext().getText(com.tencent.mm.R.string.o8t));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = soundTrackPanel.f69202p;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("lyricIcon");
                throw null;
            }
            weImageView.setImageResource(com.tencent.mm.R.drawable.d5o);
        } else {
            android.widget.TextView textView2 = soundTrackPanel.f69201o;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("lyricTitle");
                throw null;
            }
            textView2.setText(soundTrackPanel.getContext().getText(com.tencent.mm.R.string.o8s));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = soundTrackPanel.f69202p;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("lyricIcon");
                throw null;
            }
            weImageView2.setImageResource(com.tencent.mm.R.drawable.d5n);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createMainView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
