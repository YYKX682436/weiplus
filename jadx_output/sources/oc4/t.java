package oc4;

/* loaded from: classes4.dex */
public final class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem snsUnreadSaveItem = new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        return snsUnreadSaveItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem[] snsUnreadSaveItemArr = new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
        return snsUnreadSaveItemArr;
    }
}
