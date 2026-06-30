package jq4;

/* loaded from: classes5.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView f301121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301122e;

    public a1(com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView, android.view.View view) {
        this.f301121d = voIPRenderTextureView;
        this.f301122e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f301121d;
        android.view.ViewGroup.LayoutParams layoutParams = voIPRenderTextureView.getLayoutParams();
        android.view.View view = this.f301122e;
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        voIPRenderTextureView.setLayoutParams(layoutParams);
    }
}
