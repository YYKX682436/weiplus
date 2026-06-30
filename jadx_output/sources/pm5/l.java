package pm5;

/* loaded from: classes12.dex */
public class l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f356905d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.j f356906e;

    /* renamed from: f, reason: collision with root package name */
    public final pm5.k f356907f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f356908g;

    public l(java.lang.Iterable iterable, pm5.j jVar) {
        this(iterable, jVar, null, true);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.m(this.f356905d.iterator(), this.f356906e, this.f356907f, this.f356908g);
    }

    public l(java.lang.Iterable iterable, pm5.j jVar, pm5.k kVar, boolean z17) {
        this.f356905d = iterable;
        this.f356906e = jVar;
        this.f356907f = kVar;
        this.f356908g = z17;
    }
}
