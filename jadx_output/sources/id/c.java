package id;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final id.d a() {
        id.d dVar = id.d.f290445d;
        if (dVar == null) {
            synchronized (this) {
                dVar = id.d.f290445d;
                if (dVar == null) {
                    dVar = new id.d(null);
                    id.d.f290445d = dVar;
                }
            }
        }
        return dVar;
    }
}
