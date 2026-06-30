package o06;

/* loaded from: classes14.dex */
public final class o0 extends o06.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f341975a;

    /* renamed from: b, reason: collision with root package name */
    public final i26.j f341976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n16.g underlyingPropertyName, i26.j underlyingType) {
        super(null);
        kotlin.jvm.internal.o.g(underlyingPropertyName, "underlyingPropertyName");
        kotlin.jvm.internal.o.g(underlyingType, "underlyingType");
        this.f341975a = underlyingPropertyName;
        this.f341976b = underlyingType;
    }

    @Override // o06.j2
    public boolean a(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return kotlin.jvm.internal.o.b(this.f341975a, name);
    }

    @Override // o06.j2
    public java.util.List b() {
        return kz5.b0.c(new jz5.l(this.f341975a, this.f341976b));
    }

    public java.lang.String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f341975a + ", underlyingType=" + this.f341976b + ')';
    }
}
