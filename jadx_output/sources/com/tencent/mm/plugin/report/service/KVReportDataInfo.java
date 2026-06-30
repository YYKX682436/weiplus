package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
class KVReportDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.report.service.KVReportDataInfo> CREATOR = new com.tencent.mm.plugin.report.service.y();

    /* renamed from: d, reason: collision with root package name */
    public long f158131d;

    /* renamed from: e, reason: collision with root package name */
    public long f158132e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158134g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158135h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f158136i;

    public KVReportDataInfo() {
        this.f158132e = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f158131d);
        parcel.writeLong(this.f158132e);
        parcel.writeString(this.f158133f);
        parcel.writeInt(this.f158134g ? 1 : 0);
        parcel.writeInt(this.f158135h ? 1 : 0);
        parcel.writeInt(this.f158136i ? 1 : 0);
    }

    public KVReportDataInfo(android.os.Parcel parcel) {
        this.f158132e = 0L;
        this.f158131d = parcel.readLong();
        this.f158132e = parcel.readLong();
        this.f158133f = parcel.readString();
        this.f158134g = parcel.readInt() == 1;
        this.f158135h = parcel.readInt() == 1;
        this.f158136i = parcel.readInt() == 1;
    }
}
