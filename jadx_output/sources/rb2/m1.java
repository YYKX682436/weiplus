package rb2;

/* loaded from: classes3.dex */
public final class m1 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393689a;

    public m1(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f393689a = finderCommentImageGalleryView;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393689a;
        android.content.Context context = finderCommentImageGalleryView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(context);
        if (a17 == null) {
            return;
        }
        java.lang.String localImagePath = finderCommentImageGalleryView.getLocalImagePath();
        if (localImagePath == null || r26.n0.N(localImagePath)) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "localImagePath is empty, cannot show the image menu!!!");
            return;
        }
        rb2.d1 d1Var = finderCommentImageGalleryView.f103082y0;
        android.graphics.Bitmap bitmap = d1Var != null ? d1Var.f393607f : null;
        gd2.n menuData = finderCommentImageGalleryView.getMenuData();
        if (finderCommentImageGalleryView.getSelectedView() != null && bitmap != null && menuData != null) {
            try {
                new gd2.i(a17, localImagePath, this.f393689a, (gd2.x) ((jz5.n) menuData.f270554j).getValue(), new rb2.k1(menuData, localImagePath), rb2.l1.f393678d).a();
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", "show image menu failed. " + e17.getMessage());
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cannot show the image menu, bitmap==null:");
        sb6.append(bitmap == null);
        sb6.append(" selectedView:");
        sb6.append(finderCommentImageGalleryView.getSelectedView());
        sb6.append(" currentMenuData:");
        sb6.append(menuData);
        com.tencent.mars.xlog.Log.e("FinderCommentImageGalleryView", sb6.toString());
    }
}
