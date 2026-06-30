package kp1;

/* loaded from: classes11.dex */
public final class l0 implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310920a;

    public l0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310920a = audioPanelTaskBarViewRecommendV2;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (z17) {
            return;
        }
        android.widget.ImageView imageView = this.f310920a.f93008r;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.default_avatar);
        } else {
            kotlin.jvm.internal.o.o("recommendUserAvatar");
            throw null;
        }
    }
}
