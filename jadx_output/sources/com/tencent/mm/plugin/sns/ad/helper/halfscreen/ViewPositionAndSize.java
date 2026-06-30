package com.tencent.mm.plugin.sns.ad.helper.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/halfscreen/ViewPositionAndSize;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ViewPositionAndSize implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize> CREATOR = new n44.i1();

    /* renamed from: d, reason: collision with root package name */
    public final int f162692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f162694f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162695g;

    public ViewPositionAndSize(int i17, int i18, int i19, int i27) {
        this.f162692d = i17;
        this.f162693e = i18;
        this.f162694f = i19;
        this.f162695g = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f162692d);
        out.writeInt(this.f162693e);
        out.writeInt(this.f162694f);
        out.writeInt(this.f162695g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
    }
}
