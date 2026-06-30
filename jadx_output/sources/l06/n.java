package l06;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f314886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f314887b;

    public n(java.util.Map map, java.util.Map map2, java.util.Map map3, l06.k kVar) {
        if (map == null) {
            a(0);
            throw null;
        }
        if (map2 == null) {
            a(1);
            throw null;
        }
        if (map3 == null) {
            a(2);
            throw null;
        }
        this.f314886a = map;
        this.f314887b = map3;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
        } else if (i17 != 2) {
            objArr[0] = "primitiveTypeToArrayKotlinType";
        } else {
            objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
