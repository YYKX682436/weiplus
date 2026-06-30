package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public abstract class BaseWepkgProcessTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {

    /* renamed from: f, reason: collision with root package name */
    public boolean f188333f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f188334g = false;

    public abstract void B(android.os.Parcel parcel);

    public abstract void C(android.os.Parcel parcel, int i17);

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public final void v(android.os.Parcel parcel) {
        this.f188333f = parcel.readByte() != 0;
        this.f188334g = parcel.readByte() != 0;
        B(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f188333f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f188334g ? (byte) 1 : (byte) 0);
        C(parcel, i17);
    }
}
