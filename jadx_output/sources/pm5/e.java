package pm5;

/* loaded from: classes12.dex */
public class e implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f356897d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.d f356898e;

    public e(java.lang.Iterable iterable, pm5.d dVar) {
        this.f356897d = iterable;
        this.f356898e = dVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.f(this.f356897d.iterator(), this.f356898e);
    }
}
