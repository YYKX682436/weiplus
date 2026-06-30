package pm5;

/* loaded from: classes12.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f356909d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.j f356910e;

    /* renamed from: f, reason: collision with root package name */
    public pm5.k f356911f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f356912g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f356913h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356914i;

    public m(java.util.Iterator it, pm5.j jVar, pm5.k kVar, boolean z17) {
        this.f356909d = it;
        this.f356910e = jVar;
        this.f356911f = kVar;
        this.f356912g = z17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f356914i) {
            return true;
        }
        do {
            java.util.Iterator it = this.f356909d;
            if (!it.hasNext()) {
                pm5.k kVar = this.f356911f;
                if (kVar == null) {
                    return false;
                }
                kVar.e();
                this.f356911f = null;
                return false;
            }
            java.lang.Object d17 = this.f356910e.d(it.next());
            this.f356913h = d17;
            if (d17 != null) {
                break;
            }
        } while (!this.f356912g);
        this.f356914i = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f356914i && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f356913h;
        this.f356913h = null;
        this.f356914i = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
