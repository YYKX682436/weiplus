package so2;

/* loaded from: classes2.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.a2 f410524a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f410525b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f410526c;

    /* renamed from: d, reason: collision with root package name */
    public so2.u0 f410527d;

    /* renamed from: e, reason: collision with root package name */
    public int f410528e;

    /* renamed from: f, reason: collision with root package name */
    public long f410529f;

    public o4(so2.a2 a2Var, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.w2 w2Var, so2.u0 u0Var, int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        a2Var = (i18 & 1) != 0 ? null : a2Var;
        recyclerView = (i18 & 2) != 0 ? null : recyclerView;
        w2Var = (i18 & 4) != 0 ? null : w2Var;
        u0Var = (i18 & 8) != 0 ? null : u0Var;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        j17 = (i18 & 32) != 0 ? 0L : j17;
        this.f410524a = a2Var;
        this.f410525b = recyclerView;
        this.f410526c = w2Var;
        this.f410527d = u0Var;
        this.f410528e = i17;
        this.f410529f = j17;
    }

    public final void a(int i17, com.tencent.mm.plugin.finder.viewmodel.component.nu uic, r45.hp2 hp2Var) {
        long intValue;
        kotlin.jvm.internal.o.g(uic, "uic");
        androidx.recyclerview.widget.w2 w2Var = this.f410526c;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f410525b;
        if (w2Var == null) {
            so2.p4 p4Var = new so2.p4(i17, new java.lang.ref.WeakReference(uic));
            this.f410526c = p4Var;
            if (recyclerView != null) {
                recyclerView.i(p4Var);
            }
        }
        if (this.f410527d == null && recyclerView != null && hp2Var != null) {
            if (hp2Var.f376377g != null) {
                intValue = r4.f374505f * 1000;
            } else {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N8).getValue()).r()).intValue();
            }
            long j17 = intValue;
            r45.fp2 fp2Var = hp2Var.f376377g;
            so2.u0 u0Var = new so2.u0("Finder.FinderPopupLogic", new so2.r0(j17, 0, fp2Var != null ? fp2Var.f374504e : -1, 0, false, true, 26, null));
            this.f410527d = u0Var;
            u0Var.a(recyclerView, true, so2.u0.f410618m);
            so2.u0 u0Var2 = this.f410527d;
            if (u0Var2 != null) {
                u0Var2.f410627i = new so2.n4(uic, i17);
            }
        }
        this.f410529f = android.os.SystemClock.elapsedRealtime();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        this.f410528e = linearLayoutManager != null ? linearLayoutManager.x() : 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.o4)) {
            return false;
        }
        so2.o4 o4Var = (so2.o4) obj;
        return kotlin.jvm.internal.o.b(this.f410524a, o4Var.f410524a) && kotlin.jvm.internal.o.b(this.f410525b, o4Var.f410525b) && kotlin.jvm.internal.o.b(this.f410526c, o4Var.f410526c) && kotlin.jvm.internal.o.b(this.f410527d, o4Var.f410527d) && this.f410528e == o4Var.f410528e && this.f410529f == o4Var.f410529f;
    }

    public int hashCode() {
        so2.a2 a2Var = this.f410524a;
        int hashCode = (a2Var == null ? 0 : a2Var.hashCode()) * 31;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f410525b;
        int hashCode2 = (hashCode + (recyclerView == null ? 0 : recyclerView.hashCode())) * 31;
        androidx.recyclerview.widget.w2 w2Var = this.f410526c;
        int hashCode3 = (hashCode2 + (w2Var == null ? 0 : w2Var.hashCode())) * 31;
        so2.u0 u0Var = this.f410527d;
        return ((((hashCode3 + (u0Var != null ? u0Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f410528e)) * 31) + java.lang.Long.hashCode(this.f410529f);
    }

    public java.lang.String toString() {
        so2.s4 s4Var;
        r45.gp2 gp2Var;
        r45.gz2 gz2Var;
        so2.s4 s4Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popup state:");
        r45.vs2 vs2Var = null;
        so2.a2 a2Var = this.f410524a;
        sb6.append((a2Var == null || (s4Var2 = a2Var.f410251h) == null) ? null : s4Var2.f410592a);
        sb6.append(",info:");
        if (a2Var != null && (s4Var = a2Var.f410251h) != null && (gp2Var = s4Var.f410593b) != null && (gz2Var = (r45.gz2) gp2Var.getCustom(0)) != null) {
            vs2Var = (r45.vs2) gz2Var.getCustom(0);
        }
        sb6.append(hc2.u0.e(vs2Var));
        sb6.append(";\tcurRvPos=");
        sb6.append(this.f410528e);
        sb6.append(",lastScrollTime:");
        sb6.append(this.f410529f);
        sb6.append(";\trecyclerView:");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f410525b;
        sb6.append(recyclerView != null ? recyclerView.hashCode() : 0);
        sb6.append(",listener:");
        androidx.recyclerview.widget.w2 w2Var = this.f410526c;
        sb6.append(w2Var != null ? w2Var.hashCode() : 0);
        return sb6.toString();
    }
}
