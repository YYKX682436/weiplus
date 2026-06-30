package uo;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final uo.n f429522a = new uo.n();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f429523b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f429524c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Throwable f429525d;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.l f429526e;

    /* renamed from: f, reason: collision with root package name */
    public static android.app.Dialog f429527f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f429528g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f429529h;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f429523b = jz5.h.a(iVar, uo.g.f429512d);
        f429524c = jz5.h.a(iVar, uo.h.f429513d);
        f429528g = jz5.h.b(uo.b.f429505d);
        f429529h = jz5.h.b(uo.m.f429521d);
    }

    public final void a(android.content.Context context, java.lang.Class caller) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.StackTraceElement[] stackTrace;
        java.lang.StackTraceElement[] stackTrace2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(caller, "caller");
        com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "checkShowFailAlert: " + caller + ", mLastErr=" + f429525d + ", mErrAlertShow=" + f429526e + ", mErrAlertHold=" + f429527f + ", caller=" + caller.getName());
        java.lang.Throwable th6 = f429525d;
        boolean z17 = false;
        if (th6 != null && (stackTrace2 = th6.getStackTrace()) != null) {
            int length = stackTrace2.length;
            for (int i17 = 0; i17 < length; i17++) {
                stackTraceElement = stackTrace2[i17];
                if (kotlin.jvm.internal.o.b(stackTraceElement.getClassName(), caller.getName())) {
                    break;
                }
            }
        }
        stackTraceElement = null;
        if (stackTraceElement != null) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (!L.contains("last-open-camera-err-alert")) {
                L.putLong("last-open-camera-err-alert", java.lang.System.currentTimeMillis()).commit();
            }
            if (!c()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "notShow: disabled");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "postShow");
            android.app.Dialog dialog = f429527f;
            if (dialog != null && dialog.isShowing()) {
                z17 = true;
            }
            if (!z17) {
                d().removeCallbacksAndMessages(null);
                d().postDelayed(new uo.c(context, null), 1000L);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShow: mLastErr=\n");
            java.lang.Throwable th7 = f429525d;
            sb6.append((th7 == null || (stackTrace = th7.getStackTrace()) == null) ? null : kz5.z.d0(stackTrace, "\n", null, null, 0, null, uo.d.f429508d, 30, null));
            com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", sb6.toString());
        }
        f429525d = null;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraCompat", "dismiss: mErrAlertHold=" + f429527f);
        d().removeCallbacksAndMessages(null);
        android.app.Dialog dialog = f429527f;
        if (dialog != null) {
            dialog.dismiss();
        }
        ((android.os.Handler) f429524c.getValue()).removeCallbacksAndMessages(null);
        f429525d = null;
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f429528g).getValue()).booleanValue();
    }

    public final android.os.Handler d() {
        return (android.os.Handler) f429523b.getValue();
    }

    public final void e(java.lang.Throwable err) {
        kotlin.jvm.internal.o.g(err, "err");
        com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "markOpenCameraFail");
        f429525d = err;
    }

    public final void f(android.content.Context context) {
        b();
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        long j17 = L.getLong("last-open-camera-err-alert", 0L);
        if (j17 > 0) {
            d().postDelayed(new uo.i(java.lang.System.currentTimeMillis() - j17), 1000L);
        }
        L.remove("last-open-camera-err-alert");
    }

    public final void g(int i17, boolean z17, yz5.a cancelToken, yz5.p retryBlock) {
        kotlin.jvm.internal.o.g(cancelToken, "cancelToken");
        kotlin.jvm.internal.o.g(retryBlock, "retryBlock");
        h(new uo.a(i17, new uo.j(z17, cancelToken)), retryBlock);
    }

    public final void h(uo.a aVar, yz5.p pVar) {
        jz5.g gVar = f429524c;
        ((android.os.Handler) gVar.getValue()).removeCallbacksAndMessages(null);
        if (((java.lang.Boolean) ((jz5.n) f429529h).getValue()).booleanValue()) {
            aVar.f429501c++;
            int i17 = aVar.f429502d;
            int b17 = i17 <= 0 ? aVar.f429499a : a06.d.b(i17 * aVar.f429504f);
            aVar.f429502d = b17;
            int i18 = aVar.f429503e + b17;
            aVar.f429503e = i18;
            if (!(i18 <= 30)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "postRetryOpenCamera NO: count=" + aVar.f429501c);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "postRetryOpenCamera YES: count=" + aVar.f429501c + ", curr=" + aVar.f429502d + ", sum=" + aVar.f429503e);
            ((android.os.Handler) gVar.getValue()).postDelayed(new uo.l(aVar, pVar), ((long) aVar.f429502d) * 1000);
        }
    }
}
