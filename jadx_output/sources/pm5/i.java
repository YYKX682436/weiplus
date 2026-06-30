package pm5;

/* loaded from: classes12.dex */
public class i implements java.lang.Iterable {

    /* renamed from: e, reason: collision with root package name */
    public static final pm5.h f356903e = new pm5.h(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f356904d;

    public i(java.util.List list) {
        this.f356904d = list;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pm5.c(this.f356904d.iterator(), f356903e);
    }

    public i(java.lang.Iterable... iterableArr) {
        this(java.util.Arrays.asList(iterableArr));
    }
}
