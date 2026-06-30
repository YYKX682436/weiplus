package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
class GroupIDKeyDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo> CREATOR = new com.tencent.mm.plugin.report.service.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f158121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158122e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158123f;

    public GroupIDKeyDataInfo(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        this.f158121d = new java.util.ArrayList();
        this.f158121d = arrayList;
        this.f158122e = z17;
        this.f158123f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f158121d);
        parcel.writeInt(this.f158122e ? 1 : 0);
        parcel.writeInt(this.f158123f ? 1 : 0);
    }

    public GroupIDKeyDataInfo(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f158121d = arrayList;
        parcel.readTypedList(arrayList, com.tencent.mars.smc.IDKey.CREATOR);
        this.f158122e = parcel.readInt() == 1;
        this.f158123f = parcel.readInt() == 1;
    }
}
