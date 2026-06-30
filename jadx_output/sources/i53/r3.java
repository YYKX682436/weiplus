package i53;

/* loaded from: classes12.dex */
public class r3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoDownloadUI f288707d;

    public r3(com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI) {
        this.f288707d = gameVideoDownloadUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI = this.f288707d;
        int i18 = gameVideoDownloadUI.f140075h;
        if (i18 == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(gameVideoDownloadUI.f140076i, "video download cancel", gameVideoDownloadUI.f140077m, -2, "video download cancel");
        } else if (i18 == 5) {
            gameVideoDownloadUI.setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 1));
        }
        gameVideoDownloadUI.finish();
    }
}
