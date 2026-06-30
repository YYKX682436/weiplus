package sp3;

/* loaded from: classes7.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks, com.tencent.mm.app.t2, com.tencent.mm.app.h4 {

    /* renamed from: g, reason: collision with root package name */
    public static sp3.b f411303g;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f411304d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f411305e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f411306f;

    public b(java.lang.String str) {
        this.f411306f = str;
        this.f411305e = com.tencent.mm.sdk.platformtools.o4.R("fg_killed_state_" + str);
    }

    public static sp3.b c(java.lang.String str) {
        if (f411303g == null) {
            f411303g = new sp3.b(str.replace(":", "_"));
        }
        return f411303g;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        int i17 = this.f411304d;
        if (!((this.f411304d & 4) == 4)) {
            this.f411304d |= 4;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f411304d);
    }

    public void b() {
        this.f411304d = this.f411305e.o("state", 0);
        java.lang.Integer.toBinaryString(this.f411304d);
        if ((this.f411304d & 1) == 1) {
            if ((this.f411304d & 2) == 2) {
                if (!((this.f411304d & 4) == 4)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ForegroundKilledDetect", "%s: LAST STATE ERROR: %s", this.f411306f, java.lang.Integer.toBinaryString(this.f411304d));
                    gm0.j1.i().c(new sp3.a(this));
                }
            }
        }
        this.f411304d &= -2;
        this.f411304d &= -3;
        this.f411304d &= -5;
        d();
    }

    public final void d() {
        this.f411305e.A("state", this.f411304d);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
        int i18 = this.f411304d;
        if (!((this.f411304d & 4) == 4)) {
            this.f411304d |= 4;
            d();
        }
        java.lang.Integer.toBinaryString(i18);
        java.lang.Integer.toBinaryString(this.f411304d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        int i17 = this.f411304d;
        if ((this.f411304d & 2) == 2) {
            this.f411304d &= -3;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f411304d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        int i17 = this.f411304d;
        if (!((this.f411304d & 2) == 2)) {
            this.f411304d |= 2;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f411304d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        int i17 = this.f411304d;
        if ((this.f411304d & 1) == 1) {
            this.f411304d &= -2;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f411304d);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        int i17 = this.f411304d;
        if (!((this.f411304d & 1) == 1)) {
            this.f411304d |= 1;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f411304d);
    }
}
