package fm5;

/* loaded from: classes16.dex */
public abstract class d extends fm5.a {
    public final void v(nm5.j jVar) {
        java.util.Iterator it = new java.util.LinkedList(this.f264181d).iterator();
        while (it.hasNext()) {
            fm5.b bVar = (fm5.b) it.next();
            if (bVar != null) {
                lm5.j jVar2 = lm5.d.f319600a;
                lm5.d a17 = lm5.i.a();
                lm5.h hVar = this.f264182e;
                synchronized (hVar) {
                    hVar.f319607a = a17;
                }
                hVar.a(new fm5.c(this, bVar, jVar), null, true);
            }
        }
    }

    public abstract void w(java.lang.Object obj, nm5.j jVar);
}
