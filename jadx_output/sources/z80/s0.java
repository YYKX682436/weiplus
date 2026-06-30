package z80;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f470669a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f470670b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f470671c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f470672d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f470673e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f470674f;

    public s0(java.util.Set firstLineMenuItemSet, java.util.Set secondLineMenuItemSet, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, boolean z17, yz5.l lVar, yz5.l lVar2) {
        kotlin.jvm.internal.o.g(firstLineMenuItemSet, "firstLineMenuItemSet");
        kotlin.jvm.internal.o.g(secondLineMenuItemSet, "secondLineMenuItemSet");
        kotlin.jvm.internal.o.g(locationInfo, "locationInfo");
        this.f470669a = firstLineMenuItemSet;
        this.f470670b = secondLineMenuItemSet;
        this.f470671c = locationInfo;
        this.f470672d = z17;
        this.f470673e = lVar;
        this.f470674f = lVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.s0)) {
            return false;
        }
        z80.s0 s0Var = (z80.s0) obj;
        return kotlin.jvm.internal.o.b(this.f470669a, s0Var.f470669a) && kotlin.jvm.internal.o.b(this.f470670b, s0Var.f470670b) && kotlin.jvm.internal.o.b(this.f470671c, s0Var.f470671c) && this.f470672d == s0Var.f470672d && kotlin.jvm.internal.o.b(this.f470673e, s0Var.f470673e) && kotlin.jvm.internal.o.b(this.f470674f, s0Var.f470674f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f470669a.hashCode() * 31) + this.f470670b.hashCode()) * 31) + this.f470671c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f470672d)) * 31;
        yz5.l lVar = this.f470673e;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f470674f;
        return hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "POIMoreActionSheetMenuConfig(firstLineMenuItemSet=" + this.f470669a + ", secondLineMenuItemSet=" + this.f470670b + ", locationInfo=" + this.f470671c + ", showRecentForward=" + this.f470672d + ", onMenuItemClickCallback=" + this.f470673e + ", onRecentForwardItemClickCallback=" + this.f470674f + ')';
    }
}
