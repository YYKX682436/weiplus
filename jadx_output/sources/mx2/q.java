package mx2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout f332515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout, java.lang.String str) {
        super(0);
        this.f332515d = finderLivePhotoLayout;
        this.f332516e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView thumbView;
        java.lang.String f132330e;
        java.lang.String f132330e2;
        com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout = this.f332515d;
        cw2.da videoView = finderLivePhotoLayout.getVideoView();
        if (kotlin.jvm.internal.o.a(videoView != null ? java.lang.Float.valueOf(videoView.getAlpha()) : null, 1.0f)) {
            f132330e2 = finderLivePhotoLayout.getF132330e();
            com.tencent.mars.xlog.Log.w(f132330e2, "dismissThumb return for alpha == 1.");
        } else {
            cw2.da videoView2 = finderLivePhotoLayout.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(1.0f);
            }
            thumbView = finderLivePhotoLayout.getThumbView();
            thumbView.setVisibility(8);
            f132330e = finderLivePhotoLayout.getF132330e();
            com.tencent.mars.xlog.Log.i(f132330e, "[dismissThumb] " + this.f332516e);
        }
        return jz5.f0.f302826a;
    }
}
