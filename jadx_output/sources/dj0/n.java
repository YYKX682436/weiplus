package dj0;

/* loaded from: classes14.dex */
public class n extends dj0.q {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f232863b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f232864c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Constructor f232865d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f232866e;

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowInsets f232867a;

    public n() {
        android.view.WindowInsets windowInsets;
        if (!f232864c) {
            try {
                f232863b = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException unused) {
            }
            f232864c = true;
        }
        java.lang.reflect.Field field = f232863b;
        android.view.WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                windowInsets = (android.view.WindowInsets) field.get(null);
            } catch (java.lang.ReflectiveOperationException unused2) {
            }
            if (windowInsets != null) {
                windowInsets2 = new android.view.WindowInsets(windowInsets);
                this.f232867a = windowInsets2;
            }
        }
        if (!f232866e) {
            try {
                f232865d = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException unused3) {
            }
            f232866e = true;
        }
        java.lang.reflect.Constructor constructor = f232865d;
        if (constructor != null) {
            try {
                windowInsets2 = (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException unused4) {
            }
        }
        this.f232867a = windowInsets2;
    }

    @Override // dj0.q
    public dj0.x a() {
        dj0.x xVar = new dj0.x(this.f232867a);
        dj0.w wVar = xVar.f232887a;
        wVar.n(null);
        wVar.q(null);
        return xVar;
    }
}
