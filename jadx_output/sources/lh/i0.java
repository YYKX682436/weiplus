package lh;

/* loaded from: classes12.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh.l0 f318604d;

    public i0(lh.l0 l0Var) {
        this.f318604d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.l0 l0Var = this.f318604d;
        synchronized (l0Var.f318614a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#dumping, size=" + ((java.util.HashMap) l0Var.f318614a).size());
            java.util.Iterator it = ((java.util.HashMap) l0Var.f318614a).values().iterator();
            while (it.hasNext()) {
                ((com.tencent.matrix.battery.accumulate.AccPowerStats) it.next()).dump();
            }
        }
    }
}
