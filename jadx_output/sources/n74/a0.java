package n74;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335296a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f335297b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.y f335298c;

    public a0(java.lang.String mediaId, java.lang.String str, n74.y state) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(state, "state");
        this.f335296a = mediaId;
        this.f335297b = str;
        this.f335298c = state;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return this.f335297b;
    }

    public final n74.y b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return this.f335298c;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return true;
        }
        if (!(obj instanceof n74.a0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        n74.a0 a0Var = (n74.a0) obj;
        if (!kotlin.jvm.internal.o.b(this.f335296a, a0Var.f335296a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f335297b, a0Var.f335297b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        n74.y yVar = this.f335298c;
        n74.y yVar2 = a0Var.f335298c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return yVar == yVar2;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        int hashCode = this.f335296a.hashCode() * 31;
        java.lang.String str = this.f335297b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f335298c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        java.lang.String str = "VideoResult(mediaId=" + this.f335296a + ", filePath=" + this.f335297b + ", state=" + this.f335298c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return str;
    }
}
