package i06;

/* loaded from: classes16.dex */
public class g3 extends i06.q3 implements yz5.p {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f286651t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        jz5.i iVar = jz5.i.f302830e;
        this.f286651t = jz5.h.a(iVar, new i06.e3(this));
        jz5.h.a(iVar, new i06.f3(this));
    }

    @Override // f06.v
    public f06.q c() {
        return (i06.d3) this.f286651t.getValue();
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i06.d3) this.f286651t.getValue()).call(obj, obj2);
    }

    @Override // i06.q3
    public i06.k3 r() {
        return (i06.d3) this.f286651t.getValue();
    }
}
