package gd2;

/* loaded from: classes3.dex */
public final class q implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270555a;

    public q(gd2.x xVar) {
        this.f270555a = xVar;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
        ((gd2.j) this.f270555a.f270567d).a();
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        ((gd2.j) this.f270555a.f270567d).a();
    }

    @Override // sy3.e
    public void c(long j17) {
        gd2.n nVar = ((gd2.j) this.f270555a.f270567d).f270541a;
        nVar.f270550f = true;
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) nVar.f270546b.invoke();
        if (finderCommentImageGalleryView == null) {
            return;
        }
        finderCommentImageGalleryView.f210063o = true;
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("FinderCommentImageTransAndOcrLogic", "dealWithImageOcr onDialogShow");
        gd2.x xVar = this.f270555a;
        xVar.f270567d.getClass();
        gd2.x.a(xVar);
    }

    @Override // sy3.e
    public void onError(int i17, int i18) {
        gd2.x xVar = this.f270555a;
        ((gd2.j) xVar.f270567d).a();
        gd2.x.a(xVar);
    }
}
