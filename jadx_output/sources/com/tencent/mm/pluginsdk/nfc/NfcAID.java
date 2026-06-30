package com.tencent.mm.pluginsdk.nfc;

/* loaded from: classes5.dex */
public class NfcAID implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.nfc.NfcAID> CREATOR = new h35.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f189511d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189512e;

    public NfcAID(android.os.Parcel parcel) {
        this.f189511d = null;
        this.f189512e = null;
        this.f189511d = parcel.readString();
        this.f189512e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f189511d);
        parcel.writeString(this.f189512e);
    }
}
