package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ps {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f135595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f135596b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135597c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f135598d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f135599e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135600f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135601g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f135602h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f135603i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f135604j;

    public ps(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, boolean z47) {
        this.f135595a = z17;
        this.f135596b = z18;
        this.f135597c = z19;
        this.f135598d = z27;
        this.f135599e = z28;
        this.f135600f = z29;
        this.f135601g = z37;
        this.f135602h = z38;
        this.f135603i = z39;
        this.f135604j = z47;
    }

    public final boolean a(boolean z17, boolean z18) {
        return (z17 || this.f135595a || this.f135596b || this.f135600f || this.f135597c || this.f135598d || this.f135599e || this.f135601g || this.f135602h || this.f135603i || this.f135604j || z18) ? false : true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.ps)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ps psVar = (com.tencent.mm.plugin.finder.viewmodel.component.ps) obj;
        return this.f135595a == psVar.f135595a && this.f135596b == psVar.f135596b && this.f135597c == psVar.f135597c && this.f135598d == psVar.f135598d && this.f135599e == psVar.f135599e && this.f135600f == psVar.f135600f && this.f135601g == psVar.f135601g && this.f135602h == psVar.f135602h && this.f135603i == psVar.f135603i && this.f135604j == psVar.f135604j;
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Boolean.hashCode(this.f135595a) * 31) + java.lang.Boolean.hashCode(this.f135596b)) * 31) + java.lang.Boolean.hashCode(this.f135597c)) * 31) + java.lang.Boolean.hashCode(this.f135598d)) * 31) + java.lang.Boolean.hashCode(this.f135599e)) * 31) + java.lang.Boolean.hashCode(this.f135600f)) * 31) + java.lang.Boolean.hashCode(this.f135601g)) * 31) + java.lang.Boolean.hashCode(this.f135602h)) * 31) + java.lang.Boolean.hashCode(this.f135603i)) * 31) + java.lang.Boolean.hashCode(this.f135604j);
    }

    public java.lang.String toString() {
        return "UIStateCheckResult(isDrawerOpen=" + this.f135595a + ", isLikeDrawerOpen=" + this.f135596b + ", isAllLikeDrawerOpen=" + this.f135597c + ", isProfileDrawerOpen=" + this.f135598d + ", isBizProfileDrawerOpen=" + this.f135599e + ", isShowBulletInputUI=" + this.f135600f + ", isLongVideoEndLayoutShown=" + this.f135601g + ", isRecommendDrawerShown=" + this.f135602h + ", isProjectionPanelShown=" + this.f135603i + ", isInScaleMode=" + this.f135604j + ')';
    }
}
