package oh5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.ref.WeakReference f345489c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f345490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f345491b = new java.util.concurrent.ConcurrentLinkedQueue();

    public d() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new oh5.b(this));
    }

    public void a(android.content.Intent intent) {
        java.lang.String str;
        jz5.f0 f0Var;
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(intent, "intent");
        try {
            str = c();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseHalfScreenWarningHelper", th6, "", new java.lang.Object[0]);
            str = null;
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHalfScreenWarningHelper", "disabled for release");
            return;
        }
        try {
            java.lang.Class.forName(str);
            java.lang.ref.WeakReference weakReference = f345489c;
            if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                f0Var = null;
            } else {
                bh5.c cVar = new bh5.c();
                cVar.f20922a.f20924a = activity;
                cVar.d(intent);
                cVar.a(str);
                cVar.g();
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseHalfScreenWarningHelper", "start half screen warning activity: ".concat(str));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("no valid src Activity, weak = ");
                sb6.append(f345489c);
                sb6.append(" -> ");
                java.lang.ref.WeakReference weakReference2 = f345489c;
                sb6.append(weakReference2 != null ? (android.app.Activity) weakReference2.get() : null);
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseHalfScreenWarningHelper", sb6.toString());
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseHalfScreenWarningHelper", e17, "Target NOT exist, ignore", new java.lang.Object[0]);
        }
    }

    public final void b(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (this.f345490a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseHalfScreenWarningHelper", "muted");
        } else if (com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
            a(intent);
        } else {
            this.f345491b.offer(intent);
        }
    }

    public abstract java.lang.String c();
}
