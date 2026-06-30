package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f131618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131619b;

    public a5(int i17, boolean z17) {
        this.f131618a = i17;
        this.f131619b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.a5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.a5 a5Var = (com.tencent.mm.plugin.finder.view.a5) obj;
        return this.f131618a == a5Var.f131618a && this.f131619b == a5Var.f131619b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f131618a) * 31) + java.lang.Boolean.hashCode(this.f131619b);
    }

    public java.lang.String toString() {
        return "DrawerCreateData(scene=" + this.f131618a + ", safeMode=" + this.f131619b + ')';
    }
}
