package gd2;

/* loaded from: classes3.dex */
public final class j implements gd2.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd2.n f270541a;

    public j(gd2.n nVar) {
        this.f270541a = nVar;
    }

    public void a() {
        gd2.n nVar = this.f270541a;
        nVar.f270550f = false;
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) nVar.f270546b.invoke();
        if (finderCommentImageGalleryView == null) {
            return;
        }
        finderCommentImageGalleryView.f210063o = false;
    }
}
