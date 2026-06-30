package com.tencent.mm.recoveryv2;

/* loaded from: classes12.dex */
public class RecoveryCrash$Record implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.recoveryv2.RecoveryCrash$Record> CREATOR = new d55.i();

    /* renamed from: d, reason: collision with root package name */
    public int f192206d;

    /* renamed from: e, reason: collision with root package name */
    public long f192207e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f192208f;

    public RecoveryCrash$Record(android.os.Parcel parcel) {
        this.f192206d = parcel.readInt();
        this.f192207e = parcel.readLong();
        this.f192208f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f192206d);
        parcel.writeLong(this.f192207e);
        parcel.writeString(this.f192208f);
    }
}
