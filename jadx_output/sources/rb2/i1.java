package rb2;

/* loaded from: classes15.dex */
public final class i1 implements com.tencent.mm.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393649a;

    public i1(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f393649a = finderCommentImageGalleryView;
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void a(float f17, float f18) {
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393649a;
        com.tencent.mm.ui.tools.o5 o5Var = finderCommentImageGalleryView.A1;
        if (o5Var != null) {
            finderCommentImageGalleryView.f103080x0 = f18 > 200.0f;
            o5Var.a(f17, f18);
        }
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void b(float f17, float f18) {
        com.tencent.mm.ui.tools.o5 o5Var = this.f393649a.A1;
        if (o5Var != null) {
            o5Var.b(f17, f18);
        }
    }
}
