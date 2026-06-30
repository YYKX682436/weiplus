package wa4;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f444207a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f444208b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f444209c;

    public c0(java.lang.String photoPath, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(photoPath, "photoPath");
        this.f444207a = photoPath;
        this.f444208b = str;
        this.f444209c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return true;
        }
        if (!(obj instanceof wa4.c0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        wa4.c0 c0Var = (wa4.c0) obj;
        if (!kotlin.jvm.internal.o.b(this.f444207a, c0Var.f444207a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f444208b, c0Var.f444208b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        boolean z17 = this.f444209c;
        boolean z18 = c0Var.f444209c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        int hashCode = this.f444207a.hashCode() * 31;
        java.lang.String str = this.f444208b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f444209c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        java.lang.String str = "Photo(photoPath=" + this.f444207a + ", videoPath=" + this.f444208b + ", isLivePhoto=" + this.f444209c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return str;
    }
}
