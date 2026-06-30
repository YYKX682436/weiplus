package s63;

/* loaded from: classes8.dex */
public class b implements com.tencent.matrix.lifecycle.k {

    /* renamed from: f, reason: collision with root package name */
    public static final s63.b f403412f = new s63.b();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f403413g = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f403415e = new s63.a(this);

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f403414d = new android.os.Handler(android.os.Looper.getMainLooper());

    public final java.lang.reflect.Method a(java.lang.Class cls, java.lang.Object... objArr) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Method) declaredMethod.invoke(cls, objArr);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f403414d.removeCallbacks(this.f403415e);
        com.tencent.mars.xlog.Log.e("DangerousRelease", "on foreground, processName = " + bm5.f1.a() + ", remove clear graphics task");
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f403414d.postDelayed(this.f403415e, 30000L);
        com.tencent.mars.xlog.Log.e("DangerousRelease", "on background, processName = " + bm5.f1.a() + ", postDelay clear graphics task, delay = 30000");
    }
}
