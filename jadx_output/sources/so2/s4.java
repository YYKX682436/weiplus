package so2;

/* loaded from: classes2.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public so2.r4 f410592a;

    /* renamed from: b, reason: collision with root package name */
    public r45.gp2 f410593b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ag f410594c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f410595d;

    public s4(so2.r4 state, r45.gp2 gp2Var, com.tencent.mm.plugin.finder.view.ag hideReason, r45.qt2 qt2Var, int i17, kotlin.jvm.internal.i iVar) {
        state = (i17 & 1) != 0 ? so2.r4.f410575e : state;
        gp2Var = (i17 & 2) != 0 ? null : gp2Var;
        hideReason = (i17 & 4) != 0 ? com.tencent.mm.plugin.finder.view.ag.f131637e : hideReason;
        qt2Var = (i17 & 8) != 0 ? null : qt2Var;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(hideReason, "hideReason");
        this.f410592a = state;
        this.f410593b = gp2Var;
        this.f410594c = hideReason;
        this.f410595d = qt2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.s4)) {
            return false;
        }
        so2.s4 s4Var = (so2.s4) obj;
        return this.f410592a == s4Var.f410592a && kotlin.jvm.internal.o.b(this.f410593b, s4Var.f410593b) && this.f410594c == s4Var.f410594c && kotlin.jvm.internal.o.b(this.f410595d, s4Var.f410595d);
    }

    public int hashCode() {
        int hashCode = this.f410592a.hashCode() * 31;
        r45.gp2 gp2Var = this.f410593b;
        int hashCode2 = (((hashCode + (gp2Var == null ? 0 : gp2Var.hashCode())) * 31) + this.f410594c.hashCode()) * 31;
        r45.qt2 qt2Var = this.f410595d;
        return hashCode2 + (qt2Var != null ? qt2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderPopupTips(state=" + this.f410592a + ", finderPopup=" + this.f410593b + ", hideReason=" + this.f410594c + ", lastReportContextObj=" + this.f410595d + ')';
    }
}
