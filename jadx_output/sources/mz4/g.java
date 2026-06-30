package mz4;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333280d;

    public g(mz4.d dVar) {
        this.f333280d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f333280d) {
            if (this.f333280d.f333229a == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (iz4.c cVar : this.f333280d.f333229a) {
                if (cVar.d() != 1) {
                    i17++;
                } else {
                    sb6.append(((iz4.i) cVar).f296155t);
                }
            }
            this.f333280d.f333233e = qz4.c.e(sb6.toString());
            this.f333280d.f333234f = i17;
        }
    }
}
