package com.tencent.soter.soterserver;

/* loaded from: classes5.dex */
public class SoterDeviceResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.soter.soterserver.SoterDeviceResult> CREATOR = new bu5.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f215322d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f215323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215324f;

    public SoterDeviceResult(android.os.Parcel parcel) {
        this.f215322d = parcel.readInt();
        this.f215323e = parcel.createByteArray();
        this.f215324f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f215322d);
        parcel.writeByteArray(this.f215323e);
        parcel.writeInt(this.f215324f);
    }
}
