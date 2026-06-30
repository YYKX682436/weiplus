package v11;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432399a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f432400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432401c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432402d;

    /* renamed from: e, reason: collision with root package name */
    public final v11.s f432403e;

    public i(java.lang.String prefix, boolean z17, int i17, java.util.List textRuns, v11.s sVar) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(textRuns, "textRuns");
        this.f432399a = prefix;
        this.f432400b = z17;
        this.f432401c = i17;
        this.f432402d = textRuns;
        this.f432403e = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.i)) {
            return false;
        }
        v11.i iVar = (v11.i) obj;
        return kotlin.jvm.internal.o.b(this.f432399a, iVar.f432399a) && this.f432400b == iVar.f432400b && this.f432401c == iVar.f432401c && kotlin.jvm.internal.o.b(this.f432402d, iVar.f432402d) && kotlin.jvm.internal.o.b(this.f432403e, iVar.f432403e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f432399a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f432400b)) * 31) + java.lang.Integer.hashCode(this.f432401c)) * 31) + this.f432402d.hashCode()) * 31;
        v11.s sVar = this.f432403e;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "ListItemUiModel(prefix=" + this.f432399a + ", ordered=" + this.f432400b + ", indentLevel=" + this.f432401c + ", textRuns=" + this.f432402d + ", sourceRange=" + this.f432403e + ')';
    }
}
