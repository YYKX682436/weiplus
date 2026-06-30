package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
class NFCIPCHelper$NFCEventTransfer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer> CREATOR = new com.tencent.mm.plugin.webview.modeltools.u();

    /* renamed from: d, reason: collision with root package name */
    public final int f183230d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183231e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f183232f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f183233g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f183234h;

    public NFCIPCHelper$NFCEventTransfer(com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent) {
        am.o oVar = apduEngineFuncEvent.f53975g;
        this.f183230d = oVar.f7493a;
        this.f183231e = oVar.f7495c;
        this.f183232f = oVar.f7496d;
        this.f183233g = oVar.f7497e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f183230d);
        parcel.writeString(this.f183231e);
        parcel.writeByte(this.f183232f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f183233g ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.f183234h);
    }

    public NFCIPCHelper$NFCEventTransfer(android.os.Parcel parcel) {
        this.f183230d = parcel.readInt();
        this.f183231e = parcel.readString();
        this.f183232f = parcel.readByte() != 0;
        this.f183233g = parcel.readByte() != 0;
        this.f183234h = parcel.readBundle(getClass().getClassLoader());
    }
}
