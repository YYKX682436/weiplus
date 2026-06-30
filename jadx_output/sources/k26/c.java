package k26;

/* loaded from: classes16.dex */
public final class c extends f26.f2 {
    @Override // f26.f2
    public f26.l2 g(f26.c2 key) {
        kotlin.jvm.internal.o.g(key, "key");
        s16.b bVar = key instanceof s16.b ? (s16.b) key : null;
        if (bVar == null) {
            return null;
        }
        return bVar.getProjection().b() ? new f26.n2(f26.d3.f259145h, bVar.getProjection().getType()) : bVar.getProjection();
    }
}
