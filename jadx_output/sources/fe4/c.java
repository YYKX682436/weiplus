package fe4;

/* loaded from: classes4.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem snsCameraEditorReportItem = (com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem) parcel.readParcelable(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.class.getClassLoader());
        if (snsCameraEditorReportItem == null) {
            snsCameraEditorReportItem = com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u;
        }
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem(readString, readInt, readInt2, readInt3, snsCameraEditorReportItem);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        return snsPublishImageItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem[] snsPublishImageItemArr = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem$CREATOR");
        return snsPublishImageItemArr;
    }
}
