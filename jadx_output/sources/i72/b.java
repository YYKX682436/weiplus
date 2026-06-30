package i72;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView f289414g;

    public b(com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView, int i17, int i18, int i19) {
        this.f289414g = faceDetectCameraView;
        this.f289411d = i17;
        this.f289412e = i18;
        this.f289413f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f289411d;
        int i18 = this.f289412e;
        int i19 = i17 - i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "restHeight: %d", java.lang.Integer.valueOf(i19));
        if (i19 <= 0) {
            return;
        }
        int i27 = i19 / 2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f289413f, i18);
        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = this.f289414g;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(faceDetectCameraView.getLayoutParams());
        layoutParams.setMargins(marginLayoutParams.leftMargin, i27, marginLayoutParams.rightMargin, marginLayoutParams.height + i27);
        faceDetectCameraView.setLayoutParams(layoutParams);
        faceDetectCameraView.invalidate();
    }
}
