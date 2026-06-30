package t2;

/* loaded from: classes14.dex */
public final class h extends t2.b {
    public h() {
        super(null);
    }

    @Override // t2.b
    public boolean a(t2.j jVar, t2.f fVar, t2.f fVar2) {
        synchronized (jVar) {
            if (jVar.f414650e != fVar) {
                return false;
            }
            jVar.f414650e = fVar2;
            return true;
        }
    }

    @Override // t2.b
    public boolean b(t2.j jVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (jVar) {
            if (jVar.f414649d != obj) {
                return false;
            }
            jVar.f414649d = obj2;
            return true;
        }
    }

    @Override // t2.b
    public boolean c(t2.j jVar, t2.i iVar, t2.i iVar2) {
        synchronized (jVar) {
            if (jVar.f414651f != iVar) {
                return false;
            }
            jVar.f414651f = iVar2;
            return true;
        }
    }

    @Override // t2.b
    public void d(t2.i iVar, t2.i iVar2) {
        iVar.f414644b = iVar2;
    }

    @Override // t2.b
    public void e(t2.i iVar, java.lang.Thread thread) {
        iVar.f414643a = thread;
    }
}
