package so2;

/* loaded from: classes2.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.x1 f410463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410464b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f410465c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FeedData f410466d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f410467e;

    public l2(ml2.x1 actionType, int i17, java.lang.String commentscene, com.tencent.mm.plugin.finder.storage.FeedData feedData, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        this.f410463a = actionType;
        this.f410464b = i17;
        this.f410465c = commentscene;
        this.f410466d = feedData;
        this.f410467e = qt2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.l2)) {
            return false;
        }
        so2.l2 l2Var = (so2.l2) obj;
        return this.f410463a == l2Var.f410463a && this.f410464b == l2Var.f410464b && kotlin.jvm.internal.o.b(this.f410465c, l2Var.f410465c) && kotlin.jvm.internal.o.b(this.f410466d, l2Var.f410466d) && kotlin.jvm.internal.o.b(this.f410467e, l2Var.f410467e);
    }

    public int hashCode() {
        int hashCode = ((((this.f410463a.hashCode() * 31) + java.lang.Integer.hashCode(this.f410464b)) * 31) + this.f410465c.hashCode()) * 31;
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f410466d;
        int hashCode2 = (hashCode + (feedData == null ? 0 : feedData.hashCode())) * 31;
        r45.qt2 qt2Var = this.f410467e;
        return hashCode2 + (qt2Var != null ? qt2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PageSelectedReportInfo(actionType=" + this.f410463a + ", index=" + this.f410464b + ", commentscene=" + this.f410465c + ", feedData=" + this.f410466d + ", contextObj=" + this.f410467e + ')';
    }
}
