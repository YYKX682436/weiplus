package i06;

/* loaded from: classes16.dex */
public class y2 extends i06.q3 implements f06.s {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f286800t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        jz5.i iVar = jz5.i.f302830e;
        this.f286800t = jz5.h.a(iVar, new i06.w2(this));
        jz5.h.a(iVar, new i06.x2(this));
    }

    @Override // f06.v
    public f06.q c() {
        return (i06.v2) this.f286800t.getValue();
    }

    @Override // f06.s
    public java.lang.Object get() {
        return ((i06.v2) this.f286800t.getValue()).call(new java.lang.Object[0]);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return get();
    }

    @Override // i06.q3
    public i06.k3 r() {
        return (i06.v2) this.f286800t.getValue();
    }

    @Override // f06.v
    public f06.r c() {
        return (i06.v2) this.f286800t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
        jz5.i iVar = jz5.i.f302830e;
        this.f286800t = jz5.h.a(iVar, new i06.w2(this));
        jz5.h.a(iVar, new i06.x2(this));
    }
}
