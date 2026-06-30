package r06;

/* loaded from: classes16.dex */
public class p extends f26.l {

    /* renamed from: c, reason: collision with root package name */
    public final o06.c2 f368500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.q f368501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r06.q qVar, e26.c0 c0Var, o06.c2 c2Var) {
        super(c0Var);
        if (c0Var == null) {
            k(0);
            throw null;
        }
        this.f368501d = qVar;
        this.f368500c = c2Var;
    }

    public static /* synthetic */ void k(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 8) ? 2 : 3];
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i17 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i17 == 2) {
            objArr[1] = "getParameters";
        } else if (i17 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i17 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i17 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i17 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5 && i17 != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // f26.r
    public boolean b(o06.j jVar) {
        if (jVar == null) {
            k(9);
            throw null;
        }
        if (jVar instanceof o06.e2) {
            r06.q a17 = this.f368501d;
            kotlin.jvm.internal.o.g(a17, "a");
            if (r16.f.f368656a.b(a17, (o06.e2) jVar, true, r16.e.f368655d)) {
                return true;
            }
        }
        return false;
    }

    @Override // f26.l
    public java.util.Collection c() {
        java.util.List u07 = this.f368501d.u0();
        if (u07 != null) {
            return u07;
        }
        k(1);
        throw null;
    }

    @Override // f26.l
    public f26.o0 d() {
        return h26.m.c(h26.l.f278358m, new java.lang.String[0]);
    }

    @Override // f26.l
    public o06.c2 e() {
        o06.c2 c2Var = this.f368500c;
        if (c2Var != null) {
            return c2Var;
        }
        k(5);
        throw null;
    }

    @Override // f26.l
    public java.util.List g(java.util.List list) {
        if (list == null) {
            k(7);
            throw null;
        }
        java.util.List s07 = this.f368501d.s0(list);
        if (s07 != null) {
            return s07;
        }
        k(8);
        throw null;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        k(2);
        throw null;
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o e17 = v16.f.e(this.f368501d);
        if (e17 != null) {
            return e17;
        }
        k(4);
        throw null;
    }

    @Override // f26.c2
    public o06.j i() {
        r06.q qVar = this.f368501d;
        if (qVar != null) {
            return qVar;
        }
        k(3);
        throw null;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    public java.lang.String toString() {
        return this.f368501d.getName().f334169d;
    }
}
