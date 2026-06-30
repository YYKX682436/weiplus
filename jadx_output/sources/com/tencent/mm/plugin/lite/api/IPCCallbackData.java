package com.tencent.mm.plugin.lite.api;

/* loaded from: classes14.dex */
class IPCCallbackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.api.IPCCallbackData> CREATOR = new com.tencent.mm.plugin.lite.api.j();

    /* renamed from: d, reason: collision with root package name */
    public boolean f143406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f143407e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143408f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143409g;

    public IPCCallbackData() {
        this.f143406d = false;
        this.f143407e = false;
        this.f143408f = null;
        this.f143409g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f143406d ? 1 : 0);
        parcel.writeInt(this.f143407e ? 1 : 0);
        parcel.writeString(this.f143408f);
        parcel.writeString(this.f143409g);
    }

    public IPCCallbackData(android.os.Parcel parcel) {
        this.f143406d = false;
        this.f143407e = false;
        this.f143408f = null;
        this.f143409g = null;
        this.f143406d = parcel.readInt() == 1;
        this.f143407e = parcel.readInt() == 1;
        this.f143408f = parcel.readString();
        this.f143409g = parcel.readString();
    }
}
