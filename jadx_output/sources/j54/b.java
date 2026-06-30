package j54;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f297816a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f297817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f297818c;

    /* renamed from: d, reason: collision with root package name */
    public final int f297819d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f297820e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f297821f;

    public b(java.lang.String imageUrl, boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(imageUrl, "imageUrl");
        this.f297816a = imageUrl;
        this.f297817b = z17;
        this.f297818c = i17;
        this.f297819d = i18;
        this.f297820e = str;
        this.f297821f = str2;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return true;
        }
        if (!(obj instanceof j54.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        j54.b bVar = (j54.b) obj;
        if (!kotlin.jvm.internal.o.b(this.f297816a, bVar.f297816a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        if (this.f297817b != bVar.f297817b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        if (this.f297818c != bVar.f297818c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        if (this.f297819d != bVar.f297819d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f297820e, bVar.f297820e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f297821f, bVar.f297821f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        int hashCode = ((((((this.f297816a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f297817b)) * 31) + java.lang.Integer.hashCode(this.f297818c)) * 31) + java.lang.Integer.hashCode(this.f297819d)) * 31;
        java.lang.String str = this.f297820e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f297821f;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        return hashCode3;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        java.lang.String str = "PanoramaData(imageUrl=" + this.f297816a + ", showLoading=" + this.f297817b + ", viewPortWidth=" + this.f297818c + ", viewPortHeight=" + this.f297819d + ", canvasKey=" + this.f297820e + ", componentId=" + this.f297821f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
        return str;
    }
}
