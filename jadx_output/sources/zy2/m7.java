package zy2;

/* loaded from: classes2.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.k7 f477475a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.l7 f477476b;

    /* renamed from: c, reason: collision with root package name */
    public final zy2.n7 f477477c;

    public m7(zy2.k7 autoScrollTipsStatus, zy2.l7 dislikeEduTipsStatus, zy2.n7 longPressQuickReleaseTipsStatus, int i17, kotlin.jvm.internal.i iVar) {
        autoScrollTipsStatus = (i17 & 1) != 0 ? new zy2.k7(0, false, false, 7, null) : autoScrollTipsStatus;
        dislikeEduTipsStatus = (i17 & 2) != 0 ? new zy2.l7(false, false, 3, null) : dislikeEduTipsStatus;
        longPressQuickReleaseTipsStatus = (i17 & 4) != 0 ? new zy2.n7(false, 1, null) : longPressQuickReleaseTipsStatus;
        kotlin.jvm.internal.o.g(autoScrollTipsStatus, "autoScrollTipsStatus");
        kotlin.jvm.internal.o.g(dislikeEduTipsStatus, "dislikeEduTipsStatus");
        kotlin.jvm.internal.o.g(longPressQuickReleaseTipsStatus, "longPressQuickReleaseTipsStatus");
        this.f477475a = autoScrollTipsStatus;
        this.f477476b = dislikeEduTipsStatus;
        this.f477477c = longPressQuickReleaseTipsStatus;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.m7)) {
            return false;
        }
        zy2.m7 m7Var = (zy2.m7) obj;
        return kotlin.jvm.internal.o.b(this.f477475a, m7Var.f477475a) && kotlin.jvm.internal.o.b(this.f477476b, m7Var.f477476b) && kotlin.jvm.internal.o.b(this.f477477c, m7Var.f477477c);
    }

    public int hashCode() {
        return (((this.f477475a.hashCode() * 31) + this.f477476b.hashCode()) * 31) + this.f477477c.hashCode();
    }

    public java.lang.String toString() {
        return "FeedTipsStatus(autoScrollTipsStatus=" + this.f477475a + ", dislikeEduTipsStatus=" + this.f477476b + ", longPressQuickReleaseTipsStatus=" + this.f477477c + ')';
    }
}
