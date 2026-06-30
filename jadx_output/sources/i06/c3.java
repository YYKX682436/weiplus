package i06;

/* loaded from: classes16.dex */
public class c3 extends i06.q3 implements f06.u {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f286614t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
        jz5.i iVar = jz5.i.f302830e;
        this.f286614t = jz5.h.a(iVar, new i06.a3(this));
        jz5.h.a(iVar, new i06.b3(this));
    }

    @Override // f06.v
    public f06.q c() {
        return (i06.z2) this.f286614t.getValue();
    }

    @Override // f06.u
    public java.lang.Object get(java.lang.Object obj) {
        return ((i06.z2) this.f286614t.getValue()).call(obj);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    @Override // i06.q3
    public i06.k3 r() {
        return (i06.z2) this.f286614t.getValue();
    }

    @Override // f06.v
    public f06.t c() {
        return (i06.z2) this.f286614t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        jz5.i iVar = jz5.i.f302830e;
        this.f286614t = jz5.h.a(iVar, new i06.a3(this));
        jz5.h.a(iVar, new i06.b3(this));
    }
}
