package n44;

/* loaded from: classes4.dex */
public final class g1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.createByteArray());
        }
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList mediaObjectList = new com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList(arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        return mediaObjectList;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList[] mediaObjectListArr = new com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList$Creator");
        return mediaObjectListArr;
    }
}
