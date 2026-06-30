package n44;

/* loaded from: classes4.dex */
public final class i1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize viewPositionAndSize = new com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        return viewPositionAndSize;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize[] viewPositionAndSizeArr = new com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize$Creator");
        return viewPositionAndSizeArr;
    }
}
