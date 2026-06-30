package s34;

/* loaded from: classes4.dex */
public final class o0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo = new com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        return adJumpKefuConfirmInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo[] adJumpKefuConfirmInfoArr = new com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo$Creator");
        return adJumpKefuConfirmInfoArr;
    }
}
