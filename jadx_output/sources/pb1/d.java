package pb1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb1.i f353133d;

    public d(pb1.i iVar) {
        this.f353133d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i(this.f353133d.f353140a, "run#mScanWorkaroundTask");
        pb1.h hVar = this.f353133d.f353150k;
        if (!this.f353133d.f353144e.get() || hVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f353133d.f353140a, "run#mScanWorkaroundTask, stopBleScan");
        ob1.m mVar = ob1.m.f344018e;
        if (this.f353133d.d().f344038a == 0) {
            synchronized (this.f353133d) {
                com.tencent.mars.xlog.Log.i(this.f353133d.f353140a, "run#mScanWorkaroundTask, startBleScanLocked");
                pb1.i iVar = this.f353133d;
                ob1.d dVar = pb1.h.f353136d;
                if (dVar != hVar.f353137a) {
                    hVar = new pb1.h(dVar, hVar.f353138b, hVar.f353139c);
                }
                iVar.c(hVar);
            }
        }
    }
}
