package i53;

/* loaded from: classes8.dex */
public class d4 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI f288561d;

    public d4(com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI gameVideoEditorProxyUI) {
        this.f288561d = gameVideoEditorProxyUI;
    }

    @Override // ut3.e, ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        android.util.SparseArray sparseArray;
        com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI gameVideoEditorProxyUI = this.f288561d;
        bundle.putInt("key_video_from", gameVideoEditorProxyUI.f140085f);
        bundle.putString("key_raw_video_path", gameVideoEditorProxyUI.f140088i);
        bundle.putInt("key_raw_video_duration", gameVideoEditorProxyUI.f140092p.a());
        bundle.putInt("key_raw_video_size", (int) com.tencent.mm.vfs.w6.k(gameVideoEditorProxyUI.f140088i));
        bundle.putInt("key_game_haowan_flag", 10);
        bundle.putInt("game_haowan_source_scene_id", gameVideoEditorProxyUI.f140097u);
        if (gameVideoEditorProxyUI.f140085f == 2 && (sparseArray = gameVideoEditorProxyUI.f140089m) != null) {
            if (sparseArray.size() > 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: more than 1 share options and need to show actionsheet");
                com.tencent.mm.ui.widget.dialog.k0 k0Var = gameVideoEditorProxyUI.f140091o;
                if (k0Var != null) {
                    k0Var.u();
                }
                gameVideoEditorProxyUI.f140091o = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = gameVideoEditorProxyUI.f140091o;
                k0Var2.f211872n = new i53.b4(this);
                k0Var2.f211881s = new i53.c4(this, bundle, cVar);
                k0Var2.v();
                return true;
            }
            com.tencent.mm.plugin.game.api.GameShareOption gameShareOption = gameVideoEditorProxyUI.f140090n;
            if (gameShareOption != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: only 1 option. use default, dafault id is %d", java.lang.Integer.valueOf(gameShareOption.f138694d));
                bundle.putInt("key_selected_item", gameVideoEditorProxyUI.f140090n.f138694d);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: no default option!");
            }
        }
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putAll(bundle);
        p95.a.a(new i53.a4(this, context, captureDataManager$CaptureVideoNormalModel, bundle2));
    }
}
