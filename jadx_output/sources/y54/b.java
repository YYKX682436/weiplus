package y54;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f459520a;

    /* renamed from: b, reason: collision with root package name */
    public int f459521b;

    /* renamed from: c, reason: collision with root package name */
    public int f459522c;

    /* renamed from: d, reason: collision with root package name */
    public int f459523d;

    /* renamed from: e, reason: collision with root package name */
    public int f459524e;

    /* renamed from: f, reason: collision with root package name */
    public int f459525f;

    /* renamed from: g, reason: collision with root package name */
    public int f459526g;

    /* renamed from: h, reason: collision with root package name */
    public final int f459527h;

    public b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, kotlin.jvm.internal.i iVar) {
        i17 = (i39 & 1) != 0 ? 0 : i17;
        i18 = (i39 & 2) != 0 ? 0 : i18;
        i19 = (i39 & 4) != 0 ? 0 : i19;
        i27 = (i39 & 8) != 0 ? 0 : i27;
        i28 = (i39 & 16) != 0 ? 0 : i28;
        i29 = (i39 & 32) != 0 ? 0 : i29;
        i37 = (i39 & 64) != 0 ? 0 : i37;
        i38 = (i39 & 128) != 0 ? i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12) : i38;
        this.f459520a = i17;
        this.f459521b = i18;
        this.f459522c = i19;
        this.f459523d = i27;
        this.f459524e = i28;
        this.f459525f = i29;
        this.f459526g = i37;
        this.f459527h = i38;
    }

    public final int a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = !z17 ? this.f459526g : this.f459521b - this.f459524e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenHeaderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return this.f459527h;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = this.f459526g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public final int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = this.f459521b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public final int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = this.f459520a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return true;
        }
        if (!(obj instanceof y54.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        y54.b bVar = (y54.b) obj;
        if (this.f459520a != bVar.f459520a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459521b != bVar.f459521b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459522c != bVar.f459522c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459523d != bVar.f459523d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459524e != bVar.f459524e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459525f != bVar.f459525f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        if (this.f459526g != bVar.f459526g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            return false;
        }
        int i17 = this.f459527h;
        int i18 = bVar.f459527h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17 == i18;
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = (this.f459525f - this.f459527h) - this.f459524e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpaceHolderHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public final int g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = this.f459525f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return i17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int hashCode = (((((((((((((java.lang.Integer.hashCode(this.f459520a) * 31) + java.lang.Integer.hashCode(this.f459521b)) * 31) + java.lang.Integer.hashCode(this.f459522c)) * 31) + java.lang.Integer.hashCode(this.f459523d)) * 31) + java.lang.Integer.hashCode(this.f459524e)) * 31) + java.lang.Integer.hashCode(this.f459525f)) * 31) + java.lang.Integer.hashCode(this.f459526g)) * 31) + java.lang.Integer.hashCode(this.f459527h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        java.lang.String str = "ContentSizeAttr(screenWidth=" + this.f459520a + ", screenHeight=" + this.f459521b + ", statusBarHeight=" + this.f459522c + ", actionBarHeight=" + this.f459523d + ", statusBarAndActionBarHeight=" + this.f459524e + ", topContainerHeight=" + this.f459525f + ", initVisibleHalfScreenHeight=" + this.f459526g + ", halfScreenHeaderHeight=" + this.f459527h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        return str;
    }
}
