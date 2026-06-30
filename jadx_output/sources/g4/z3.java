package g4;

/* loaded from: classes5.dex */
public final class z3 extends g4.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f268653a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f268654b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f268655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268656d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268657e;

    static {
        new g4.z3(kz5.p0.f313996d, null, null, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.util.List data, java.lang.Object obj, java.lang.Object obj2, int i17, int i18) {
        super(null);
        kotlin.jvm.internal.o.g(data, "data");
        this.f268653a = data;
        this.f268654b = obj;
        this.f268655c = obj2;
        this.f268656d = i17;
        this.f268657e = i18;
        if (!(i17 == Integer.MIN_VALUE || i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("itemsBefore cannot be negative".toString());
        }
        if (!(i18 == Integer.MIN_VALUE || i18 >= 0)) {
            throw new java.lang.IllegalArgumentException("itemsAfter cannot be negative".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z3)) {
            return false;
        }
        g4.z3 z3Var = (g4.z3) obj;
        return kotlin.jvm.internal.o.b(this.f268653a, z3Var.f268653a) && kotlin.jvm.internal.o.b(this.f268654b, z3Var.f268654b) && kotlin.jvm.internal.o.b(this.f268655c, z3Var.f268655c) && this.f268656d == z3Var.f268656d && this.f268657e == z3Var.f268657e;
    }

    public int hashCode() {
        java.util.List list = this.f268653a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        java.lang.Object obj = this.f268654b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f268655c;
        return ((((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f268656d)) * 31) + java.lang.Integer.hashCode(this.f268657e);
    }

    public java.lang.String toString() {
        return "Page(data=" + this.f268653a + ", prevKey=" + this.f268654b + ", nextKey=" + this.f268655c + ", itemsBefore=" + this.f268656d + ", itemsAfter=" + this.f268657e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z3(java.util.List data, java.lang.Object obj, java.lang.Object obj2) {
        this(data, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        kotlin.jvm.internal.o.g(data, "data");
    }
}
