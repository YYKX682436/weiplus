package xm5;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static xm5.a f455398a;

    public static final void a(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                kotlin.jvm.internal.o.f(java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length)), "format(...)");
            }
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
        }
    }

    public static final void b(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                str2 = java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKit:" + str, str2);
        }
    }

    public static final void c(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                str2 = java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
            com.tencent.mars.xlog.Log.i("MicroMsg.TAVKit:" + str, str2);
        }
    }

    public static final void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                str2 = java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2 + "  " + android.util.Log.getStackTraceString(th6);
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
            com.tencent.mars.xlog.Log.e("MicroMsg.TAVKit:" + str, str3);
        }
    }

    public static final void e(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                str2 = java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2 + "  " + new xm5.e();
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
            com.tencent.mars.xlog.Log.i("MicroMsg.TAVKit:" + str, str3);
        }
    }

    public static final void f(java.lang.String str, java.lang.String str2, java.lang.Object... obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (f455398a != null) {
            if (!(obj.length == 0)) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(obj, obj.length);
                str2 = java.lang.String.format(str2, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            android.os.Process.myTid();
            android.os.Process.myPid();
            java.lang.Thread.currentThread().getId();
            android.os.Looper.getMainLooper().getThread().getId();
            com.tencent.mars.xlog.Log.w("MicroMsg.TAVKit", str2);
        }
    }
}
