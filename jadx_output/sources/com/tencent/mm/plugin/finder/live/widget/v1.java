package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.u1 f120019f = new com.tencent.mm.plugin.finder.live.widget.u1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f120020a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120021b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f120022c;

    /* renamed from: d, reason: collision with root package name */
    public final int f120023d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f120024e;

    public v1(java.lang.String finderUsername, java.lang.String nickname, java.lang.String str, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f120020a = finderUsername;
        this.f120021b = nickname;
        this.f120022c = str;
        this.f120023d = i17;
        this.f120024e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.v1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.v1 v1Var = (com.tencent.mm.plugin.finder.live.widget.v1) obj;
        return kotlin.jvm.internal.o.b(this.f120020a, v1Var.f120020a) && kotlin.jvm.internal.o.b(this.f120021b, v1Var.f120021b) && kotlin.jvm.internal.o.b(this.f120022c, v1Var.f120022c) && this.f120023d == v1Var.f120023d && this.f120024e == v1Var.f120024e;
    }

    public int hashCode() {
        int hashCode = ((this.f120020a.hashCode() * 31) + this.f120021b.hashCode()) * 31;
        java.lang.String str = this.f120022c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f120023d)) * 31) + java.lang.Boolean.hashCode(this.f120024e);
    }

    public java.lang.String toString() {
        return "CoLiveHostInfo(finderUsername=" + this.f120020a + ", nickname=" + this.f120021b + ", avatarUrl=" + this.f120022c + ", role=" + this.f120023d + ", isRemovable=" + this.f120024e + ')';
    }
}
