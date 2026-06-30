package com.tencent.mm.plugin.sns.ui.widget.multi_image.data;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishImageItem;", "Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishBaseMultiPicItem;", "CREATOR", "fe4/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsPublishImageItem extends com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem {
    public static final fe4.c CREATOR = new fe4.c(null);

    /* renamed from: h, reason: collision with root package name */
    public final int f171210h;

    public /* synthetic */ SnsPublishImageItem(java.lang.String str, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem snsCameraEditorReportItem, int i27, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i27 & 4) != 0 ? 0 : i18, (i27 & 8) != 0 ? 0 : i19, (i27 & 16) != 0 ? new com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u) : snsCameraEditorReportItem);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(b());
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeInt(this.f171210h);
        parcel.writeParcelable(this.f171209g, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsPublishImageItem(java.lang.String str, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem reporter) {
        super(str, i17, i18, reporter);
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f171210h = i19;
    }

    public SnsPublishImageItem(java.lang.String str, int i17, int i18, int i19) {
        this(str, i17, i18, i19, new com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u));
    }
}
