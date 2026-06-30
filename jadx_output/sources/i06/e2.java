package i06;

/* loaded from: classes16.dex */
public final class e2 extends i06.c3 implements f06.l {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f286627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f286627u = jz5.h.a(jz5.i.f302830e, new i06.d2(this));
    }

    @Override // f06.l
    public void I(java.lang.Object obj, java.lang.Object obj2) {
        ((i06.c2) this.f286627u.getValue()).call(obj, obj2);
    }

    @Override // f06.m
    public f06.h b() {
        return (i06.c2) this.f286627u.getValue();
    }

    @Override // f06.l, f06.m
    public f06.k b() {
        return (i06.c2) this.f286627u.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        this.f286627u = jz5.h.a(jz5.i.f302830e, new i06.d2(this));
    }
}
