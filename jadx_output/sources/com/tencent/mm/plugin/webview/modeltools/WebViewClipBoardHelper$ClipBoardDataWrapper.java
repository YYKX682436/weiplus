package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
final class WebViewClipBoardHelper$ClipBoardDataWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper> CREATOR = new com.tencent.mm.plugin.webview.modeltools.d0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183235d;

    /* renamed from: e, reason: collision with root package name */
    public int f183236e;

    /* renamed from: f, reason: collision with root package name */
    public int f183237f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183238g;

    public WebViewClipBoardHelper$ClipBoardDataWrapper(android.os.Parcel parcel) {
        this.f183235d = parcel.readString();
        this.f183236e = parcel.readInt();
        this.f183237f = parcel.readInt();
        this.f183238g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f183235d);
        parcel.writeInt(this.f183236e);
        parcel.writeInt(this.f183237f);
        parcel.writeString(this.f183238g);
    }
}
