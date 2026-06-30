package com.tencent.soter.soterserver;

/* loaded from: classes13.dex */
public class SoterSignResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.soter.soterserver.SoterSignResult> CREATOR = new bu5.h();

    /* renamed from: d, reason: collision with root package name */
    public final int f215331d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f215332e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215333f;

    public SoterSignResult(android.os.Parcel parcel) {
        this.f215331d = parcel.readInt();
        this.f215332e = parcel.createByteArray();
        this.f215333f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f215331d);
        parcel.writeByteArray(this.f215332e);
        parcel.writeInt(this.f215333f);
    }
}
