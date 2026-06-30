package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f154609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f154610b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.w1 f154611c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f154612d;

    public u4(int i17, boolean z17, com.tencent.wechat.iam.biz.w1 w1Var, boolean z18) {
        this.f154609a = i17;
        this.f154610b = z17;
        this.f154611c = w1Var;
        this.f154612d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.profile.ui.tab.u4)) {
            return false;
        }
        com.tencent.mm.plugin.profile.ui.tab.u4 u4Var = (com.tencent.mm.plugin.profile.ui.tab.u4) obj;
        return this.f154609a == u4Var.f154609a && this.f154610b == u4Var.f154610b && kotlin.jvm.internal.o.b(this.f154611c, u4Var.f154611c) && this.f154612d == u4Var.f154612d;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f154609a) * 31) + java.lang.Boolean.hashCode(this.f154610b)) * 31;
        com.tencent.wechat.iam.biz.w1 w1Var = this.f154611c;
        return ((hashCode + (w1Var == null ? 0 : w1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f154612d);
    }

    public java.lang.String toString() {
        return "PhotoGuideAsyncResult(identity=" + this.f154609a + ", sceneEnabled=" + this.f154610b + ", wording=" + this.f154611c + ", hasPhoto=" + this.f154612d + ')';
    }
}
