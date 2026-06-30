package p06;

/* loaded from: classes15.dex */
public class d implements p06.c {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f350745a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f350746b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.x1 f350747c;

    public d(f26.o0 o0Var, java.util.Map map, o06.x1 x1Var) {
        if (o0Var == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        if (x1Var == null) {
            d(2);
            throw null;
        }
        this.f350745a = o0Var;
        this.f350746b = map;
        this.f350747c = x1Var;
    }

    public static /* synthetic */ void d(int i17) {
        java.lang.String str = (i17 == 3 || i17 == 4 || i17 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 3 || i17 == 4 || i17 == 5) ? 2 : 3];
        if (i17 == 1) {
            objArr[0] = "valueArguments";
        } else if (i17 == 2) {
            objArr[0] = ya.b.SOURCE;
        } else if (i17 == 3 || i17 == 4 || i17 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i17 == 3) {
            objArr[1] = "getType";
        } else if (i17 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i17 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i17 != 3 && i17 != 4 && i17 != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 3 && i17 != 4 && i17 != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // p06.c
    public n16.c a() {
        o06.g d17 = v16.f.d(this);
        if (d17 == null) {
            return null;
        }
        if (h26.m.f(d17)) {
            d17 = null;
        }
        if (d17 != null) {
            return v16.f.c(d17);
        }
        return null;
    }

    @Override // p06.c
    public java.util.Map c() {
        java.util.Map map = this.f350746b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // p06.c
    public o06.x1 getSource() {
        o06.x1 x1Var = this.f350747c;
        if (x1Var != null) {
            return x1Var;
        }
        d(5);
        throw null;
    }

    @Override // p06.c
    public f26.o0 getType() {
        f26.o0 o0Var = this.f350745a;
        if (o0Var != null) {
            return o0Var;
        }
        d(3);
        throw null;
    }

    public java.lang.String toString() {
        return q16.s.f359780a.q(this, null);
    }
}
