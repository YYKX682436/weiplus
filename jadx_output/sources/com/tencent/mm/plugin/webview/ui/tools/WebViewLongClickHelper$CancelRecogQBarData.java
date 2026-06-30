package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$CancelRecogQBarData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.v5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183781d;

    /* renamed from: e, reason: collision with root package name */
    public final long f183782e;

    public WebViewLongClickHelper$CancelRecogQBarData(java.lang.String str, long j17) {
        this.f183781d = str;
        this.f183782e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f183781d);
        parcel.writeLong(this.f183782e);
    }

    public WebViewLongClickHelper$CancelRecogQBarData(android.os.Parcel parcel) {
        this.f183781d = parcel.readString();
        this.f183782e = parcel.readLong();
    }
}
