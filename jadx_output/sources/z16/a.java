package z16;

/* loaded from: classes16.dex */
public abstract class a implements z16.g {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f469413a;

    public a(f26.o0 o0Var, z16.g gVar) {
        if (o0Var != null) {
            this.f469413a = o0Var;
        } else {
            b(0);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2) ? 2 : 3];
        if (i17 == 1 || i17 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i17 == 1) {
            objArr[1] = "getType";
        } else if (i17 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i17 != 1 && i17 != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // z16.g
    public f26.o0 getType() {
        f26.o0 o0Var = this.f469413a;
        if (o0Var != null) {
            return o0Var;
        }
        b(1);
        throw null;
    }
}
