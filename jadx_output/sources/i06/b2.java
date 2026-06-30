package i06;

/* loaded from: classes16.dex */
public final class b2 extends i06.y2 implements f06.j {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f286607u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        this.f286607u = jz5.h.a(jz5.i.f302830e, new i06.a2(this));
    }

    @Override // f06.m
    public f06.h b() {
        return (i06.z1) this.f286607u.getValue();
    }

    @Override // f06.j, f06.m
    public f06.i b() {
        return (i06.z1) this.f286607u.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f286607u = jz5.h.a(jz5.i.f302830e, new i06.a2(this));
    }
}
