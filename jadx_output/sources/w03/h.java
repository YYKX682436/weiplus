package w03;

/* loaded from: classes11.dex */
public final class h extends na5.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f441882e = jz5.h.b(w03.e.f441879d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f441883f = jz5.h.b(new w03.g(this));

    public static final na5.b a(w03.h hVar, bj0.u uVar, boolean z17) {
        na5.b bVar = (na5.b) ((java.util.Map) ((jz5.n) hVar.f441882e).getValue()).get(uVar);
        if (bVar != null) {
            return bVar;
        }
        if (!z17) {
            return null;
        }
        w03.d dVar = new w03.d(uVar);
        ((java.util.Map) ((jz5.n) hVar.f441882e).getValue()).put(uVar, dVar);
        return dVar;
    }
}
