package nx1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.d f341280d;

    public c(nx1.d dVar) {
        this.f341280d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f341280d) {
            if (this.f341280d.f341282a == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = this.f341280d.f341282a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                if (aVar.b() != 1) {
                    i17++;
                } else {
                    sb6.append(((ix1.l) aVar).f295338s);
                }
            }
            this.f341280d.f341286e = com.tencent.mm.plugin.component.editor.u1.d(sb6.toString());
            this.f341280d.f341287f = i17;
        }
    }
}
