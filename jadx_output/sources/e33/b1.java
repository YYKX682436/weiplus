package e33;

/* loaded from: classes10.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.e f247148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247149e;

    public b1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, i33.e eVar) {
        this.f247149e = albumPreviewUI;
        this.f247148d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247149e;
        if (!z2.h.b(albumPreviewUI, "android.permission.WRITE_EXTERNAL_STORAGE") || ((i17 = android.os.Build.VERSION.SDK_INT) >= 34 && albumPreviewUI.getApplicationInfo().targetSdkVersion >= 34)) {
            i33.e eVar = this.f247148d;
            com.tencent.mars.xlog.Log.i(eVar.f288174f, "markJumpingPermissionChange: ");
            eVar.f288178m = true;
            eVar.X6("go_grant_purview");
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            androidx.appcompat.app.AppCompatActivity context = albumPreviewUI.getContext();
            ((sb0.f) jVar).getClass();
            j35.u.g(context);
        } else {
            albumPreviewUI.K1 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(albumPreviewUI, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 145, albumPreviewUI.getString(com.tencent.mm.R.string.hht), albumPreviewUI.getString(i17 < 33 ? com.tencent.mm.R.string.fip : com.tencent.mm.R.string.msk));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
