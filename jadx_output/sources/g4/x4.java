package g4;

/* loaded from: classes5.dex */
public final class x4 {

    /* renamed from: e, reason: collision with root package name */
    public static final g4.x4 f268618e = new g4.x4(0, kz5.p0.f313996d);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f268619a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f268620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268621c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f268622d;

    public x4(int[] originalPageOffsets, java.util.List data, int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.o.g(data, "data");
        this.f268619a = originalPageOffsets;
        this.f268620b = data;
        this.f268621c = i17;
        this.f268622d = list;
        if (!(originalPageOffsets.length == 0)) {
            if (list == null || list.size() == data.size()) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("If originalIndices (size = ");
            kotlin.jvm.internal.o.d(list);
            sb6.append(list.size());
            sb6.append(") is provided, it must be same length as data (size = ");
            sb6.append(data.size());
            sb6.append(')');
            throw new java.lang.IllegalArgumentException(sb6.toString().toString());
        }
        throw new java.lang.IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(g4.x4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        g4.x4 x4Var = (g4.x4) obj;
        return java.util.Arrays.equals(this.f268619a, x4Var.f268619a) && !(kotlin.jvm.internal.o.b(this.f268620b, x4Var.f268620b) ^ true) && this.f268621c == x4Var.f268621c && !(kotlin.jvm.internal.o.b(this.f268622d, x4Var.f268622d) ^ true);
    }

    public int hashCode() {
        int hashCode = ((((java.util.Arrays.hashCode(this.f268619a) * 31) + this.f268620b.hashCode()) * 31) + this.f268621c) * 31;
        java.util.List list = this.f268622d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TransformablePage(originalPageOffsets=" + java.util.Arrays.toString(this.f268619a) + ", data=" + this.f268620b + ", hintOriginalPageOffset=" + this.f268621c + ", hintOriginalIndices=" + this.f268622d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x4(int i17, java.util.List data) {
        this(new int[]{i17}, data, i17, null);
        kotlin.jvm.internal.o.g(data, "data");
    }
}
