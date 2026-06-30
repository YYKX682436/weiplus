package com.tencent.mm.plugin.sns.ad.adxml;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/adxml/AdJumpKefuConfirmInfo;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdJumpKefuConfirmInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo> CREATOR = new s34.o0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162621d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162622e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f162623f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162624g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162625h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162626i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f162627m;

    public AdJumpKefuConfirmInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f162621d = str;
        this.f162622e = str2;
        this.f162623f = str3;
        this.f162624g = str4;
        this.f162625h = str5;
        this.f162626i = str6;
        this.f162627m = str7;
    }

    public static final com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo e(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Companion");
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".desc"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".confirmButtonTitle"));
            if (str6 == null) {
                str6 = "";
            }
            adJumpKefuConfirmInfo = new com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo(str3, str5, str6, "", "", "", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return adJumpKefuConfirmInfo;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        java.lang.String str = this.f162624g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        java.lang.String str = this.f162626i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return str;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        java.lang.String str = this.f162627m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return str;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdJumpKefuConfirmInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isAdJumpKefuConfirmInfoValid, title is ");
        java.lang.String str = this.f162621d;
        sb6.append(str);
        sb6.append(", desc is ");
        java.lang.String str2 = this.f162622e;
        sb6.append(str2);
        sb6.append(", confirmButtonTitle is ");
        java.lang.String str3 = this.f162623f;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("AdJumpKefuConfirmInfo", sb6.toString());
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdJumpKefuConfirmInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f162621d);
        out.writeString(this.f162622e);
        out.writeString(this.f162623f);
        out.writeString(this.f162624g);
        out.writeString(this.f162625h);
        out.writeString(this.f162626i);
        out.writeString(this.f162627m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
    }
}
