package k16;

/* loaded from: classes16.dex */
public class c extends k16.e {
    public c(int i17) {
        super(i17, 1, null);
    }

    @Override // k16.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean c(int i17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf((i17 & (1 << this.f303430a)) != 0);
        if (valueOf != null) {
            return valueOf;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
    }

    public int e(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return 1 << this.f303430a;
        }
        return 0;
    }
}
