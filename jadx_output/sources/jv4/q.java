package jv4;

/* loaded from: classes12.dex */
public abstract class q implements jv4.j, jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final jv4.m f302264a;

    public q(jv4.m type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f302264a = type;
    }

    @Override // jv4.j
    public java.util.List getItems() {
        return kz5.b0.c(this);
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f302264a;
    }
}
