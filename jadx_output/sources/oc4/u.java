package oc4;

/* loaded from: classes4.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem.CREATOR.createFromParcel(parcel));
        }
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList snsUnreadSaveList = new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList(arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        return snsUnreadSaveList;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList[] snsUnreadSaveListArr = new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
        return snsUnreadSaveListArr;
    }
}
