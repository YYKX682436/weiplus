package s33;

/* loaded from: classes15.dex */
public class b implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f402475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u33.f f402476b;

    public b(s33.d dVar, java.util.Map map, u33.f fVar) {
        this.f402475a = map;
        this.f402476b = fVar;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        java.util.Map map2 = this.f402475a;
        if (map != null) {
            map2.putAll(map);
        }
        this.f402476b.a(map2);
    }
}
