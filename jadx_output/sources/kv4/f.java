package kv4;

/* loaded from: classes12.dex */
public final class f implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f312697a;

    public f(kv4.g gapSize) {
        kotlin.jvm.internal.o.g(gapSize, "gapSize");
        this.f312697a = kz5.b0.c(new kv4.e(gapSize));
    }

    @Override // jv4.j
    public int a() {
        return 1;
    }

    @Override // jv4.j
    public java.util.List getItems() {
        return this.f312697a;
    }
}
