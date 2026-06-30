package v74;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f433886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f433888c;

    /* renamed from: d, reason: collision with root package name */
    public final int f433889d;

    public s(int i17, int i18, int i19, int i27) {
        this.f433886a = i17;
        this.f433887b = i18;
        this.f433888c = i19;
        this.f433889d = i27;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return this.f433888c;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplashCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplashCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return this.f433886a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return true;
        }
        if (!(obj instanceof v74.s)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        v74.s sVar = (v74.s) obj;
        if (this.f433886a != sVar.f433886a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        if (this.f433887b != sVar.f433887b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        if (this.f433888c != sVar.f433888c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        int i17 = this.f433889d;
        int i18 = sVar.f433889d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        int hashCode = (((((java.lang.Integer.hashCode(this.f433886a) * 31) + java.lang.Integer.hashCode(this.f433887b)) * 31) + java.lang.Integer.hashCode(this.f433888c)) * 31) + java.lang.Integer.hashCode(this.f433889d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        java.lang.String str = "ItemSize(splashCardWidth=" + this.f433886a + ", splashCardHeight=" + this.f433887b + ", itemCardWidth=" + this.f433888c + ", itemCardHeight=" + this.f433889d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return str;
    }
}
