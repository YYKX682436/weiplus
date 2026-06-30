package cw2;

/* loaded from: classes2.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout, java.lang.String str) {
        super(0);
        this.f223561d = finderLiveCardMediaLayout;
        this.f223562e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223561d;
        cw2.da videoView = finderLiveCardMediaLayout.getVideoView();
        if (kotlin.jvm.internal.o.a(videoView != null ? java.lang.Float.valueOf(videoView.getAlpha()) : null, 0.0f)) {
            com.tencent.mars.xlog.Log.w("FinderLiveCardMediaLayout", "return for alpha == 0.");
        } else {
            cw2.da videoView2 = finderLiveCardMediaLayout.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(0.0f);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveCardMediaLayout", "[hideLive] " + this.f223562e + ' ' + finderLiveCardMediaLayout.e());
        }
        return jz5.f0.f302826a;
    }
}
