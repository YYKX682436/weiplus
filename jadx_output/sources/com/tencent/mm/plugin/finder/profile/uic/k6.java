package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f123888a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableString f123889b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.StringBuilder f123890c;

    public k6(java.lang.String signature, android.text.SpannableString spannableString, java.lang.StringBuilder reportNickName) {
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(reportNickName, "reportNickName");
        this.f123888a = signature;
        this.f123889b = spannableString;
        this.f123890c = reportNickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.profile.uic.k6)) {
            return false;
        }
        com.tencent.mm.plugin.finder.profile.uic.k6 k6Var = (com.tencent.mm.plugin.finder.profile.uic.k6) obj;
        return kotlin.jvm.internal.o.b(this.f123888a, k6Var.f123888a) && kotlin.jvm.internal.o.b(this.f123889b, k6Var.f123889b) && kotlin.jvm.internal.o.b(this.f123890c, k6Var.f123890c);
    }

    public int hashCode() {
        int hashCode = this.f123888a.hashCode() * 31;
        android.text.SpannableString spannableString = this.f123889b;
        return ((hashCode + (spannableString == null ? 0 : spannableString.hashCode())) * 31) + this.f123890c.hashCode();
    }

    public java.lang.String toString() {
        return "DescSpanInfo(signature=" + this.f123888a + ", signatureSpan=" + ((java.lang.Object) this.f123889b) + ", reportNickName=" + ((java.lang.Object) this.f123890c) + ')';
    }
}
