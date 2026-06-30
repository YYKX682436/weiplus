package x14;

/* loaded from: classes5.dex */
public final class c implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451433a;

    public c(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView) {
        this.f451433a = getHdHeadImageGalleryView;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451433a;
        q75.c.f(destPath, getHdHeadImageGalleryView.getContext());
        dp.a.makeText(getHdHeadImageGalleryView.getContext(), getHdHeadImageGalleryView.getContext().getString(com.tencent.mm.R.string.frx, q75.c.d()), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451433a;
        dp.a.makeText(getHdHeadImageGalleryView.getContext(), getHdHeadImageGalleryView.getContext().getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
