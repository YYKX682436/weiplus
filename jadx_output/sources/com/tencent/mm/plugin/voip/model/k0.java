package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f176689a;

    /* renamed from: b, reason: collision with root package name */
    public final long f176690b;

    /* renamed from: c, reason: collision with root package name */
    public final long f176691c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f176692d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f176693e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f176694f;

    public k0(long j17, long j18, long j19, java.lang.String str, boolean z17, boolean z18) {
        this.f176689a = j17;
        this.f176690b = j18;
        this.f176691c = j19;
        this.f176692d = str;
        this.f176693e = z17;
        this.f176694f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.voip.model.k0)) {
            return false;
        }
        com.tencent.mm.plugin.voip.model.k0 k0Var = (com.tencent.mm.plugin.voip.model.k0) obj;
        return this.f176689a == k0Var.f176689a && this.f176690b == k0Var.f176690b && this.f176691c == k0Var.f176691c && kotlin.jvm.internal.o.b(this.f176692d, k0Var.f176692d) && this.f176693e == k0Var.f176693e && this.f176694f == k0Var.f176694f;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f176689a) * 31) + java.lang.Long.hashCode(this.f176690b)) * 31) + java.lang.Long.hashCode(this.f176691c)) * 31;
        java.lang.String str = this.f176692d;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f176693e)) * 31) + java.lang.Boolean.hashCode(this.f176694f);
    }

    public java.lang.String toString() {
        return "VoIPInfo(roomId=" + this.f176689a + ", roomKey=" + this.f176690b + ", inviteId=" + this.f176691c + ", talkerName=" + this.f176692d + ", videoRoom=" + this.f176693e + ", outCall=" + this.f176694f + ')';
    }
}
