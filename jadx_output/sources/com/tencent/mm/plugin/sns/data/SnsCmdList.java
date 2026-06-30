package com.tencent.mm.plugin.sns.data;

/* loaded from: classes4.dex */
public class SnsCmdList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.data.SnsCmdList> CREATOR = new ca4.p0();

    /* renamed from: d, reason: collision with root package name */
    public int f164019d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f164020e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f164021f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f164022g = new java.util.LinkedList();

    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        ((java.util.LinkedList) this.f164021f).add(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }

    public java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f164022g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return list;
    }

    public java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f164021f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f164021f;
        int size = ((java.util.LinkedList) list).size();
        this.f164019d = size;
        parcel.writeInt(size);
        for (int i18 = 0; i18 < this.f164019d; i18++) {
            parcel.writeInt(((java.lang.Integer) ((java.util.LinkedList) list).get(i18)).intValue());
        }
        java.util.List list2 = this.f164022g;
        int size2 = ((java.util.LinkedList) list2).size();
        this.f164020e = size2;
        parcel.writeInt(size2);
        for (int i19 = 0; i19 < this.f164020e; i19++) {
            parcel.writeInt(((java.lang.Integer) ((java.util.LinkedList) list2).get(i19)).intValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }
}
