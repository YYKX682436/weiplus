package kp1;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 f310955d;

    public z0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5) {
        this.f310955d = audioPanelTaskBarViewV5;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.f93028z;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5 = this.f310955d;
        audioPanelTaskBarViewV5.getClass();
        jm4.a0 a17 = jm4.c0.f300377d.a();
        pm0.v.X(new kp1.h1(audioPanelTaskBarViewV5, a17 != null ? urgen.ur_0025.UR_5379.UR_94F1(((jm4.c0) a17).getCppPointer()) : false));
        yj0.a.i(true, this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
