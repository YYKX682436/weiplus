package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f122281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f122282b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f122283c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f122284d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vx0 f122285e;

    /* renamed from: f, reason: collision with root package name */
    public final nr2.m f122286f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f122287g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f122288h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f122289i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f122290j;

    public d2(long j17, java.lang.String str, java.lang.String nonceId, boolean z17, r45.vx0 vx0Var, nr2.m mVar, java.lang.String authorUsername, java.lang.String str2) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(authorUsername, "authorUsername");
        this.f122281a = j17;
        this.f122282b = str;
        this.f122283c = nonceId;
        this.f122284d = z17;
        this.f122285e = vx0Var;
        this.f122286f = mVar;
        this.f122287g = authorUsername;
        this.f122288h = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.playlist.d2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.playlist.d2 d2Var = (com.tencent.mm.plugin.finder.playlist.d2) obj;
        return this.f122281a == d2Var.f122281a && kotlin.jvm.internal.o.b(this.f122282b, d2Var.f122282b) && kotlin.jvm.internal.o.b(this.f122283c, d2Var.f122283c) && this.f122284d == d2Var.f122284d && kotlin.jvm.internal.o.b(this.f122285e, d2Var.f122285e) && kotlin.jvm.internal.o.b(this.f122286f, d2Var.f122286f) && kotlin.jvm.internal.o.b(this.f122287g, d2Var.f122287g) && kotlin.jvm.internal.o.b(this.f122288h, d2Var.f122288h);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f122281a) * 31;
        java.lang.String str = this.f122282b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f122283c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f122284d)) * 31;
        r45.vx0 vx0Var = this.f122285e;
        int hashCode3 = (hashCode2 + (vx0Var == null ? 0 : vx0Var.hashCode())) * 31;
        nr2.m mVar = this.f122286f;
        int hashCode4 = (((hashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.f122287g.hashCode()) * 31;
        java.lang.String str2 = this.f122288h;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderPlayListInitParam(feedId=" + this.f122281a + ", dupFlag=" + this.f122282b + ", nonceId=" + this.f122283c + ", isSelfFeed=" + this.f122284d + ", collectionInfo=" + this.f122285e + ", paidCollectionData=" + this.f122286f + ", authorUsername=" + this.f122287g + ", encryptedTopicId=" + this.f122288h + ')';
    }

    public /* synthetic */ d2(long j17, java.lang.String str, java.lang.String str2, boolean z17, r45.vx0 vx0Var, nr2.m mVar, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, str, str2, z17, vx0Var, mVar, str3, (i17 & 128) != 0 ? null : str4);
    }
}
