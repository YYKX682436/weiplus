package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ov2 f131889a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f131890b;

    public dd(r45.ov2 coupon, java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(coupon, "coupon");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        this.f131889a = coupon;
        this.f131890b = noticeId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.dd)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.dd ddVar = (com.tencent.mm.plugin.finder.view.dd) obj;
        return kotlin.jvm.internal.o.b(this.f131889a, ddVar.f131889a) && kotlin.jvm.internal.o.b(this.f131890b, ddVar.f131890b);
    }

    public int hashCode() {
        return (this.f131889a.hashCode() * 31) + this.f131890b.hashCode();
    }

    public java.lang.String toString() {
        return "SuccessDialogData(coupon=" + this.f131889a + ", noticeId=" + this.f131890b + ')';
    }
}
