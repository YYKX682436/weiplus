package fs;

/* loaded from: classes12.dex */
public class e implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f266067d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.d f266068e;

    public e(java.lang.Iterable iterable, fs.d dVar) {
        this.f266067d = iterable;
        this.f266068e = dVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new fs.f(this.f266067d.iterator(), this.f266068e);
    }
}
