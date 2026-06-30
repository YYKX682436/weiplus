package z16;

/* loaded from: classes16.dex */
public final class b extends z16.a implements z16.f {

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f469414b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f469415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o06.g classDescriptor, f26.o0 receiverType, n16.g gVar, z16.g gVar2) {
        super(receiverType, gVar2);
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.o.g(receiverType, "receiverType");
        this.f469414b = classDescriptor;
        this.f469415c = gVar;
    }

    @Override // z16.f
    public n16.g a() {
        return this.f469415c;
    }

    public java.lang.String toString() {
        return getType() + ": Ctx { " + this.f469414b + " }";
    }
}
