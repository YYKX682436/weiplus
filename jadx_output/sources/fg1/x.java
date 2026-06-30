package fg1;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f261915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f261916e;

    public x(fg1.z zVar, android.app.Activity activity, float f17) {
        this.f261915d = activity;
        this.f261916e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f261915d;
        android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        float f17 = this.f261916e;
        if (f17 < 0.01f) {
            f17 = 0.01f;
        }
        attributes.screenBrightness = f17;
        activity.getWindow().setAttributes(attributes);
        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "setScreenBrightness, brightness:%s", java.lang.Float.valueOf(attributes.screenBrightness));
    }
}
