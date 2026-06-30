package pm5;

/* loaded from: classes12.dex */
public class b implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f356890d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.a f356891e;

    public b(java.lang.Iterable iterable, pm5.a aVar) {
        this.f356890d = iterable;
        this.f356891e = aVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.c(this.f356890d.iterator(), this.f356891e);
    }
}
