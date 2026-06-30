package oc2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final oc2.i f344209a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f344210b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.f03 f344211c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.jb f344212d;

    public j(oc2.i result, boolean z17, r45.f03 f03Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f344209a = result;
        this.f344210b = z17;
        this.f344211c = f03Var;
        this.f344212d = jbVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.j)) {
            return false;
        }
        oc2.j jVar = (oc2.j) obj;
        return this.f344209a == jVar.f344209a && this.f344210b == jVar.f344210b && kotlin.jvm.internal.o.b(this.f344211c, jVar.f344211c) && kotlin.jvm.internal.o.b(this.f344212d, jVar.f344212d);
    }

    public int hashCode() {
        int hashCode = ((this.f344209a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f344210b)) * 31;
        r45.f03 f03Var = this.f344211c;
        int hashCode2 = (hashCode + (f03Var == null ? 0 : f03Var.hashCode())) * 31;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f344212d;
        return hashCode2 + (jbVar != null ? jbVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RenderResultWrapper(result=" + this.f344209a + ", hasInit=" + this.f344210b + ", showInfo=" + this.f344211c + ", ctrInfo=" + this.f344212d + ')';
    }
}
