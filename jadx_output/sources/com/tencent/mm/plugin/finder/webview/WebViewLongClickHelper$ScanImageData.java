package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$ScanImageData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ScanImageData> CREATOR = new com.tencent.mm.plugin.finder.webview.m1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f136816d;

    /* renamed from: e, reason: collision with root package name */
    public final long f136817e;

    /* renamed from: f, reason: collision with root package name */
    public final float f136818f;

    /* renamed from: g, reason: collision with root package name */
    public final float f136819g;

    /* renamed from: h, reason: collision with root package name */
    public final int f136820h;

    /* renamed from: i, reason: collision with root package name */
    public final int f136821i;

    public WebViewLongClickHelper$ScanImageData(java.lang.String str, long j17, float f17, float f18, int i17, int i18) {
        this.f136816d = str;
        this.f136817e = j17;
        this.f136818f = f17;
        this.f136819g = f18;
        this.f136820h = i17;
        this.f136821i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f136816d);
        parcel.writeLong(this.f136817e);
        parcel.writeFloat(this.f136818f);
        parcel.writeFloat(this.f136819g);
        parcel.writeInt(this.f136820h);
        parcel.writeInt(this.f136821i);
    }

    public WebViewLongClickHelper$ScanImageData(android.os.Parcel parcel) {
        this.f136816d = parcel.readString();
        this.f136817e = parcel.readLong();
        this.f136818f = parcel.readFloat();
        this.f136819g = parcel.readFloat();
        this.f136820h = parcel.readInt();
        this.f136821i = parcel.readInt();
    }
}
