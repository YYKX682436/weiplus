package nc4;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f336154a;

    /* renamed from: b, reason: collision with root package name */
    public int f336155b;

    /* renamed from: c, reason: collision with root package name */
    public int f336156c;

    /* renamed from: d, reason: collision with root package name */
    public int f336157d;

    public i(int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f336154a = i17;
        this.f336155b = i18;
        this.f336156c = i19;
        this.f336157d = i27;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int i17 = this.f336154a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return true;
        }
        if (!(obj instanceof nc4.i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        nc4.i iVar = (nc4.i) obj;
        if (this.f336154a != iVar.f336154a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        if (this.f336155b != iVar.f336155b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        if (this.f336156c != iVar.f336156c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        int i17 = this.f336157d;
        int i18 = iVar.f336157d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int hashCode = (((((java.lang.Integer.hashCode(this.f336154a) * 31) + java.lang.Integer.hashCode(this.f336155b)) * 31) + java.lang.Integer.hashCode(this.f336156c)) * 31) + java.lang.Integer.hashCode(this.f336157d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        java.lang.String str = "FinderEntranceData(finderEntranceEnableType=" + this.f336154a + ", finderEntranceMaxCountNoUser=" + this.f336155b + ", finderEntranceMaxCountNoFeed=" + this.f336156c + ", finderEntranceMaxCountNormal=" + this.f336157d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return str;
    }
}
