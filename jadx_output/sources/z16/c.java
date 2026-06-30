package z16;

/* loaded from: classes16.dex */
public final class c extends z16.a implements z16.f {

    /* renamed from: b, reason: collision with root package name */
    public final o06.b f469416b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f469417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o06.b declarationDescriptor, f26.o0 receiverType, n16.g gVar, z16.g gVar2) {
        super(receiverType, gVar2);
        kotlin.jvm.internal.o.g(declarationDescriptor, "declarationDescriptor");
        kotlin.jvm.internal.o.g(receiverType, "receiverType");
        this.f469416b = declarationDescriptor;
        this.f469417c = gVar;
    }

    @Override // z16.f
    public n16.g a() {
        return this.f469417c;
    }

    public java.lang.String toString() {
        return "Cxt { " + this.f469416b + " }";
    }
}
