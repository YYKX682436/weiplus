package d26;

/* loaded from: classes16.dex */
public class a implements p06.k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f225981e = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(d26.a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f225982d;

    public a(e26.c0 storageManager, yz5.a compute) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(compute, "compute");
        this.f225982d = ((e26.u) storageManager).b(compute);
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c cVar) {
        return p06.j.a(this, cVar);
    }

    @Override // p06.k
    public boolean isEmpty() {
        return ((java.util.List) e26.b0.a(this.f225982d, this, f225981e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.List) e26.b0.a(this.f225982d, this, f225981e[0])).iterator();
    }
}
