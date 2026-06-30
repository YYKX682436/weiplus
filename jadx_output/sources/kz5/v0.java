package kz5;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f314017d;

    public v0(yz5.a iteratorFactory) {
        kotlin.jvm.internal.o.g(iteratorFactory, "iteratorFactory");
        this.f314017d = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new kz5.w0((java.util.Iterator) this.f314017d.invoke());
    }
}
