package pq5;

/* loaded from: classes12.dex */
public abstract class c extends fm5.a {
    public c() {
        super(new pq5.f());
    }

    public fm5.b v(java.lang.Object obj) {
        fm5.b bVar = new fm5.b(obj, this);
        synchronized (this) {
            this.f264181d.add(bVar);
        }
        return bVar;
    }

    public void w(pq5.b bVar) {
        java.util.LinkedList linkedList;
        if (bVar == null) {
            return;
        }
        synchronized (this) {
            linkedList = new java.util.LinkedList(this.f264181d);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            fm5.b bVar2 = (fm5.b) it.next();
            if (bVar2 != null) {
                bVar.a(bVar2.f264184e);
            }
        }
    }
}
