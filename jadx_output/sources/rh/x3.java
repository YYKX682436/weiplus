package rh;

/* loaded from: classes12.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f395553a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.w3 f395554b;

    /* renamed from: c, reason: collision with root package name */
    public int f395555c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f395556d;

    /* renamed from: e, reason: collision with root package name */
    public rh.v3 f395557e;

    public x3(android.os.IBinder iBinder, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f395553a = iBinder;
        this.f395554b = new rh.w3(str, i17, str2, str3);
    }

    public void a(android.os.Handler handler) {
        java.lang.Runnable runnable = this.f395556d;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.f395556d = null;
        }
        rh.w3 w3Var = this.f395554b;
        w3Var.getClass();
        w3Var.f395544f = android.os.SystemClock.uptimeMillis();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof rh.x3) {
            return this.f395553a.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        return this.f395553a.hashCode();
    }
}
