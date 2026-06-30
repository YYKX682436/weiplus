package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f169054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f169055b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f169056c;

    public x1(int i17, int i18, java.util.ArrayList snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.f169054a = i17;
        this.f169055b = i18;
        this.f169056c = snapshot;
    }

    public final java.util.ArrayList a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return this.f169056c;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.improve.component.x1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var = (com.tencent.mm.plugin.sns.ui.improve.component.x1) obj;
        if (this.f169054a != x1Var.f169054a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        if (this.f169055b != x1Var.f169055b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f169056c, x1Var.f169056c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        int hashCode = (((java.lang.Integer.hashCode(this.f169054a) * 31) + java.lang.Integer.hashCode(this.f169055b)) * 31) + this.f169056c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        java.lang.String str = "ImproveSnapshotStruct(firstVisiblePosition=" + this.f169054a + ", lastVisiblePosition=" + this.f169055b + ", snapshot=" + this.f169056c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return str;
    }
}
