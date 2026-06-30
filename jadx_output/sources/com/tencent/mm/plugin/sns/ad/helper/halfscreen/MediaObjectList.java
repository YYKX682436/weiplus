package com.tencent.mm.plugin.sns.ad.helper.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/halfscreen/MediaObjectList;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MediaObjectList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList> CREATOR = new n44.g1();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f162691d;

    public MediaObjectList(java.util.ArrayList dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f162691d = dataList;
    }

    public final java.util.ArrayList a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        return this.f162691d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        kotlin.jvm.internal.o.g(out, "out");
        java.util.ArrayList arrayList = this.f162691d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeByteArray((byte[]) it.next());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
    }
}
