package d55;

/* loaded from: classes12.dex */
public abstract class g0 extends d55.b0 implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f226583r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f226584s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f226585t;

    public g0(d55.b0 b0Var) {
        super(b0Var);
        this.f226583r = new java.util.concurrent.atomic.AtomicBoolean();
        this.f226584s = new java.util.concurrent.atomic.AtomicBoolean();
        this.f226585t = new java.util.concurrent.atomic.AtomicBoolean();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r15.getStatus() == 9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        if (r15.getStatus() == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d55.g0.j():void");
    }

    public abstract void k();

    public void l() {
        d55.o0.a(4, "MicroMsg.recovery.safePoint", "onLaunchNormal");
        d55.j jVar = this.f226572o;
        if (jVar == null || jVar.f226591d.f226597a < 1) {
            return;
        }
        d55.w wVar = new d55.w(this.f226564d, "recovery_statistic");
        wVar.e();
        wVar.getInt("crash_count", 0);
        wVar.getBoolean("launch_recovery", false);
        boolean z17 = wVar.getBoolean("launch_recovery_real", false);
        boolean z18 = wVar.getBoolean("recover_from_crash", false);
        int i17 = wVar.getInt("recovery_status", -1);
        wVar.getInt("recovery_from", 0);
        int i18 = wVar.getInt("recover_internal_status", 0);
        int i19 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        wVar.g("crash_count", this.f226572o.f226591d.f226597a);
        wVar.putBoolean("launch_recovery", false);
        wVar.putBoolean("launch_recovery_real", z17);
        wVar.putBoolean("recover_from_crash", z18);
        wVar.putInt("recovery_status", i17);
        wVar.putInt("recovery_from", 1);
        wVar.putInt("recover_internal_status", i18);
        wVar.putInt("recover_launch_mode", i19);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", false);
        wVar.putString("recover_app_ver", string);
        wVar.d();
    }

    public void m() {
        if (this.f226585t.get()) {
            return;
        }
        android.os.Handler handler = this.f226565e;
        handler.removeCallbacks(this);
        android.os.Handler handler2 = this.f226569i;
        if (handler2 != null) {
            handler2.removeCallbacks(this);
        }
        android.os.Handler handler3 = this.f226569i;
        if (handler3 != null) {
            handler = handler3;
        }
        handler.postDelayed(this, this.f226574q.f226560f);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f226584s.get()) {
            d55.o0.a(4, "MicroMsg.recovery.safePoint", "auto clear task has been canceled, skip");
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.safePoint", "auto clear point");
        k();
        this.f226585t.set(true);
    }
}
