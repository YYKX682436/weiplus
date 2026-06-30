package gc4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f270456a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270457b;

    public i(boolean z17, java.lang.String EduTriggerFeedid) {
        kotlin.jvm.internal.o.g(EduTriggerFeedid, "EduTriggerFeedid");
        this.f270456a = z17;
        this.f270457b = EduTriggerFeedid;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return true;
        }
        if (!(obj instanceof gc4.i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return false;
        }
        gc4.i iVar = (gc4.i) obj;
        if (this.f270456a != iVar.f270456a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f270457b, iVar.f270457b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        int hashCode = (java.lang.Boolean.hashCode(this.f270456a) * 31) + this.f270457b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        java.lang.String str = "SnsMsgStopRemindReportInfo(blockNotifyEduFlag=" + this.f270456a + ", EduTriggerFeedid=" + this.f270457b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        return str;
    }
}
