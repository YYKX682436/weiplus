package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f171182a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.e86 f171183b;

    public k2(java.lang.String snsId, r45.e86 comment) {
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(comment, "comment");
        this.f171182a = snsId;
        this.f171183b = comment;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.widget.k2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.widget.k2 k2Var = (com.tencent.mm.plugin.sns.ui.widget.k2) obj;
        if (!kotlin.jvm.internal.o.b(this.f171182a, k2Var.f171182a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f171183b, k2Var.f171183b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        int hashCode = (this.f171182a.hashCode() * 31) + this.f171183b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        java.lang.String str = "SnsCommentMediaLoadItem(snsId=" + this.f171182a + ", comment=" + this.f171183b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return str;
    }
}
