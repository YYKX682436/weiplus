package com.tencent.soter.soterserver;

/* loaded from: classes13.dex */
public class SoterExportResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.soter.soterserver.SoterExportResult> CREATOR = new bu5.e();

    /* renamed from: d, reason: collision with root package name */
    public final int f215325d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f215326e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215327f;

    public SoterExportResult(android.os.Parcel parcel) {
        this.f215325d = parcel.readInt();
        this.f215326e = parcel.createByteArray();
        this.f215327f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f215325d);
        parcel.writeByteArray(this.f215326e);
        parcel.writeInt(this.f215327f);
    }
}
