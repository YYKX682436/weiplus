package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$ScanImageData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.b6();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183789d;

    /* renamed from: e, reason: collision with root package name */
    public final long f183790e;

    /* renamed from: f, reason: collision with root package name */
    public final float f183791f;

    /* renamed from: g, reason: collision with root package name */
    public final float f183792g;

    /* renamed from: h, reason: collision with root package name */
    public final int f183793h;

    /* renamed from: i, reason: collision with root package name */
    public final int f183794i;

    public WebViewLongClickHelper$ScanImageData(java.lang.String str, long j17, float f17, float f18, int i17, int i18) {
        this.f183789d = str;
        this.f183790e = j17;
        this.f183791f = f17;
        this.f183792g = f18;
        this.f183793h = i17;
        this.f183794i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f183789d);
        parcel.writeLong(this.f183790e);
        parcel.writeFloat(this.f183791f);
        parcel.writeFloat(this.f183792g);
        parcel.writeInt(this.f183793h);
        parcel.writeInt(this.f183794i);
    }

    public WebViewLongClickHelper$ScanImageData(android.os.Parcel parcel) {
        this.f183789d = parcel.readString();
        this.f183790e = parcel.readLong();
        this.f183791f = parcel.readFloat();
        this.f183792g = parcel.readFloat();
        this.f183793h = parcel.readInt();
        this.f183794i = parcel.readInt();
    }
}
