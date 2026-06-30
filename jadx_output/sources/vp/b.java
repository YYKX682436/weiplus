package vp;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final zp.c f438732a = new zp.c();

    public void a() {
        zp.c cVar = this.f438732a;
        java.util.LinkedList linkedList = cVar.f474901a;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            zp.b bVar = (zp.b) it.next();
            if (bVar != null) {
                bVar.a();
            }
        }
        linkedList.clear();
        cVar.f474904d = 0;
        cVar.f474905e = 0;
        cVar.f474906f = 0;
    }
}
