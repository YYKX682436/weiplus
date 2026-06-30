package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f117393b;

    public s4(boolean z17, int i17) {
        this.f117392a = z17;
        this.f117393b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.viewmodel.s4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.s4 s4Var = (com.tencent.mm.plugin.finder.live.viewmodel.s4) obj;
        return this.f117392a == s4Var.f117392a && this.f117393b == s4Var.f117393b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f117392a) * 31) + java.lang.Integer.hashCode(this.f117393b);
    }

    public java.lang.String toString() {
        return "KeyboardChangedInfo(show=" + this.f117392a + ", height=" + this.f117393b + ')';
    }
}
