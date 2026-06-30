package com.tencent.mm.plugin.webview.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/model/WebViewEventReporter$Companion$IPCWebViewEventData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/model/w3", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class WebViewEventReporter$Companion$IPCWebViewEventData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.model.w3 CREATOR = new com.tencent.mm.plugin.webview.model.w3(null);

    /* renamed from: d, reason: collision with root package name */
    public int f182731d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f182732e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f182733f;

    public WebViewEventReporter$Companion$IPCWebViewEventData(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f182731d = parcel.readInt();
        this.f182732e = parcel.readString();
        this.f182733f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f182731d);
        java.lang.String str = this.f182732e;
        if (str == null) {
            str = "";
        }
        dest.writeString(str);
        java.lang.String str2 = this.f182733f;
        dest.writeString(str2 != null ? str2 : "");
    }
}
