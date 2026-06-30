package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class MMLiteAppScheduleData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData> CREATOR = new com.tencent.mm.plugin.lite.logic.b3();

    /* renamed from: d, reason: collision with root package name */
    public int f143881d;

    /* renamed from: e, reason: collision with root package name */
    public int f143882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143884g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143885h;

    /* renamed from: i, reason: collision with root package name */
    public int f143886i;

    /* renamed from: m, reason: collision with root package name */
    public long f143887m;

    /* renamed from: n, reason: collision with root package name */
    public long f143888n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f143881d);
        parcel.writeInt(this.f143882e);
        parcel.writeString(this.f143883f);
        parcel.writeString(this.f143884g);
        parcel.writeByte(this.f143885h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f143886i);
        parcel.writeLong(this.f143887m);
        parcel.writeLong(this.f143888n);
    }
}
