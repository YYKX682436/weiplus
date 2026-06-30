package kp1;

/* loaded from: classes11.dex */
public final class k0 implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310916a;

    public k0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310916a = audioPanelTaskBarViewRecommendV2;
    }

    @Override // ff0.v
    public void a(java.lang.String imageKey, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2.B;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310916a;
        audioPanelTaskBarViewRecommendV2.getClass();
        if ((imageKey == null || imageKey.length() == 0) || !z17) {
            audioPanelTaskBarViewRecommendV2.q();
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            audioPanelTaskBarViewRecommendV2.q();
            return;
        }
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        android.widget.RelativeLayout relativeLayout = audioPanelTaskBarViewRecommendV2.f93006p;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("recommendContainer");
            throw null;
        }
        kp1.e0 e0Var = new kp1.e0(audioPanelTaskBarViewRecommendV2);
        dl4.m0 m0Var = (dl4.m0) tVar;
        m0Var.getClass();
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        m0Var.ij(imageKey, relativeLayout, bitmap, null, e0Var);
    }
}
