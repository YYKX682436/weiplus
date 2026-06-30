package s9;

/* loaded from: classes7.dex */
public final class i implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f404946a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.j f404947b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.j f404948c;

    /* renamed from: d, reason: collision with root package name */
    public final r9.h f404949d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.g f404950e;

    public i(s9.c cVar, r9.j jVar, r9.j jVar2, r9.h hVar, int i17, s9.g gVar) {
        this.f404946a = cVar;
        this.f404947b = jVar;
        this.f404948c = jVar2;
        this.f404949d = hVar;
        this.f404950e = gVar;
    }

    @Override // r9.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s9.h createDataSource() {
        s9.c cVar = this.f404946a;
        r9.k createDataSource = this.f404947b.createDataSource();
        r9.k createDataSource2 = this.f404948c.createDataSource();
        r9.h hVar = this.f404949d;
        return new s9.h(cVar, createDataSource, createDataSource2, hVar != null ? new s9.e(((s9.f) hVar).f404926a, 10485760L, 20480) : null, 2, this.f404950e);
    }
}
