package i06;

/* loaded from: classes15.dex */
public abstract class f4 {
    public static i06.c4 a(yz5.a aVar) {
        if (aVar != null) {
            return new i06.c4(null, aVar);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
