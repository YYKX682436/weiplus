package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f125484a;

    /* renamed from: b, reason: collision with root package name */
    public so2.j5 f125485b;

    /* renamed from: c, reason: collision with root package name */
    public int f125486c;

    public z2(boolean z17, so2.j5 j5Var, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        j5Var = (i18 & 2) != 0 ? null : j5Var;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        this.f125484a = z17;
        this.f125485b = j5Var;
        this.f125486c = i17;
    }

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "tab_" + i17 + " refreshCount from " + this.f125486c + " to " + (this.f125486c + 1));
        this.f125486c = this.f125486c + 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.z2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.z2 z2Var = (com.tencent.mm.plugin.finder.report.z2) obj;
        return this.f125484a == z2Var.f125484a && kotlin.jvm.internal.o.b(this.f125485b, z2Var.f125485b) && this.f125486c == z2Var.f125486c;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f125484a) * 31;
        so2.j5 j5Var = this.f125485b;
        return ((hashCode + (j5Var == null ? 0 : j5Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f125486c);
    }

    public java.lang.String toString() {
        return "ReportInfo(doubleTouchEventHappen=" + this.f125484a + ", doubleTouchFeed=" + this.f125485b + ", refreshCount=" + this.f125486c + ')';
    }
}
