package pq4;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f357680a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f357681b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f357682c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f357683d;

    public c(java.lang.String usage) {
        kotlin.jvm.internal.o.g(usage, "usage");
        this.f357680a = usage;
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("voip{" + usage + '}', 10);
        this.f357682c = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipThread", "init voip render thread " + usage);
        a17.start();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        this.f357681b = n3Var;
        n3Var.setLogging(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipThread", "start: " + a17.getName());
    }

    public final boolean a() {
        android.os.Message runningMessage;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f357681b;
        if (((n3Var == null || (runningMessage = n3Var.getRunningMessage()) == null) ? null : runningMessage.getCallback()) == null) {
            return false;
        }
        java.lang.StackTraceElement[] stackTrace = this.f357682c.getStackTrace();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        kotlin.jvm.internal.o.d(stackTrace);
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            stringWriter.write(stackTraceElement.toString());
            stringWriter.write("\n");
        }
        stringWriter.flush();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipThread", "voip{" + this.f357680a + "} current run " + stringWriter);
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        return true;
    }

    public final void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f357681b;
        if (n3Var != null) {
            n3Var.post(callback);
        }
    }

    public final void c(final yz5.a callback) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        kotlin.jvm.internal.o.g(callback, "callback");
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.HandlerThread handlerThread = this.f357682c;
        if (kotlin.jvm.internal.o.b(myLooper, handlerThread.getLooper())) {
            callback.invoke();
        } else {
            if (!handlerThread.isAlive() || (n3Var = this.f357681b) == null) {
                return;
            }
            n3Var.post(new java.lang.Runnable(callback) { // from class: pq4.b

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f357679d;

                {
                    kotlin.jvm.internal.o.g(callback, "function");
                    this.f357679d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f357679d.invoke();
                }
            });
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipThread", "release voip render thread " + this.f357680a);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f357681b;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        c(new pq4.a(this));
    }
}
