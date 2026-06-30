package cw1;

/* loaded from: classes12.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f222991a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f222992b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f222993c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f222994d;

    /* renamed from: e, reason: collision with root package name */
    public final int f222995e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f222996f;

    /* renamed from: g, reason: collision with root package name */
    public final int f222997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f222998h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f222999i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f223000j;

    public i4(java.lang.String str, int[] iArr, int[] iArr2, long[] timeRange, int i17, java.lang.Boolean bool, int i18, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        this.f222991a = str;
        this.f222992b = iArr;
        this.f222993c = iArr2;
        this.f222994d = timeRange;
        this.f222995e = i17;
        this.f222996f = bool;
        this.f222997g = i18;
        this.f222998h = z17;
        this.f222999i = z18;
        this.f223000j = z19;
    }

    public boolean equals(java.lang.Object obj) {
        cw1.i4 i4Var = obj instanceof cw1.i4 ? (cw1.i4) obj : null;
        return i4Var != null && this.f222995e == i4Var.f222995e && kotlin.jvm.internal.o.b(this.f222996f, i4Var.f222996f) && this.f222998h == i4Var.f222998h && this.f222999i == i4Var.f222999i && this.f223000j == i4Var.f223000j && kotlin.jvm.internal.o.b(this.f222991a, i4Var.f222991a) && this.f222997g == i4Var.f222997g && java.util.Arrays.equals(this.f222992b, i4Var.f222992b) && java.util.Arrays.equals(this.f222993c, i4Var.f222993c) && java.util.Arrays.equals(this.f222994d, i4Var.f222994d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        return java.util.Arrays.deepHashCode(new java.io.Serializable[]{this.f222991a, this.f222992b, this.f222993c, this.f222994d, java.lang.Integer.valueOf(this.f222995e), this.f222996f, java.lang.Integer.valueOf(this.f222997g), java.lang.Boolean.valueOf(this.f222998h), java.lang.Boolean.valueOf(this.f222999i), java.lang.Boolean.valueOf(this.f223000j)});
    }
}
