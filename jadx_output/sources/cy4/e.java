package cy4;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f224866a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f224867b;

    /* renamed from: c, reason: collision with root package name */
    public int f224868c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f224869d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f224870e;

    /* renamed from: f, reason: collision with root package name */
    public int f224871f;

    /* renamed from: g, reason: collision with root package name */
    public int f224872g;

    /* renamed from: h, reason: collision with root package name */
    public int f224873h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f224874i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f224875j = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public boolean f224876k = false;

    public e(android.content.Context context) {
        this.f224866a = context;
    }

    public boolean a(boolean z17) {
        if (this.f224867b == null) {
            return false;
        }
        android.content.Context context = this.f224866a;
        if (!(context instanceof android.app.Activity)) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (!z17 && (activity == null || activity.isFinishing() || activity.isDestroyed())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFullscreenImpl", "exitFullscreen activity(%s) destroyed", activity);
            return false;
        }
        ((android.view.ViewGroup) activity.getWindow().getDecorView()).setSystemUiVisibility(this.f224871f);
        activity.getWindow().clearFlags(1024);
        if (this.f224874i != null) {
            activity.getWindow().setAttributes(this.f224874i);
        }
        activity.setRequestedOrientation(this.f224873h);
        if (this.f224870e != null) {
            if (this.f224867b.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f224867b.getParent()).removeView(this.f224867b);
            }
            this.f224870e.addView(this.f224867b, this.f224868c, this.f224869d);
            this.f224867b.setBackgroundColor(this.f224872g);
        }
        this.f224867b = null;
        qp1.h0.b();
        java.util.Iterator it = this.f224875j.iterator();
        while (it.hasNext()) {
            ((cy4.f) it.next()).b();
        }
        return true;
    }
}
