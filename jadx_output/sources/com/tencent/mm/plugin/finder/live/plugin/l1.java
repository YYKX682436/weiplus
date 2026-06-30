package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f113333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f113334b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f113335c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f113336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f113337e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f113338f;

    public l1(int i17, long j17, java.lang.CharSequence title, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.CharSequence subTitle, java.lang.CharSequence charSequence, int i18, kotlin.jvm.internal.i iVar) {
        finderJumpInfo = (i18 & 8) != 0 ? null : finderJumpInfo;
        subTitle = (i18 & 16) != 0 ? "" : subTitle;
        charSequence = (i18 & 32) != 0 ? null : charSequence;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(subTitle, "subTitle");
        this.f113333a = i17;
        this.f113334b = j17;
        this.f113335c = title;
        this.f113336d = finderJumpInfo;
        this.f113337e = subTitle;
        this.f113338f = charSequence;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.l1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.l1 l1Var = (com.tencent.mm.plugin.finder.live.plugin.l1) obj;
        return this.f113333a == l1Var.f113333a && this.f113334b == l1Var.f113334b && kotlin.jvm.internal.o.b(this.f113335c, l1Var.f113335c) && kotlin.jvm.internal.o.b(this.f113336d, l1Var.f113336d) && kotlin.jvm.internal.o.b(this.f113337e, l1Var.f113337e) && kotlin.jvm.internal.o.b(this.f113338f, l1Var.f113338f);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f113333a) * 31) + java.lang.Long.hashCode(this.f113334b)) * 31) + this.f113335c.hashCode()) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f113336d;
        int hashCode2 = (((hashCode + (finderJumpInfo == null ? 0 : finderJumpInfo.hashCode())) * 31) + this.f113337e.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.f113338f;
        return hashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CommonInfo(type=" + this.f113333a + ", value=" + this.f113334b + ", title=" + ((java.lang.Object) this.f113335c) + ", jump=" + this.f113336d + ", subTitle=" + ((java.lang.Object) this.f113337e) + ", valueStr=" + ((java.lang.Object) this.f113338f) + ')';
    }
}
