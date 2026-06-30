package com.tencent.mm.plugin.scanner.api;

/* loaded from: classes.dex */
public class BaseScanRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.scanner.api.BaseScanRequest> CREATOR = new ry3.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f158662d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158663e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f158664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158665g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158666h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f158667i;

    public BaseScanRequest() {
        this.f158662d = false;
        this.f158663e = false;
        this.f158664f = false;
        this.f158665g = true;
        this.f158666h = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("BaseScanRequest{hideBottomTab: %b, hideScanTips: %b, hideFlashSwitcher: %b, hideGalleryButton: %b, hideOptionMenu: %b}", java.lang.Boolean.valueOf(this.f158662d), java.lang.Boolean.valueOf(this.f158663e), java.lang.Boolean.valueOf(this.f158664f), java.lang.Boolean.valueOf(this.f158665g), java.lang.Boolean.valueOf(this.f158666h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f158662d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158663e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158664f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158665g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158666h ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.f158667i);
    }

    public BaseScanRequest(android.os.Parcel parcel) {
        this.f158662d = false;
        this.f158663e = false;
        this.f158664f = false;
        this.f158665g = true;
        this.f158666h = true;
        this.f158662d = parcel.readByte() != 0;
        this.f158663e = parcel.readByte() != 0;
        this.f158664f = parcel.readByte() != 0;
        this.f158665g = parcel.readByte() != 0;
        this.f158666h = parcel.readByte() != 0;
        this.f158667i = parcel.readBundle();
    }
}
