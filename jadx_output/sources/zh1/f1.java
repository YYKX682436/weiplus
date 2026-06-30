package zh1;

/* loaded from: classes8.dex */
public final class f1 implements android.view.ContextMenu.ContextMenuInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f472880a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f472881b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f472882c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f472883d;

    public f1(java.lang.String line1, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(line1, "line1");
        this.f472880a = line1;
        this.f472881b = str;
        this.f472882c = z17;
        if (str != null) {
            line1 = line1 + '\n' + str;
        }
        this.f472883d = line1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh1.f1)) {
            return false;
        }
        zh1.f1 f1Var = (zh1.f1) obj;
        return kotlin.jvm.internal.o.b(this.f472880a, f1Var.f472880a) && kotlin.jvm.internal.o.b(this.f472881b, f1Var.f472881b) && this.f472882c == f1Var.f472882c;
    }

    public int hashCode() {
        int hashCode = this.f472880a.hashCode() * 31;
        java.lang.String str = this.f472881b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f472882c);
    }

    public java.lang.String toString() {
        return "RawFunctionName2Show(line1=" + this.f472880a + ", line2=" + this.f472881b + ", needEllipsize=" + this.f472882c + ')';
    }

    public /* synthetic */ f1(java.lang.String str, java.lang.String str2, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? false : z17);
    }
}
