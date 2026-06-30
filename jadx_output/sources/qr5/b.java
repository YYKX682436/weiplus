package qr5;

/* loaded from: classes13.dex */
public class b extends qr5.e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f366132c;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f366133b;

    static {
        try {
            f366132c = java.lang.Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
        } catch (java.lang.Throwable unused) {
            f366132c = null;
        }
    }

    public b() {
        super(null);
        this.f366133b = null;
    }

    @Override // qr5.e
    public android.app.Activity a() {
        android.app.Activity activity = this.f366133b;
        if (activity != null) {
            return activity;
        }
        try {
            android.content.Context context = (android.content.Context) f366132c.getMethod("getContext", null).invoke(null, null);
            if (context instanceof android.app.Activity) {
                this.f366133b = (android.app.Activity) context;
            }
        } catch (java.lang.Throwable th6) {
            or5.b.c(3, th6, "Get Activity failed", new java.lang.Object[0]);
        }
        return this.f366133b;
    }
}
