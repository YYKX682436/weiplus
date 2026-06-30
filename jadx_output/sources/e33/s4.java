package e33;

/* loaded from: classes3.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247463d;

    public s4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247463d = imagePreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247463d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imagePreviewUI.V.getLayoutParams();
        imagePreviewUI.getWindow().getDecorView().getWindowVisibleDisplayFrame(new android.graphics.Rect());
        marginLayoutParams.topMargin = (int) (r2.top + imagePreviewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479623ay));
        imagePreviewUI.V.setLayoutParams(marginLayoutParams);
    }
}
