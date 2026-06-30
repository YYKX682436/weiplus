package i64;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289297a;

    /* renamed from: b, reason: collision with root package name */
    public final int f289298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f289299c;

    public r(java.lang.String str, int i17, int i18) {
        this.f289297a = str;
        this.f289298b = i17;
        this.f289299c = i18;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return this.f289298b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return true;
        }
        if (!(obj instanceof i64.r)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        i64.r rVar = (i64.r) obj;
        if (!kotlin.jvm.internal.o.b(this.f289297a, rVar.f289297a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        if (this.f289298b != rVar.f289298b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        int i17 = this.f289299c;
        int i18 = rVar.f289299c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        java.lang.String str = this.f289297a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f289298b)) * 31) + java.lang.Integer.hashCode(this.f289299c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        java.lang.String str = "AdDownloadData(appId=" + this.f289297a + ", state=" + this.f289298b + ", progress=" + this.f289299c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return str;
    }

    public /* synthetic */ r(java.lang.String str, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
