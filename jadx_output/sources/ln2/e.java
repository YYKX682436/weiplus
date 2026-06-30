package ln2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vu1 f319884a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f319885b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.z7 f319886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319887d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f319888e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f319889f;

    public e(r45.vu1 vu1Var, boolean z17, dk2.z7 z7Var, boolean z18, java.util.List list, boolean z19) {
        this.f319884a = vu1Var;
        this.f319885b = z17;
        this.f319886c = z7Var;
        this.f319887d = z18;
        this.f319888e = list;
        this.f319889f = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.e)) {
            return false;
        }
        ln2.e eVar = (ln2.e) obj;
        return kotlin.jvm.internal.o.b(this.f319884a, eVar.f319884a) && this.f319885b == eVar.f319885b && kotlin.jvm.internal.o.b(this.f319886c, eVar.f319886c) && this.f319887d == eVar.f319887d && kotlin.jvm.internal.o.b(this.f319888e, eVar.f319888e) && this.f319889f == eVar.f319889f;
    }

    public int hashCode() {
        r45.vu1 vu1Var = this.f319884a;
        int hashCode = (((vu1Var == null ? 0 : vu1Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f319885b)) * 31;
        dk2.z7 z7Var = this.f319886c;
        int hashCode2 = (((hashCode + (z7Var == null ? 0 : z7Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f319887d)) * 31;
        java.util.List list = this.f319888e;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f319889f);
    }

    public java.lang.String toString() {
        return "WishAudiencePanelData(rewardWishListResp=" + this.f319884a + ", rewardWishUpdate=" + this.f319885b + ", interactionWishInfo=" + this.f319886c + ", interactionWishUpdate=" + this.f319887d + ", boardEventEntries=" + this.f319888e + ", boardEventUpdate=" + this.f319889f + ')';
    }

    public /* synthetic */ e(r45.vu1 vu1Var, boolean z17, dk2.z7 z7Var, boolean z18, java.util.List list, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this(vu1Var, z17, z7Var, z18, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? false : z19);
    }
}
