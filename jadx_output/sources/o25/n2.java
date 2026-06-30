package o25;

/* loaded from: classes11.dex */
public class n2 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f342565c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f342566a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f342567b;

    public n2(java.lang.String str) {
        this.f342567b = "";
        this.f342567b = str;
    }

    public final boolean a(java.lang.String str) {
        boolean z17 = f342565c;
        java.lang.String str2 = this.f342567b;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SplashOptimizing", "[%s], check cancel", str2);
            return false;
        }
        if (!this.f342566a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", str2, str);
        return true;
    }
}
