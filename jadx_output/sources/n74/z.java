package n74;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335451a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f335452b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.y f335453c;

    public z(java.lang.String mediaId, java.lang.ref.WeakReference weakReference, n74.y state) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(state, "state");
        this.f335451a = mediaId;
        this.f335452b = weakReference;
        this.f335453c = state;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return true;
        }
        if (!(obj instanceof n74.z)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        n74.z zVar = (n74.z) obj;
        if (!kotlin.jvm.internal.o.b(this.f335451a, zVar.f335451a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f335452b, zVar.f335452b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        n74.y yVar = this.f335453c;
        n74.y yVar2 = zVar.f335453c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return yVar == yVar2;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        int hashCode = this.f335451a.hashCode() * 31;
        java.lang.ref.WeakReference weakReference = this.f335452b;
        int hashCode2 = ((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f335453c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        java.lang.String str = "ThumbResult(mediaId=" + this.f335451a + ", bitmap=" + this.f335452b + ", state=" + this.f335453c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return str;
    }
}
