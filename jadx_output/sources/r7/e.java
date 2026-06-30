package r7;

/* loaded from: classes13.dex */
public final class e implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final r7.d f393069a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.g f393070b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.e f393071c;

    public e(m3.e eVar, r7.d dVar, r7.g gVar) {
        this.f393071c = eVar;
        this.f393069a = dVar;
        this.f393070b = gVar;
    }

    @Override // m3.e
    public java.lang.Object a() {
        java.lang.Object a17 = this.f393071c.a();
        if (a17 == null) {
            a17 = this.f393069a.create();
            if (android.util.Log.isLoggable("FactoryPools", 2)) {
                a17.getClass().toString();
            }
        }
        if (a17 instanceof r7.f) {
            ((r7.j) ((r7.f) a17).h()).f393073a = false;
        }
        return a17;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        if (obj instanceof r7.f) {
            ((r7.j) ((r7.f) obj).h()).f393073a = true;
        }
        this.f393070b.a(obj);
        return this.f393071c.b(obj);
    }
}
