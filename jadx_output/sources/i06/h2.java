package i06;

/* loaded from: classes16.dex */
public final class h2 extends i06.g3 implements f06.m {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f286655u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i06.u1 container, o06.o1 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        this.f286655u = jz5.h.a(jz5.i.f302830e, new i06.g2(this));
    }

    @Override // f06.m
    public f06.h b() {
        return (i06.f2) this.f286655u.getValue();
    }
}
