package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f168960a;

    /* renamed from: b, reason: collision with root package name */
    public final zc4.b f168961b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f168962c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f168963d;

    public o0(int i17, zc4.b item, android.view.View view, android.graphics.Rect pos) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(pos, "pos");
        this.f168960a = i17;
        this.f168961b = item;
        this.f168962c = view;
        this.f168963d = pos;
    }

    public final zc4.b a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return this.f168961b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.improve.component.o0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.improve.component.o0 o0Var = (com.tencent.mm.plugin.sns.ui.improve.component.o0) obj;
        if (this.f168960a != o0Var.f168960a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f168961b, o0Var.f168961b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f168962c, o0Var.f168962c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f168963d, o0Var.f168963d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        int hashCode = (((((java.lang.Integer.hashCode(this.f168960a) * 31) + this.f168961b.hashCode()) * 31) + this.f168962c.hashCode()) * 31) + this.f168963d.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        java.lang.String str = "ImproveItemSnapshot(index=" + this.f168960a + ", item=" + this.f168961b + ", view=" + this.f168962c + ", pos=" + this.f168963d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return str;
    }
}
