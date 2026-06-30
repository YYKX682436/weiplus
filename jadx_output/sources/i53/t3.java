package i53;

/* loaded from: classes12.dex */
public class t3 implements m33.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f288740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoDownloadUI f288741b;

    public t3(com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI, android.view.View view) {
        this.f288741b = gameVideoDownloadUI;
        this.f288740a = view;
    }

    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.tencent.mm.vfs.w6.w(str, replace);
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download videoPath:%s", replace);
            str = replace;
        }
        com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI = this.f288741b;
        if (i17 == 0) {
            com.tencent.mm.game.report.l.f(gameVideoDownloadUI.f140073f, 87, 8760, 0, 48, gameVideoDownloadUI.f140077m, gameVideoDownloadUI.f140082r, lj0.a.a(gameVideoDownloadUI.f140075h, gameVideoDownloadUI.V6(0)));
            com.tencent.mm.sdk.platformtools.u3.h(new i53.s3(this));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(gameVideoDownloadUI.getIntent().getExtras());
            intent.putExtra("video_path", str);
            j45.l.n(gameVideoDownloadUI.f140073f, "game", ".media.GameVideoEditorProxyUI", intent, 223);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.game.report.l.f(gameVideoDownloadUI.f140073f, 87, 8760, 0, 56, gameVideoDownloadUI.f140077m, gameVideoDownloadUI.f140082r, lj0.a.a(gameVideoDownloadUI.f140075h, gameVideoDownloadUI.V6(i18)));
        int i19 = gameVideoDownloadUI.f140075h;
        if (i19 == 3) {
            lt.r0 r0Var = (lt.r0) i95.n0.c(lt.r0.class);
            ((kt.s0) r0Var).Ai(gameVideoDownloadUI.f140076i, "video download err:" + i18, gameVideoDownloadUI.f140077m, -3, "video download err:" + i18);
        } else if (i19 == 5) {
            gameVideoDownloadUI.setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 2));
        }
        gameVideoDownloadUI.finish();
    }
}
