package lc;

/* loaded from: classes14.dex */
public final /* synthetic */ class g$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.g f317826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f317827e;

    public /* synthetic */ g$$a(lc.g gVar, int i17) {
        this.f317826d = gVar;
        this.f317827e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f317826d.getActivity();
        if (activity == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i17 = this.f317827e;
        if (i17 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i17 <= 0) {
                i17 = 1;
            }
            attributes.screenBrightness = i17 / 255.0f;
        }
        window.setAttributes(attributes);
    }
}
