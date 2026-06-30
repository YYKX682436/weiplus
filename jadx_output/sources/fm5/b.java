package fm5;

/* loaded from: classes12.dex */
public class b implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final fm5.a f264183d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f264184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f264185f;

    public b(java.lang.Object obj, fm5.a aVar) {
        iz5.a.d("Callback should not be null!", obj);
        this.f264185f = obj.hashCode();
        this.f264184e = obj;
        this.f264183d = aVar;
    }

    @Override // im5.a
    public void dead() {
        fm5.a aVar = this.f264183d;
        iz5.a.d(null, aVar);
        synchronized (aVar) {
            aVar.f264181d.remove(this);
        }
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && obj.hashCode() == this.f264185f;
    }

    public int hashCode() {
        return this.f264185f;
    }
}
