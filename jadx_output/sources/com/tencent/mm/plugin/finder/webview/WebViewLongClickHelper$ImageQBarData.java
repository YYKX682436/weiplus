package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$ImageQBarData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData> CREATOR = new com.tencent.mm.plugin.finder.webview.h1();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f136810d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f136811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f136812f;

    public WebViewLongClickHelper$ImageQBarData(java.util.ArrayList arrayList, java.lang.String str, java.lang.Boolean bool) {
        this.f136810d = arrayList;
        this.f136811e = str;
        this.f136812f = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f136810d);
        parcel.writeString(this.f136811e);
        parcel.writeByte(this.f136812f ? (byte) 1 : (byte) 0);
    }

    public WebViewLongClickHelper$ImageQBarData(android.os.Parcel parcel) {
        this.f136810d = parcel.createTypedArrayList(com.tencent.mm.plugin.scanner.ImageQBarDataBean.CREATOR);
        this.f136811e = parcel.readString();
        this.f136812f = parcel.readByte() != 0;
    }
}
