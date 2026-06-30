package h94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f279731a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f279732b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f279733c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f279735e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f279736f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279737g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f279738h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f279739i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Boolean f279740j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f279741k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.d43 f279742l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f279743m;

    /* renamed from: n, reason: collision with root package name */
    public final int f279744n;

    public a(java.lang.String rl6, java.lang.String apurl, java.lang.String traceid, java.lang.String groupId, java.lang.String aid, java.lang.String crtSize, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, r45.d43 d43Var, java.lang.String str5, int i17) {
        kotlin.jvm.internal.o.g(rl6, "rl");
        kotlin.jvm.internal.o.g(apurl, "apurl");
        kotlin.jvm.internal.o.g(traceid, "traceid");
        kotlin.jvm.internal.o.g(groupId, "groupId");
        kotlin.jvm.internal.o.g(aid, "aid");
        kotlin.jvm.internal.o.g(crtSize, "crtSize");
        this.f279731a = rl6;
        this.f279732b = apurl;
        this.f279733c = traceid;
        this.f279734d = groupId;
        this.f279735e = aid;
        this.f279736f = crtSize;
        this.f279737g = str;
        this.f279738h = str2;
        this.f279739i = str3;
        this.f279740j = bool;
        this.f279741k = str4;
        this.f279742l = d43Var;
        this.f279743m = str5;
        this.f279744n = i17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return this.f279735e;
    }

    public final r45.d43 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldSnsInfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldSnsInfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return this.f279742l;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return this.f279743m;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return this.f279733c;
    }

    public final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return this.f279737g;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return true;
        }
        if (!(obj instanceof h94.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        h94.a aVar = (h94.a) obj;
        if (!kotlin.jvm.internal.o.b(this.f279731a, aVar.f279731a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279732b, aVar.f279732b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279733c, aVar.f279733c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279734d, aVar.f279734d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279735e, aVar.f279735e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279736f, aVar.f279736f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279737g, aVar.f279737g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279738h, aVar.f279738h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279739i, aVar.f279739i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279740j, aVar.f279740j)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279741k, aVar.f279741k)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279742l, aVar.f279742l)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279743m, aVar.f279743m)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            return false;
        }
        int i17 = this.f279744n;
        int i18 = aVar.f279744n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        int hashCode = ((((((((((this.f279731a.hashCode() * 31) + this.f279732b.hashCode()) * 31) + this.f279733c.hashCode()) * 31) + this.f279734d.hashCode()) * 31) + this.f279735e.hashCode()) * 31) + this.f279736f.hashCode()) * 31;
        java.lang.String str = this.f279737g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f279738h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f279739i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Boolean bool = this.f279740j;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str4 = this.f279741k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        r45.d43 d43Var = this.f279742l;
        int hashCode7 = (hashCode6 + (d43Var == null ? 0 : d43Var.hashCode())) * 31;
        java.lang.String str5 = this.f279743m;
        int hashCode8 = ((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f279744n);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return hashCode8;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        java.lang.String str = "FoldAdInfo(rl=" + this.f279731a + ", apurl=" + this.f279732b + ", traceid=" + this.f279733c + ", groupId=" + this.f279734d + ", aid=" + this.f279735e + ", crtSize=" + this.f279736f + ", uxinfo=" + this.f279737g + ", adPosid=" + this.f279738h + ", tid=" + this.f279739i + ", isPreviewAd=" + this.f279740j + ", reportExtraData=" + this.f279741k + ", foldSnsInfo=" + this.f279742l + ", snsAdId=" + this.f279743m + ", localId=" + this.f279744n + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        return str;
    }
}
