package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
class WebViewLongClickHelper$ImageQBarData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.w5();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f183783d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183784e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f183785f;

    public WebViewLongClickHelper$ImageQBarData(java.util.ArrayList arrayList, java.lang.String str, java.lang.Boolean bool) {
        this.f183783d = arrayList;
        this.f183784e = str;
        this.f183785f = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f183783d);
        parcel.writeString(this.f183784e);
        parcel.writeByte(this.f183785f ? (byte) 1 : (byte) 0);
    }

    public WebViewLongClickHelper$ImageQBarData(android.os.Parcel parcel) {
        this.f183783d = parcel.createTypedArrayList(com.tencent.mm.plugin.scanner.ImageQBarDataBean.CREATOR);
        this.f183784e = parcel.readString();
        this.f183785f = parcel.readByte() != 0;
    }
}
