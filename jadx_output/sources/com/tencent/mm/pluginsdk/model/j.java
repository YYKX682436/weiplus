package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f189345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f189346b;

    public j(boolean z17, boolean z18) {
        this.f189345a = z17;
        this.f189346b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.model.j)) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.j jVar = (com.tencent.mm.pluginsdk.model.j) obj;
        return this.f189345a == jVar.f189345a && this.f189346b == jVar.f189346b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f189345a) * 31) + java.lang.Boolean.hashCode(this.f189346b);
    }

    public java.lang.String toString() {
        return "ShowFinderDigestResult(showDigest=" + this.f189345a + ", showRedDot=" + this.f189346b + ')';
    }
}
