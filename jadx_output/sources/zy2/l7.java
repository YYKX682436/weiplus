package zy2;

/* loaded from: classes2.dex */
public final class l7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f477455a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f477456b;

    public l7(boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f477455a = z17;
        this.f477456b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.l7)) {
            return false;
        }
        zy2.l7 l7Var = (zy2.l7) obj;
        return this.f477455a == l7Var.f477455a && this.f477456b == l7Var.f477456b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f477455a) * 31) + java.lang.Boolean.hashCode(this.f477456b);
    }

    public java.lang.String toString() {
        return "DislikeEduTipsStatus(enableDislikeEduItemHighLight=" + this.f477455a + ", lastShownAsHighLight=" + this.f477456b + ')';
    }
}
