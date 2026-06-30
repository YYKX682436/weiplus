package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121754b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121755c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121756d;

    public k2(boolean z17, int i17, int i18, boolean z18) {
        this.f121753a = z17;
        this.f121754b = i17;
        this.f121755c = i18;
        this.f121756d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k2 k2Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k2) obj;
        return this.f121753a == k2Var.f121753a && this.f121754b == k2Var.f121754b && this.f121755c == k2Var.f121755c && this.f121756d == k2Var.f121756d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f121753a) * 31) + java.lang.Integer.hashCode(this.f121754b)) * 31) + java.lang.Integer.hashCode(this.f121755c)) * 31) + java.lang.Boolean.hashCode(this.f121756d);
    }

    public java.lang.String toString() {
        return "RequestAndRefreshLiveInfo(isSuccess=" + this.f121753a + ", interval=" + this.f121754b + ", participantCount=" + this.f121755c + ", isLiving=" + this.f121756d + ')';
    }
}
