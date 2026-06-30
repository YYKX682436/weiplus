package f26;

/* loaded from: classes16.dex */
public class n2 extends f26.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.d3 f259200a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.o0 f259201b;

    public n2(f26.d3 d3Var, f26.o0 o0Var) {
        if (d3Var == null) {
            d(0);
            throw null;
        }
        if (o0Var != null) {
            this.f259200a = d3Var;
            this.f259201b = o0Var;
        } else {
            d(1);
            throw null;
        }
    }

    public static /* synthetic */ void d(int i17) {
        java.lang.String str = (i17 == 4 || i17 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 4 || i17 == 5) ? 2 : 3];
        switch (i17) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i17 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i17 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i17 == 3) {
            objArr[2] = "replaceType";
        } else if (i17 != 4 && i17 != 5) {
            if (i17 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 4 && i17 != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // f26.l2
    public f26.l2 a(g26.l lVar) {
        if (lVar != null) {
            return new f26.n2(this.f259200a, lVar.a(this.f259201b));
        }
        d(6);
        throw null;
    }

    @Override // f26.l2
    public boolean b() {
        return false;
    }

    @Override // f26.l2
    public f26.d3 c() {
        f26.d3 d3Var = this.f259200a;
        if (d3Var != null) {
            return d3Var;
        }
        d(4);
        throw null;
    }

    @Override // f26.l2
    public f26.o0 getType() {
        f26.o0 o0Var = this.f259201b;
        if (o0Var != null) {
            return o0Var;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n2(f26.o0 o0Var) {
        this(f26.d3.f259143f, o0Var);
        if (o0Var != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
