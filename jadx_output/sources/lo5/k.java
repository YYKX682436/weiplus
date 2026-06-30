package lo5;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f320217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView f320218e;

    public k(android.widget.FrameLayout frameLayout, com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView voIPMPVoIPVideoView) {
        this.f320217d = frameLayout;
        this.f320218e = voIPMPVoIPVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = this.f320217d;
        frameLayout.addView(this.f320218e, new android.widget.FrameLayout.LayoutParams(frameLayout.getWidth(), frameLayout.getHeight()));
    }
}
