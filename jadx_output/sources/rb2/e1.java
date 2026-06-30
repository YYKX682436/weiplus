package rb2;

/* loaded from: classes15.dex */
public final class e1 implements com.tencent.mm.ui.tools.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393619a;

    public e1(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f393619a = finderCommentImageGalleryView;
    }

    @Override // com.tencent.mm.ui.tools.s5
    public void a() {
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393619a;
        if (finderCommentImageGalleryView.D1) {
            com.tencent.mm.ui.tools.s5 s5Var = finderCommentImageGalleryView.f103081x1;
            if (s5Var != null) {
                s5Var.a();
            }
            finderCommentImageGalleryView.D1 = false;
        }
    }
}
