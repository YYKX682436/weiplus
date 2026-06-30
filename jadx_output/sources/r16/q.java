package r16;

/* loaded from: classes15.dex */
public final class q implements g26.f {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // g26.f
    public boolean a(f26.c2 c2Var, f26.c2 c2Var2) {
        if (c2Var == null) {
            b(0);
            throw null;
        }
        if (c2Var2 != null) {
            return c2Var.equals(c2Var2);
        }
        b(1);
        throw null;
    }
}
