package com.tencent.mm.plugin.sns.data;

/* loaded from: classes.dex */
public class SnsTagList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.data.SnsTagList> CREATOR = new ca4.v0();

    /* renamed from: d, reason: collision with root package name */
    public int f164023d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f164024e = new java.util.LinkedList();

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
        java.util.List list = this.f164024e;
        int size = ((java.util.LinkedList) list).size();
        this.f164023d = size;
        parcel.writeInt(size);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((java.lang.Long) it.next()).longValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
    }
}
