package p06;

/* loaded from: classes15.dex */
public abstract class b implements p06.a {

    /* renamed from: d, reason: collision with root package name */
    public final p06.k f350744d;

    public b(p06.k kVar) {
        if (kVar != null) {
            this.f350744d = kVar;
        } else {
            G(0);
            throw null;
        }
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = i17 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 1 ? 3 : 2];
        if (i17 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i17 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i17 != 1) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 1) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        p06.k kVar = this.f350744d;
        if (kVar != null) {
            return kVar;
        }
        G(1);
        throw null;
    }
}
