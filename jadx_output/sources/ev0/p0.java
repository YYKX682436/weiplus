package ev0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel f256869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        super(0);
        this.f256869d = soundTrackPanel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel.f69192q;
        com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel = this.f256869d;
        soundTrackPanel.getClass();
        android.widget.ViewFlipper viewFlipper = new android.widget.ViewFlipper(soundTrackPanel.getContext());
        android.view.View inflate = android.view.LayoutInflater.from(soundTrackPanel.getContext()).inflate(com.tencent.mm.R.layout.ej_, (android.view.ViewGroup) null);
        inflate.findViewById(com.tencent.mm.R.id.v_0).setOnClickListener(new ev0.k0(soundTrackPanel));
        inflate.findViewById(com.tencent.mm.R.id.v9r).setOnClickListener(new ev0.l0(soundTrackPanel));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.v9z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        soundTrackPanel.f69201o = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.v9y);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        soundTrackPanel.f69202p = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        inflate.findViewById(com.tencent.mm.R.id.v9x).setOnClickListener(new ev0.m0(soundTrackPanel));
        viewFlipper.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View inflate2 = android.view.LayoutInflater.from(soundTrackPanel.getContext()).inflate(com.tencent.mm.R.layout.ej8, (android.view.ViewGroup) null);
        inflate2.findViewById(com.tencent.mm.R.id.v9s).setOnClickListener(new ev0.e0(soundTrackPanel));
        android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.sbp);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById3);
        android.view.View findViewById4 = inflate2.findViewById(com.tencent.mm.R.id.sbr);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById4);
        android.view.View findViewById5 = inflate2.findViewById(com.tencent.mm.R.id.shv);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        ((com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById5).setOnSeekBarChangeListener(new ev0.f0(soundTrackPanel));
        android.view.View findViewById6 = inflate2.findViewById(com.tencent.mm.R.id.unq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        ((com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar) findViewById6).setOnSeekBarChangeListener(new ev0.g0(soundTrackPanel));
        if (soundTrackPanel.f69193d) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate2.findViewById(com.tencent.mm.R.id.sbs);
            android.view.View findViewById7 = constraintLayout.findViewById(com.tencent.mm.R.id.sbq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel", "createAdjustVolumeView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel", "createAdjustVolumeView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById8 = constraintLayout.findViewById(com.tencent.mm.R.id.sbo);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(constraintLayout);
            cVar.c(findViewById8.getId(), 4);
            cVar.e(findViewById8.getId(), 4, 0, 4);
            cVar.b(constraintLayout);
            constraintLayout.setConstraintSet(null);
        }
        viewFlipper.addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View inflate3 = android.view.LayoutInflater.from(soundTrackPanel.getContext()).inflate(com.tencent.mm.R.layout.ej9, (android.view.ViewGroup) null);
        inflate3.findViewById(com.tencent.mm.R.id.v9v).setOnClickListener(new ev0.h0(soundTrackPanel));
        inflate3.findViewById(com.tencent.mm.R.id.v9w).setOnClickListener(new ev0.i0(soundTrackPanel));
        viewFlipper.addView(inflate3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return viewFlipper;
    }
}
