package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetWCCoinBalance$GetWeCoinTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/o2", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiGetWCCoinBalance$GetWeCoinTaskData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.o2 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o2(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185887d;

    public JsApiGetWCCoinBalance$GetWeCoinTaskData(java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f185887d = "";
        this.f185887d = extInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f185887d);
    }

    public JsApiGetWCCoinBalance$GetWeCoinTaskData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        this.f185887d = "";
        java.lang.String readString = src.readString();
        this.f185887d = readString != null ? readString : "";
    }
}
