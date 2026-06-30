package ln2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vu1 f319878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f319879b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xs1 f319880c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319881d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f319882e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f319883f;

    public d(r45.vu1 vu1Var, boolean z17, r45.xs1 xs1Var, boolean z18, java.util.List list, boolean z19) {
        this.f319878a = vu1Var;
        this.f319879b = z17;
        this.f319880c = xs1Var;
        this.f319881d = z18;
        this.f319882e = list;
        this.f319883f = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.d)) {
            return false;
        }
        ln2.d dVar = (ln2.d) obj;
        return kotlin.jvm.internal.o.b(this.f319878a, dVar.f319878a) && this.f319879b == dVar.f319879b && kotlin.jvm.internal.o.b(this.f319880c, dVar.f319880c) && this.f319881d == dVar.f319881d && kotlin.jvm.internal.o.b(this.f319882e, dVar.f319882e) && this.f319883f == dVar.f319883f;
    }

    public int hashCode() {
        r45.vu1 vu1Var = this.f319878a;
        int hashCode = (((vu1Var == null ? 0 : vu1Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f319879b)) * 31;
        r45.xs1 xs1Var = this.f319880c;
        int hashCode2 = (((hashCode + (xs1Var == null ? 0 : xs1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f319881d)) * 31;
        java.util.List list = this.f319882e;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f319883f);
    }

    public java.lang.String toString() {
        return "WishAnchorPanelData(rewardWishListResp=" + this.f319878a + ", rewardWishUpdate=" + this.f319879b + ", interactionWishResp=" + this.f319880c + ", interactionWishUpdate=" + this.f319881d + ", boardEventEntries=" + this.f319882e + ", boardEventUpdate=" + this.f319883f + ')';
    }

    public /* synthetic */ d(r45.vu1 vu1Var, boolean z17, r45.xs1 xs1Var, boolean z18, java.util.List list, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this(vu1Var, z17, xs1Var, z18, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? false : z19);
    }
}
