package com.tencent.mm.plugin.normsg.api;

/* loaded from: classes13.dex */
public class CameraAvailable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.normsg.api.CameraAvailable> CREATOR = new fo3.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152405d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f152406e;

    /* renamed from: f, reason: collision with root package name */
    public final long f152407f;

    public CameraAvailable(java.lang.String str, long j17, boolean z17) {
        this.f152405d = str;
        this.f152406e = z17;
        this.f152407f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f152405d);
        parcel.writeByte(this.f152406e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f152407f);
    }

    public CameraAvailable(android.os.Parcel parcel) {
        this.f152405d = parcel.readString();
        this.f152406e = parcel.readByte() != 0;
        this.f152407f = parcel.readLong();
    }
}
