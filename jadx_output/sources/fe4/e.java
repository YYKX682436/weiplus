package fe4;

/* loaded from: classes4.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        java.lang.String readString5 = parcel.readString();
        java.lang.String readString6 = parcel.readString();
        com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem snsCameraEditorReportItem = (com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem) parcel.readParcelable(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.class.getClassLoader());
        if (snsCameraEditorReportItem == null) {
            snsCameraEditorReportItem = com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u;
        }
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem(readString, readInt, readInt2, readLong, readLong2, readLong3, readString2, readString3, readString4, readInt3, readInt4, readInt5, readString5, readString6, snsCameraEditorReportItem);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        return snsPublishLivePhotoItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem[] snsPublishLivePhotoItemArr = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem$CREATOR");
        return snsPublishLivePhotoItemArr;
    }
}
