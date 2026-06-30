package com.tencent.mm.plugin.sns.ui.widget.multi_image.data;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishLivePhotoItem;", "Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishBaseMultiPicItem;", "CREATOR", "fe4/e", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsPublishLivePhotoItem extends com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem {
    public static final fe4.e CREATOR = new fe4.e(null);

    /* renamed from: h, reason: collision with root package name */
    public final long f171211h;

    /* renamed from: i, reason: collision with root package name */
    public long f171212i;

    /* renamed from: m, reason: collision with root package name */
    public long f171213m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f171214n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f171215o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f171216p;

    /* renamed from: q, reason: collision with root package name */
    public int f171217q;

    /* renamed from: r, reason: collision with root package name */
    public final int f171218r;

    /* renamed from: s, reason: collision with root package name */
    public int f171219s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f171220t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f171221u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsPublishLivePhotoItem(java.lang.String str, int i17, int i18, long j17, long j18, long j19, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i19, int i27, int i28, java.lang.String str5, java.lang.String str6, com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem reporter) {
        super(str, i17, i18, reporter);
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f171211h = j17;
        this.f171212i = j18;
        this.f171213m = j19;
        this.f171214n = str2;
        this.f171215o = str3;
        this.f171216p = str4;
        this.f171217q = i19;
        this.f171218r = i27;
        this.f171219s = i28;
        this.f171220t = str5;
        this.f171221u = str6;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return 6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return 0;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLivePhoto", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        boolean z17 = this.f171219s == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLivePhoto", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return z17;
    }

    public final long f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        long j17 = this.f171213m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return j17;
    }

    public final long g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return this.f171211h;
    }

    public final java.lang.String h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaUniqueKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return this.f171221u;
    }

    public final java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        java.lang.String str = this.f171214n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return str;
    }

    public final boolean m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isParseFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        boolean z17 = this.f171217q == 1 && com.tencent.mm.vfs.w6.j(this.f171214n);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isParseFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        return z17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(b());
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeLong(this.f171211h);
        parcel.writeLong(this.f171212i);
        parcel.writeLong(this.f171213m);
        parcel.writeString(this.f171214n);
        parcel.writeString(this.f171215o);
        parcel.writeString(this.f171216p);
        parcel.writeInt(this.f171217q);
        parcel.writeInt(this.f171218r);
        parcel.writeInt(this.f171219s);
        parcel.writeString(this.f171220t);
        parcel.writeString(this.f171221u);
        parcel.writeParcelable(this.f171209g, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
    }
}
