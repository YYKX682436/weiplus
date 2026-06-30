package ee4;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f251714a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f251715b;

    public h1(boolean z17, boolean z18) {
        this.f251714a = z17;
        this.f251715b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return true;
        }
        if (!(obj instanceof ee4.h1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return false;
        }
        ee4.h1 h1Var = (ee4.h1) obj;
        if (this.f251714a != h1Var.f251714a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
            return false;
        }
        boolean z17 = this.f251715b;
        boolean z18 = h1Var.f251715b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        int hashCode = (java.lang.Boolean.hashCode(this.f251714a) * 31) + java.lang.Boolean.hashCode(this.f251715b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        java.lang.String str = "SnsLivePhotoCheckWorkJobResult(isNeedToCancelPublish=" + this.f251714a + ", isBlockPublishToShowLoading=" + this.f251715b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.SnsLivePhotoCheckWorkJobResult");
        return str;
    }
}
