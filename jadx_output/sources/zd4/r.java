package zd4;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f471645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f471646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f471647c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f471648d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f471649e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f471650f;

    public r(int i17, int i18, int i19, java.util.List childItems, java.lang.CharSequence customTitle, java.lang.String customSubTitle, int i27, kotlin.jvm.internal.i iVar) {
        customTitle = (i27 & 16) != 0 ? "" : customTitle;
        customSubTitle = (i27 & 32) != 0 ? "" : customSubTitle;
        kotlin.jvm.internal.o.g(childItems, "childItems");
        kotlin.jvm.internal.o.g(customTitle, "customTitle");
        kotlin.jvm.internal.o.g(customSubTitle, "customSubTitle");
        this.f471645a = i17;
        this.f471646b = i18;
        this.f471647c = i19;
        this.f471648d = childItems;
        this.f471649e = customTitle;
        this.f471650f = customSubTitle;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return true;
        }
        if (!(obj instanceof zd4.r)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        zd4.r rVar = (zd4.r) obj;
        if (this.f471645a != rVar.f471645a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (this.f471646b != rVar.f471646b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (this.f471647c != rVar.f471647c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f471648d, rVar.f471648d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f471649e, rVar.f471649e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f471650f, rVar.f471650f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        int hashCode = (((((((((java.lang.Integer.hashCode(this.f471645a) * 31) + java.lang.Integer.hashCode(this.f471646b)) * 31) + java.lang.Integer.hashCode(this.f471647c)) * 31) + this.f471648d.hashCode()) * 31) + this.f471649e.hashCode()) * 31) + this.f471650f.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        java.lang.String str = "SelectVisibleGroupHeaderConfigItem(visibleState=" + this.f471645a + ", titleResId=" + this.f471646b + ", subTitleResId=" + this.f471647c + ", childItems=" + this.f471648d + ", customTitle=" + ((java.lang.Object) this.f471649e) + ", customSubTitle=" + this.f471650f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return str;
    }
}
