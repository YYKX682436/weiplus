package g4;

/* loaded from: classes5.dex */
public final class i1 extends g4.l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final g4.i1 f268367f;

    /* renamed from: g, reason: collision with root package name */
    public static final g4.g1 f268368g;

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f268369a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f268370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268371c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268372d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.a0 f268373e;

    static {
        g4.g1 g1Var = new g4.g1(null);
        f268368g = g1Var;
        g4.x4 x4Var = g4.x4.f268618e;
        java.util.List c17 = kz5.b0.c(g4.x4.f268618e);
        g4.x0 x0Var = g4.x0.f268605c;
        g4.x0 x0Var2 = g4.x0.f268604b;
        f268367f = g1Var.a(c17, 0, 0, new g4.a0(x0Var, x0Var2, x0Var2, new g4.z0(x0Var, x0Var2, x0Var2), null, 16, null));
    }

    public i1(g4.a1 a1Var, java.util.List list, int i17, int i18, g4.a0 a0Var) {
        super(null);
        this.f268369a = a1Var;
        this.f268370b = list;
        this.f268371c = i17;
        this.f268372d = i18;
        this.f268373e = a0Var;
        if (!(a1Var == g4.a1.APPEND || i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i17).toString());
        }
        if (a1Var == g4.a1.PREPEND || i18 >= 0) {
            if (!(a1Var != g4.a1.REFRESH || (list.isEmpty() ^ true))) {
                throw new java.lang.IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        } else {
            throw new java.lang.IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i18).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ed -> B:10:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:19:0x00b2). Please report as a decompilation issue!!! */
    @Override // g4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yz5.p r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i1.a(yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.i1)) {
            return false;
        }
        g4.i1 i1Var = (g4.i1) obj;
        return kotlin.jvm.internal.o.b(this.f268369a, i1Var.f268369a) && kotlin.jvm.internal.o.b(this.f268370b, i1Var.f268370b) && this.f268371c == i1Var.f268371c && this.f268372d == i1Var.f268372d && kotlin.jvm.internal.o.b(this.f268373e, i1Var.f268373e);
    }

    public int hashCode() {
        g4.a1 a1Var = this.f268369a;
        int hashCode = (a1Var != null ? a1Var.hashCode() : 0) * 31;
        java.util.List list = this.f268370b;
        int hashCode2 = (((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f268371c)) * 31) + java.lang.Integer.hashCode(this.f268372d)) * 31;
        g4.a0 a0Var = this.f268373e;
        return hashCode2 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Insert(loadType=" + this.f268369a + ", pages=" + this.f268370b + ", placeholdersBefore=" + this.f268371c + ", placeholdersAfter=" + this.f268372d + ", combinedLoadStates=" + this.f268373e + ")";
    }
}
