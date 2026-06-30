package yx2;

/* loaded from: classes14.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f467828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467829e;

    public a0(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        this.f467828d = bitmap;
        this.f467829e = snsFinderVideoBackPreview;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView2;
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f467828d;
        kotlin.jvm.internal.o.f(resource, "$resource");
        dVar.b(resource);
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f467829e;
        thumbView = snsFinderVideoBackPreview.getThumbView();
        int width = thumbView.getWidth();
        thumbView2 = snsFinderVideoBackPreview.getThumbView();
        int height = thumbView2.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        dVar.f429144e.f429193b.d();
        dVar.a(new yx2.z(snsFinderVideoBackPreview));
    }
}
