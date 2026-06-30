package ph;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public qh.f0 f354255a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f354256b;

    public c(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f354256b = mContext;
    }

    public final long a() {
        if (!e() && ph.t.f354284l > 0) {
            return android.os.SystemClock.uptimeMillis() - ph.t.f354284l;
        }
        return 0L;
    }

    public final int b() {
        return wh.m.i(this.f354256b);
    }

    public final boolean c() {
        java.lang.Integer num = wh.m.f445830a;
        android.content.Context context = this.f354256b;
        kotlin.jvm.internal.o.d(context);
        return wh.e1.c(context);
    }

    public final boolean d() {
        return wh.m.w(this.f354256b);
    }

    public final boolean e() {
        qh.f0 f0Var = this.f354255a;
        if (f0Var != null) {
            kotlin.jvm.internal.o.d(f0Var);
            if (!f0Var.f363343o) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        java.lang.Integer num = wh.m.f445830a;
        android.content.Context context = this.f354256b;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent k17 = wh.m.k(context);
        if (k17 != null) {
            k17.getBooleanExtra("android.intent.action.BATTERY_LOW", false);
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BatteryState{fg=");
        sb6.append(e());
        sb6.append(", charge=");
        sb6.append(d());
        sb6.append(", screen=");
        android.content.Context context = this.f354256b;
        sb6.append(wh.m.A(context));
        sb6.append(", sysDoze=");
        sb6.append(wh.m.z(context));
        sb6.append(", appStandby=");
        sb6.append(c());
        sb6.append(", bgMillis=");
        sb6.append(a());
        sb6.append('}');
        return sb6.toString();
    }
}
