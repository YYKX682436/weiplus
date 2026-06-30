package h16;

/* loaded from: classes15.dex */
public abstract class e implements g16.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f278236a = new java.util.ArrayList();

    public static /* synthetic */ void f(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "enumEntryName";
        } else if (i17 == 2) {
            objArr[0] = "classLiteralValue";
        } else if (i17 != 3) {
            objArr[0] = "enumClassId";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
        if (i17 == 2) {
            objArr[2] = "visitClassLiteral";
        } else if (i17 != 3) {
            objArr[2] = "visitEnum";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // g16.n0
    public void a() {
        g((java.lang.String[]) ((java.util.ArrayList) this.f278236a).toArray(new java.lang.String[0]));
    }

    @Override // g16.n0
    public void b(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            ((java.util.ArrayList) this.f278236a).add((java.lang.String) obj);
        }
    }

    @Override // g16.n0
    public void c(t16.f fVar) {
        if (fVar != null) {
            return;
        }
        f(2);
        throw null;
    }

    @Override // g16.n0
    public g16.m0 d(n16.b bVar) {
        if (bVar != null) {
            return null;
        }
        f(3);
        throw null;
    }

    @Override // g16.n0
    public void e(n16.b bVar, n16.g gVar) {
        if (bVar == null) {
            f(0);
            throw null;
        }
        if (gVar != null) {
            return;
        }
        f(1);
        throw null;
    }

    public abstract void g(java.lang.String[] strArr);
}
