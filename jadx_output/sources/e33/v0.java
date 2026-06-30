package e33;

/* loaded from: classes10.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.w0 f247493e;

    public v0(e33.w0 w0Var, java.lang.String str) {
        this.f247493e = w0Var;
        this.f247492d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247493e.f247522e;
        int i17 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
        if (albumPreviewUI.isDestroyed() || albumPreviewUI.isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "refreshSumRawSize abort, AlbumPreviewUI isDestroyed||isFinishing");
            return;
        }
        android.widget.TextView textView = albumPreviewUI.f138544u;
        java.lang.String str = this.f247492d;
        textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(str) ? 8 : 0);
        albumPreviewUI.f138544u.setText(albumPreviewUI.getString(com.tencent.mm.R.string.f492176fi0, str));
    }
}
