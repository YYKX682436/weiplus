package wa4;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f444220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f444221b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f444222c;

    public e0(java.lang.String str, int i17, byte[] bArr, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 1) != 0 ? null : str;
        i17 = (i18 & 2) != 0 ? -1 : i17;
        bArr = (i18 & 4) != 0 ? null : bArr;
        this.f444220a = str;
        this.f444221b = i17;
        this.f444222c = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return true;
        }
        if (!(obj instanceof wa4.e0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        wa4.e0 e0Var = (wa4.e0) obj;
        if (!kotlin.jvm.internal.o.b(this.f444220a, e0Var.f444220a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        if (this.f444221b != e0Var.f444221b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f444222c, e0Var.f444222c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        java.lang.String str = this.f444220a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f444221b)) * 31;
        byte[] bArr = this.f444222c;
        int hashCode2 = hashCode + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        java.lang.String str = "Video(videoPath=" + this.f444220a + ", videoSourceScene=" + this.f444221b + ", compositionInfo=" + java.util.Arrays.toString(this.f444222c) + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return str;
    }
}
