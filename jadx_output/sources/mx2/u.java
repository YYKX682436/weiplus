package mx2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout f332524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout) {
        super(0);
        this.f332524d = finderLivePhotoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView thumbView;
        java.lang.String f132330e;
        com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout = this.f332524d;
        cw2.da videoView = finderLivePhotoLayout.getVideoView();
        if (!((videoView != null ? videoView.getAlpha() : 0.0f) == 0.0f)) {
            cw2.da videoView2 = finderLivePhotoLayout.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(0.0f);
            }
            thumbView = finderLivePhotoLayout.getThumbView();
            thumbView.setVisibility(0);
            f132330e = finderLivePhotoLayout.getF132330e();
            com.tencent.mars.xlog.Log.i(f132330e, "[showThumb]");
        }
        return jz5.f0.f302826a;
    }
}
