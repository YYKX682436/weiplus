package i06;

/* loaded from: classes15.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.w3 f286748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f286749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.g f286750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(i06.w3 w3Var, int i17, jz5.g gVar) {
        super(0);
        this.f286748d = w3Var;
        this.f286749e = i17;
        this.f286750f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.w3 w3Var = this.f286748d;
        java.lang.reflect.Type j17 = w3Var.j();
        if (j17 instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) j17;
            java.lang.Class componentType = cls.isArray() ? cls.getComponentType() : java.lang.Object.class;
            kotlin.jvm.internal.o.d(componentType);
            return componentType;
        }
        boolean z17 = j17 instanceof java.lang.reflect.GenericArrayType;
        int i17 = this.f286749e;
        if (z17) {
            if (i17 == 0) {
                java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) j17).getGenericComponentType();
                kotlin.jvm.internal.o.d(genericComponentType);
                return genericComponentType;
            }
            throw new i06.a4("Array type has been queried for a non-0th argument: " + w3Var);
        }
        if (!(j17 instanceof java.lang.reflect.ParameterizedType)) {
            throw new i06.a4("Non-generic type has been queried for arguments: " + w3Var);
        }
        java.lang.reflect.Type type = (java.lang.reflect.Type) ((java.util.List) this.f286750f.getValue()).get(i17);
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            kotlin.jvm.internal.o.f(lowerBounds, "getLowerBounds(...)");
            java.lang.reflect.Type type2 = (java.lang.reflect.Type) kz5.z.O(lowerBounds);
            if (type2 == null) {
                java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
                type = (java.lang.reflect.Type) kz5.z.L(upperBounds);
            } else {
                type = type2;
            }
        }
        kotlin.jvm.internal.o.d(type);
        return type;
    }
}
