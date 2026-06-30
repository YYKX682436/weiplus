package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
class StIDKeyDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.report.service.StIDKeyDataInfo> CREATOR = new com.tencent.mm.plugin.report.service.r0();

    /* renamed from: d, reason: collision with root package name */
    public long f158142d;

    /* renamed from: e, reason: collision with root package name */
    public long f158143e;

    /* renamed from: f, reason: collision with root package name */
    public long f158144f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158145g;

    public StIDKeyDataInfo(android.os.Parcel parcel) {
        this.f158142d = parcel.readLong();
        this.f158143e = parcel.readLong();
        this.f158144f = parcel.readLong();
        this.f158145g = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f158142d);
        parcel.writeLong(this.f158143e);
        parcel.writeLong(this.f158144f);
        parcel.writeInt(this.f158145g ? 1 : 0);
    }
}
