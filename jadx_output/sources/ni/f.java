package ni;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni.i f337178d;

    public f(ni.i iVar) {
        this.f337178d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        synchronized (this.f337178d.f337183i) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = this.f337178d.f337183i.iterator();
            while (it.hasNext()) {
                oi.e eVar = (oi.e) it.next();
                if (eVar != null) {
                    if (this.f337178d.f337181g != null) {
                        oi.h hVar = oi.h.f345567e;
                        synchronized (hVar.f345569b) {
                            z17 = !((java.util.LinkedList) hVar.f345569b).contains(eVar);
                        }
                        if (!z17) {
                            this.f337178d.f337181g.a(eVar);
                            linkedList.add(eVar);
                        }
                    }
                    it.remove();
                }
            }
            ni.g gVar = this.f337178d.f337182h;
            if (gVar != null) {
                ((com.tencent.mm.matrix.a0) gVar).a(linkedList);
            }
        }
    }
}
