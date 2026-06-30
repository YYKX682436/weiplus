package e33;

/* loaded from: classes4.dex */
public class p0 implements s23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247429a;

    public p0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247429a = albumPreviewUI;
    }

    @Override // s23.o
    public boolean a() {
        return true;
    }

    @Override // s23.o
    public void b(int i17) {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247429a;
        if (i17 <= 0) {
            albumPreviewUI.getClass();
        } else {
            albumPreviewUI.Q = i17;
            albumPreviewUI.a8(albumPreviewUI.f138528m.J());
        }
    }

    @Override // s23.o
    public java.util.ArrayList c() {
        e33.b0 b0Var = this.f247429a.f138528m;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f247131g;
    }

    @Override // s23.o
    public boolean d() {
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        ez0.f fVar = ez0.f.f257790a;
        boolean z17 = !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_maas_album_tips_display_force_disable, false);
        boolean z18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SERVER_VIDEO_TEMPLATE_TIPS_DISABLE_INT, 0) == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "checkConfigEnableDisplay: " + z17 + ' ' + z18);
        return z17 && z18;
    }

    @Override // s23.o
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this.f247429a;
    }
}
