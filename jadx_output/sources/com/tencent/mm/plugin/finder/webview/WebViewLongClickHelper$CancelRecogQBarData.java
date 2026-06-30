package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$CancelRecogQBarData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$CancelRecogQBarData> CREATOR = new com.tencent.mm.plugin.finder.webview.g1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f136808d;

    /* renamed from: e, reason: collision with root package name */
    public final long f136809e;

    public WebViewLongClickHelper$CancelRecogQBarData(java.lang.String str, long j17) {
        this.f136808d = str;
        this.f136809e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f136808d);
        parcel.writeLong(this.f136809e);
    }

    public WebViewLongClickHelper$CancelRecogQBarData(android.os.Parcel parcel) {
        this.f136808d = parcel.readString();
        this.f136809e = parcel.readLong();
    }
}
