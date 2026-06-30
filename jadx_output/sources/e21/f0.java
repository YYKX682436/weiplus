package e21;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final xg3.q0 f246516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f246517b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f246518c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f246519d;

    public f0(xg3.q0 op6, int i17, java.lang.String title, java.lang.String content) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        this.f246516a = op6;
        this.f246517b = i17;
        this.f246518c = title;
        this.f246519d = content;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e21.f0)) {
            return false;
        }
        e21.f0 f0Var = (e21.f0) obj;
        return kotlin.jvm.internal.o.b(this.f246516a, f0Var.f246516a) && this.f246517b == f0Var.f246517b && kotlin.jvm.internal.o.b(this.f246518c, f0Var.f246518c) && kotlin.jvm.internal.o.b(this.f246519d, f0Var.f246519d);
    }

    public int hashCode() {
        return (((((this.f246516a.hashCode() * 31) + java.lang.Integer.hashCode(this.f246517b)) * 31) + this.f246518c.hashCode()) * 31) + this.f246519d.hashCode();
    }

    public java.lang.String toString() {
        return "OplogResultRet(op=" + this.f246516a + ", ret=" + this.f246517b + ", title=" + this.f246518c + ", content=" + this.f246519d + ')';
    }
}
