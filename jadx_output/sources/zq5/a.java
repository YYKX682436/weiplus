package zq5;

/* loaded from: classes11.dex */
public final class a implements zq5.j {

    /* renamed from: a, reason: collision with root package name */
    public static final zq5.a f475055a = new zq5.a();

    public void a(zq5.i level, java.lang.String tag, java.lang.String msg, java.lang.Throwable th6) {
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        int ordinal = level.ordinal();
        if (ordinal == 2) {
            com.tencent.mars.xlog.Log.i(tag, msg, th6);
            return;
        }
        if (ordinal == 3) {
            com.tencent.mars.xlog.Log.w(tag, msg, th6);
        } else if (ordinal == 4) {
            com.tencent.mars.xlog.Log.e(tag, msg, th6);
        } else {
            if (ordinal != 5) {
                return;
            }
            com.tencent.mars.xlog.Log.f(tag, msg, th6);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1534854491;
    }

    public java.lang.String toString() {
        return "AndroidLogPipeline";
    }
}
