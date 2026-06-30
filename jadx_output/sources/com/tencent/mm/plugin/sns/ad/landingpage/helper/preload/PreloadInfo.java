package com.tencent.mm.plugin.sns.ad.landingpage.helper.preload;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/helper/preload/PreloadInfo;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PreloadInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo> CREATOR = new t54.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163156d;

    public PreloadInfo(java.lang.String str) {
        this.f163156d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f163156d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
    }
}
