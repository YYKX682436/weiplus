package e33;

/* loaded from: classes5.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.h4 f247236e;

    public g4(e33.h4 h4Var, java.lang.String str) {
        this.f247236e = h4Var;
        this.f247235d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247236e.f247255f;
        int i17 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
        if (imagePreviewUI.isDestroyed() || imagePreviewUI.isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewUI", "refreshSumRawSize abort, AlbumPreviewUI isDestroyed||isFinishing");
            return;
        }
        android.widget.TextView textView = imagePreviewUI.f138604x;
        java.lang.String str = this.f247235d;
        textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(str) ? 8 : 0);
        imagePreviewUI.f138604x.setText(imagePreviewUI.getString(com.tencent.mm.R.string.f492176fi0, str));
    }
}
