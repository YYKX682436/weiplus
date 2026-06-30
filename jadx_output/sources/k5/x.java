package k5;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final k5.y f304169d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f304170e;

    public x(k5.y yVar, java.lang.String str) {
        this.f304169d = yVar;
        this.f304170e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f304169d.f304175d) {
            if (((k5.x) ((java.util.HashMap) this.f304169d.f304173b).remove(this.f304170e)) != null) {
                k5.w wVar = (k5.w) ((java.util.HashMap) this.f304169d.f304174c).remove(this.f304170e);
                if (wVar != null) {
                    a5.a0.c().a(d5.f.f226482p, java.lang.String.format("Exceeded time limits on execution for %s", this.f304170e), new java.lang.Throwable[0]);
                    ((d5.f) wVar).e();
                }
            } else {
                a5.a0.c().a("WrkTimerRunnable", java.lang.String.format("Timer with %s is already marked as complete.", this.f304170e), new java.lang.Throwable[0]);
            }
        }
    }
}
