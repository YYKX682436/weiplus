package fe4;

/* loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems.class.getClassLoader()));
        }
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems snsDraftMultiPicItems = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems(arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        return snsDraftMultiPicItems;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems[] snsDraftMultiPicItemsArr = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        return snsDraftMultiPicItemsArr;
    }
}
