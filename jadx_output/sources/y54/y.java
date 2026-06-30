package y54;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f459570a;

    /* renamed from: b, reason: collision with root package name */
    public int f459571b;

    /* renamed from: c, reason: collision with root package name */
    public int f459572c;

    /* renamed from: d, reason: collision with root package name */
    public int f459573d;

    /* renamed from: e, reason: collision with root package name */
    public int f459574e;

    /* renamed from: f, reason: collision with root package name */
    public int f459575f;

    public y(int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        i17 = (i37 & 1) != 0 ? 0 : i17;
        i18 = (i37 & 2) != 0 ? 0 : i18;
        i19 = (i37 & 4) != 0 ? 0 : i19;
        i27 = (i37 & 8) != 0 ? 0 : i27;
        i28 = (i37 & 16) != 0 ? 0 : i28;
        i29 = (i37 & 32) != 0 ? 0 : i29;
        this.f459570a = i17;
        this.f459571b = i18;
        this.f459572c = i19;
        this.f459573d = i27;
        this.f459574e = i28;
        this.f459575f = i29;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        if (this.f459575f == 1) {
            int i17 = (this.f459571b - this.f459574e) - this.f459573d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return i17;
        }
        int i18 = ((this.f459571b - this.f459572c) - this.f459574e) - this.f459573d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        return i18;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return true;
        }
        if (!(obj instanceof y54.y)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        y54.y yVar = (y54.y) obj;
        if (this.f459570a != yVar.f459570a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459571b != yVar.f459571b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459572c != yVar.f459572c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459573d != yVar.f459573d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459574e != yVar.f459574e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            return false;
        }
        int i17 = this.f459575f;
        int i18 = yVar.f459575f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        int hashCode = (((((((((java.lang.Integer.hashCode(this.f459570a) * 31) + java.lang.Integer.hashCode(this.f459571b)) * 31) + java.lang.Integer.hashCode(this.f459572c)) * 31) + java.lang.Integer.hashCode(this.f459573d)) * 31) + java.lang.Integer.hashCode(this.f459574e)) * 31) + java.lang.Integer.hashCode(this.f459575f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        java.lang.String str = "ContentSizeAttr(screenWidth=" + this.f459570a + ", screenHeight=" + this.f459571b + ", statusBarHeight=" + this.f459572c + ", navigationBarHeight=" + this.f459573d + ", visibleContentHeight=" + this.f459574e + ", presentationStyle=" + this.f459575f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        return str;
    }
}
