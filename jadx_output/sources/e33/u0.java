package e33;

/* loaded from: classes10.dex */
public class u0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.e f247480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247481e;

    public u0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, i33.e eVar) {
        this.f247481e = albumPreviewUI;
        this.f247480d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        i33.e eVar = this.f247480d;
        com.tencent.mars.xlog.Log.i(eVar.f288174f, "markJumpingPermissionChange: ");
        eVar.f288178m = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f247481e.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
