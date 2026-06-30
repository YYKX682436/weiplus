package e33;

/* loaded from: classes5.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247295d;

    public j4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247295d = imagePreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247295d;
        imagePreviewUI.getController().H0(imagePreviewUI.getResources().getColor(com.tencent.mm.R.color.f479163rn));
    }
}
