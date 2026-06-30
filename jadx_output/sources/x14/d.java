package x14;

/* loaded from: classes5.dex */
public final class d implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451435b;

    public d(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView, java.lang.String str) {
        this.f451434a = getHdHeadImageGalleryView;
        this.f451435b = str;
    }

    @Override // db5.c1
    public final void e(int i17) {
        if (i17 == 0) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451434a;
            ((yb0.g) b0Var).wi(getHdHeadImageGalleryView.getContext(), this.f451435b, new x14.c(getHdHeadImageGalleryView));
        }
    }
}
