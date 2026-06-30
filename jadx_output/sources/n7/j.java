package n7;

/* loaded from: classes13.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f335232d;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f335233a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f335234b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public n7.i f335235c;

    public j(android.view.View view) {
        this.f335233a = view;
    }

    public final int a(int i17, int i18, int i19) {
        int i27 = i18 - i19;
        if (i27 > 0) {
            return i27;
        }
        int i28 = i17 - i19;
        if (i28 > 0) {
            return i28;
        }
        android.view.View view = this.f335233a;
        if (view.isLayoutRequested() || i18 != -2) {
            return 0;
        }
        android.util.Log.isLoggable("ViewTarget", 4);
        android.content.Context context = view.getContext();
        if (f335232d == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            q7.n.b(windowManager);
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            f335232d = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
        }
        return f335232d.intValue();
    }

    public final int b() {
        android.view.View view = this.f335233a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int c() {
        android.view.View view = this.f335233a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }
}
