package ex2;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f257195b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f257196c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.p3 f257197d;

    public a(java.lang.String str, int i17, boolean z17, com.tencent.mm.ui.widget.dialog.p3 p3Var) {
        this.f257194a = str;
        this.f257195b = i17;
        this.f257196c = z17;
        this.f257197d = p3Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex2.a)) {
            return false;
        }
        ex2.a aVar = (ex2.a) obj;
        return kotlin.jvm.internal.o.b(this.f257194a, aVar.f257194a) && this.f257195b == aVar.f257195b && this.f257196c == aVar.f257196c && kotlin.jvm.internal.o.b(this.f257197d, aVar.f257197d);
    }

    public int hashCode() {
        java.lang.String str = this.f257194a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f257195b)) * 31) + java.lang.Boolean.hashCode(this.f257196c)) * 31;
        com.tencent.mm.ui.widget.dialog.p3 p3Var = this.f257197d;
        return hashCode + (p3Var != null ? p3Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BtnConfig(text=" + this.f257194a + ", colorStyle=" + this.f257195b + ", cancel=" + this.f257196c + ", callBack=" + this.f257197d + ')';
    }
}
