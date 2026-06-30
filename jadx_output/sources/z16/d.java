package z16;

/* loaded from: classes16.dex */
public class d extends z16.a {

    /* renamed from: b, reason: collision with root package name */
    public final o06.b f469418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o06.b bVar, f26.o0 o0Var, z16.g gVar) {
        super(o0Var, gVar);
        if (bVar == null) {
            b(0);
            throw null;
        }
        if (o0Var == null) {
            b(1);
            throw null;
        }
        this.f469418b = bVar;
    }

    public static /* synthetic */ void b(int i17) {
        java.lang.String str = i17 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 2 ? 3 : 2];
        if (i17 == 1) {
            objArr[0] = "receiverType";
        } else if (i17 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i17 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i17 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i17 != 2) {
            if (i17 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 2) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    public java.lang.String toString() {
        return getType() + ": Ext {" + this.f469418b + "}";
    }
}
