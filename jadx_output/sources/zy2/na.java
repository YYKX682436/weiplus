package zy2;

/* loaded from: classes8.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public final r45.za0 f477485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477486b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f477487c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f477488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f477489e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f477490f;

    /* renamed from: g, reason: collision with root package name */
    public r45.f03 f477491g;

    /* renamed from: h, reason: collision with root package name */
    public int f477492h;

    /* renamed from: i, reason: collision with root package name */
    public int f477493i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f477494j;

    public na() {
        this(null, 0, false, null, 0, null, null, 127, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.na)) {
            return false;
        }
        zy2.na naVar = (zy2.na) obj;
        return this.f477485a == naVar.f477485a && this.f477486b == naVar.f477486b && this.f477487c == naVar.f477487c && kotlin.jvm.internal.o.b(this.f477488d, naVar.f477488d) && this.f477489e == naVar.f477489e && kotlin.jvm.internal.o.b(this.f477490f, naVar.f477490f) && kotlin.jvm.internal.o.b(this.f477491g, naVar.f477491g);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f477485a.hashCode() * 31) + java.lang.Integer.hashCode(this.f477486b)) * 31) + java.lang.Boolean.hashCode(this.f477487c)) * 31) + this.f477488d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f477489e)) * 31;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f477490f;
        int hashCode2 = (hashCode + (jbVar == null ? 0 : jbVar.hashCode())) * 31;
        r45.f03 f03Var = this.f477491g;
        return hashCode2 + (f03Var != null ? f03Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DslRenderInfo(dslRenderState=" + this.f477485a + ", friendRemarkFlag=" + this.f477486b + ", hasInit=" + this.f477487c + ", showTitle=" + ((java.lang.Object) this.f477488d) + ", showLines=" + this.f477489e + ", renderCtrlInfo=" + this.f477490f + ", renderShowInfo=" + this.f477491g + ')';
    }

    public na(r45.za0 dslRenderState, int i17, boolean z17, java.lang.CharSequence showTitle, int i18, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        kotlin.jvm.internal.o.g(dslRenderState, "dslRenderState");
        kotlin.jvm.internal.o.g(showTitle, "showTitle");
        this.f477485a = dslRenderState;
        this.f477486b = i17;
        this.f477487c = z17;
        this.f477488d = showTitle;
        this.f477489e = i18;
        this.f477490f = jbVar;
        this.f477491g = f03Var;
    }

    public /* synthetic */ na(r45.za0 za0Var, int i17, boolean z17, java.lang.String str, int i18, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? r45.za0.ORIGINAL_CONTENT : za0Var, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? false : z17, (i19 & 8) != 0 ? "" : str, (i19 & 16) == 0 ? i18 : 0, (i19 & 32) != 0 ? null : jbVar, (i19 & 64) != 0 ? null : f03Var);
    }
}
