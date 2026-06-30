package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f175537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175539c;

    /* renamed from: d, reason: collision with root package name */
    public final int f175540d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.ABAPrams f175541e;

    public a(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams) {
        this.f175537a = i17;
        this.f175538b = i18;
        this.f175539c = i19;
        this.f175540d = i27;
        this.f175541e = aBAPrams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.a)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.a aVar = (com.tencent.mm.plugin.vlog.model.a) obj;
        return this.f175537a == aVar.f175537a && this.f175538b == aVar.f175538b && this.f175539c == aVar.f175539c && this.f175540d == aVar.f175540d && kotlin.jvm.internal.o.b(this.f175541e, aVar.f175541e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f175537a) * 31) + java.lang.Integer.hashCode(this.f175538b)) * 31) + java.lang.Integer.hashCode(this.f175539c)) * 31) + java.lang.Integer.hashCode(this.f175540d)) * 31;
        com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = this.f175541e;
        return hashCode + (aBAPrams == null ? 0 : aBAPrams.hashCode());
    }

    public java.lang.String toString() {
        return "ABAResult(errCode=" + this.f175537a + ", width=" + this.f175538b + ", height=" + this.f175539c + ", bitrate=" + this.f175540d + ", abaParams=" + this.f175541e + ')';
    }
}
