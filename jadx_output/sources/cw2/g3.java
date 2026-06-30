package cw2;

/* loaded from: classes2.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout, java.lang.String str) {
        super(0);
        this.f223725d = finderLiveCardMediaLayout;
        this.f223726e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223725d;
        cw2.da videoView = finderLiveCardMediaLayout.getVideoView();
        if (kotlin.jvm.internal.o.a(videoView != null ? java.lang.Float.valueOf(videoView.getAlpha()) : null, 1.0f)) {
            com.tencent.mars.xlog.Log.w("FinderLiveCardMediaLayout", "return for alpha == 1.");
        } else {
            cw2.da videoView2 = finderLiveCardMediaLayout.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(1.0f);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveCardMediaLayout", "[showLive] " + this.f223726e + ' ' + finderLiveCardMediaLayout.e());
        }
        return jz5.f0.f302826a;
    }
}
