package o06;

/* loaded from: classes14.dex */
public final class w0 extends o06.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f342001a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f342002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.util.List underlyingPropertyNamesToTypes) {
        super(null);
        kotlin.jvm.internal.o.g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f342001a = underlyingPropertyNamesToTypes;
        java.util.Map q17 = kz5.c1.q(underlyingPropertyNamesToTypes);
        if (!(q17.size() == underlyingPropertyNamesToTypes.size())) {
            throw new java.lang.IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f342002b = q17;
    }

    @Override // o06.j2
    public boolean a(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return this.f342002b.containsKey(name);
    }

    @Override // o06.j2
    public java.util.List b() {
        return this.f342001a;
    }

    public java.lang.String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f342001a + ')';
    }
}
