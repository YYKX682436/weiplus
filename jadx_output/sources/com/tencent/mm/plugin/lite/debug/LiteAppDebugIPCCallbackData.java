package com.tencent.mm.plugin.lite.debug;

/* loaded from: classes8.dex */
class LiteAppDebugIPCCallbackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData> CREATOR = new com.tencent.mm.plugin.lite.debug.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143457d;

    public LiteAppDebugIPCCallbackData() {
        this.f143457d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f143457d);
    }

    public LiteAppDebugIPCCallbackData(android.os.Parcel parcel) {
        this.f143457d = null;
        this.f143457d = parcel.readString();
    }
}
