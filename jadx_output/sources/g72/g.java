package g72;

/* loaded from: classes14.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269231d;

    public g(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f269231d = faceDetectConfirmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "cancel with back button");
        int i17 = com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.S;
        this.f269231d.V6();
        return false;
    }
}
