package yx2;

/* loaded from: classes14.dex */
public final class b0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467831a;

    public b0(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        this.f467831a = snsFinderVideoBackPreview;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f467831a;
        thumbView = snsFinderVideoBackPreview.getThumbView();
        thumbView.post(new yx2.a0((android.graphics.Bitmap) obj, snsFinderVideoBackPreview));
    }
}
