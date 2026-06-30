package com.tencent.soter.soterserver;

/* loaded from: classes15.dex */
public class SoterSessionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.soter.soterserver.SoterSessionResult> CREATOR = new bu5.g();

    /* renamed from: d, reason: collision with root package name */
    public final long f215329d;

    /* renamed from: e, reason: collision with root package name */
    public final int f215330e;

    public SoterSessionResult(android.os.Parcel parcel) {
        this.f215329d = parcel.readLong();
        this.f215330e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f215329d);
        parcel.writeInt(this.f215330e);
    }
}
