package kp1;

/* loaded from: classes11.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310906d;

    public h0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310906d = audioPanelTaskBarViewRecommendV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2.B;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310906d;
        np1.a currentPlayInfo = audioPanelTaskBarViewRecommendV2.getCurrentPlayInfo();
        if (currentPlayInfo != null) {
            pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
            if (audioPanelTaskBarViewRecommendV2.f93014x != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bw5.xb0 xb0Var = audioPanelTaskBarViewRecommendV2.f93014x;
                bundle2.putInt("key_listen_sync_item_type", xb0Var != null ? xb0Var.f35045e : 0);
                bundle = bundle2;
            } else {
                bundle = null;
            }
            ((ov.b) zVar).N9(1, currentPlayInfo, 1, bundle, new kp1.f0(audioPanelTaskBarViewRecommendV2));
        } else {
            if (audioPanelTaskBarViewRecommendV2.f93014x != null) {
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).L(true);
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).N(false);
            }
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.os.Bundle bundle3 = new android.os.Bundle();
            bw5.xb0 xb0Var2 = audioPanelTaskBarViewRecommendV2.f93014x;
            bundle3.putInt("key_listen_sync_item_type", xb0Var2 != null ? xb0Var2.f35045e : 0);
            ((rk4.k8) aj6).y(context, bundle3, bw5.ar0.TingScene_MediaControlCenter, new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, 1, null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null), new kp1.g0(audioPanelTaskBarViewRecommendV2));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
