package e33;

/* loaded from: classes5.dex */
public class f4 implements k33.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247219a;

    public f4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247219a = imagePreviewUI;
    }

    public void a(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247219a;
        android.view.View findViewById = imagePreviewUI.findViewById(com.tencent.mm.R.id.ut_);
        int i17 = com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout.f138406n;
        boolean z17 = false;
        if (motionEvent != null && findViewById != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getGlobalVisibleRect(rect);
            if (findViewById.getVisibility() == 0 && findViewById.isEnabled() && rect.contains(rawX, rawY)) {
                z17 = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onSingleClick hit live tag button");
        } else {
            int i18 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
            imagePreviewUI.W6();
        }
    }
}
