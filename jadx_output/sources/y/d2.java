package y;

/* loaded from: classes16.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f458328a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f458329b;

    public d2(java.lang.String title, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(title, "title");
        this.f458328a = title;
        this.f458329b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.d2)) {
            return false;
        }
        y.d2 d2Var = (y.d2) obj;
        return kotlin.jvm.internal.o.b(this.f458328a, d2Var.f458328a) && this.f458329b == d2Var.f458329b;
    }

    public int hashCode() {
        return (this.f458328a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f458329b);
    }

    public java.lang.String toString() {
        return "MicConditionInfo(title=" + this.f458328a + ", checked=" + this.f458329b + ')';
    }
}
