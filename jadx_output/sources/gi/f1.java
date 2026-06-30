package gi;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f272028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Thread f272029e;

    /* renamed from: f, reason: collision with root package name */
    public long f272030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gi.g1 f272031g;

    public f1(gi.g1 g1Var) {
        this.f272031g = g1Var;
    }

    public void a(boolean z17, long j17) {
        java.lang.String str;
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j17);
        if (z17) {
            int i17 = gi.g1.f272035n;
            wh.s sVar = this.f272031g.f395294a.f363335d.A;
            java.lang.Thread thread = this.f272029e;
            sVar.getClass();
            kotlin.jvm.internal.o.g(thread, "thread");
            java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(stackTrace.length);
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    java.lang.String className = stackTraceElement.getClassName();
                    kotlin.jvm.internal.o.f(className, "className");
                    if (!r26.n0.B(className, "com.tencent.matrix", false) && !r26.n0.B(className, "java.lang.reflect", false) && !r26.n0.B(className, "$Proxy2", false) && !r26.n0.B(className, "android.os", false)) {
                        arrayList.add(stackTraceElement);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) it.next();
                    sb6.append(sb6.length() == 0 ? "" : "\n");
                    sb6.append("at ");
                    sb6.append(stackTraceElement2);
                }
                if (!(sb6.length() == 0)) {
                    str = "Matrix\n" + ((java.lang.Object) sb6);
                }
            }
            str = "";
        } else {
            str = null;
        }
        com.tencent.mars.xlog.Log.w("Matrix.battery.MMHandlerJiffies", "heavyTask detected: " + this.f272028d + ", durationSec=" + seconds + ", thread=" + this.f272029e + ", stack=" + str);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("task-name", this.f272028d);
        linkedHashMap.put("task-duration-sec", java.lang.Long.valueOf(seconds));
        ap.a.b(10002, "ThreadProfiler", str != null ? str.replace('\n', ';').replace("\t", "") : null, linkedHashMap, "MMHandler", z17 ? "heavyTask" : "heavyTaskDone", java.lang.String.valueOf(seconds), this.f272028d);
    }

    @Override // java.lang.Runnable
    public void run() {
        a(true, java.lang.System.currentTimeMillis() - this.f272030f);
    }
}
