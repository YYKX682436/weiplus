package r06;

/* loaded from: classes16.dex */
public class k0 extends r06.g {

    /* renamed from: f, reason: collision with root package name */
    public final o06.g f368475f;

    /* renamed from: g, reason: collision with root package name */
    public final z16.e f368476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o06.g gVar) {
        super(p06.i.f350765a);
        if (gVar == null) {
            G(0);
            throw null;
        }
        int i17 = p06.k.Z0;
        this.f368475f = gVar;
        this.f368476g = new z16.e(gVar, null);
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2) ? 2 : 3];
        if (i17 == 1 || i17 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i17 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i17 == 1) {
            objArr[1] = "getValue";
        } else if (i17 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.m
    public o06.m e() {
        o06.g gVar = this.f368475f;
        if (gVar != null) {
            return gVar;
        }
        G(2);
        throw null;
    }

    @Override // o06.r1
    public z16.g getValue() {
        z16.e eVar = this.f368476g;
        if (eVar != null) {
            return eVar;
        }
        G(1);
        throw null;
    }

    @Override // r06.v
    public java.lang.String toString() {
        return "class " + this.f368475f.getName() + "::this";
    }
}
