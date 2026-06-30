package t54;

/* loaded from: classes4.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo preloadInfo = new com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo(parcel.readString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        return preloadInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo[] preloadInfoArr = new com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
        return preloadInfoArr;
    }
}
