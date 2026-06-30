package qe5;

/* loaded from: classes8.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362173a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362176d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f362177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f362178f;

    public q0(java.lang.String prefix, java.lang.String suffix, int i17, int i18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        this.f362173a = prefix;
        this.f362174b = suffix;
        this.f362175c = i17;
        this.f362176d = i18;
        this.f362177e = z17;
        this.f362178f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5.q0)) {
            return false;
        }
        qe5.q0 q0Var = (qe5.q0) obj;
        return kotlin.jvm.internal.o.b(this.f362173a, q0Var.f362173a) && kotlin.jvm.internal.o.b(this.f362174b, q0Var.f362174b) && this.f362175c == q0Var.f362175c && this.f362176d == q0Var.f362176d && this.f362177e == q0Var.f362177e && this.f362178f == q0Var.f362178f;
    }

    public int hashCode() {
        return (((((((((this.f362173a.hashCode() * 31) + this.f362174b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f362175c)) * 31) + java.lang.Integer.hashCode(this.f362176d)) * 31) + java.lang.Boolean.hashCode(this.f362177e)) * 31) + java.lang.Boolean.hashCode(this.f362178f);
    }

    public java.lang.String toString() {
        return "FileMatchRule(prefix=" + this.f362173a + ", suffix=" + this.f362174b + ", labelResId=" + this.f362175c + ", resultId=" + this.f362176d + ", ignoreCase=" + this.f362177e + ", isDebugOnly=" + this.f362178f + ')';
    }

    public /* synthetic */ q0(java.lang.String str, java.lang.String str2, int i17, int i18, boolean z17, boolean z18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, str2, i17, i18, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? false : z18);
    }
}
