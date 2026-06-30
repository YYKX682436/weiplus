package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetNewLifeContact$NewLifeGetNewLifeContactData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/g2", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiGetNewLifeContact$NewLifeGetNewLifeContactData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.g2 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.g2(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185884d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185885e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185886f;

    public JsApiGetNewLifeContact$NewLifeGetNewLifeContactData(java.lang.String jsonStr, java.lang.String extInfo, java.lang.String curUrl) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(curUrl, "curUrl");
        this.f185884d = "";
        this.f185885e = "";
        this.f185886f = "";
        this.f185884d = jsonStr;
        this.f185885e = extInfo;
        this.f185886f = curUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f185884d);
        parcel.writeString(this.f185885e);
        parcel.writeString(this.f185886f);
    }

    public JsApiGetNewLifeContact$NewLifeGetNewLifeContactData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        this.f185884d = "";
        this.f185885e = "";
        this.f185886f = "";
        java.lang.String readString = src.readString();
        this.f185884d = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f185885e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = src.readString();
        this.f185886f = readString3 != null ? readString3 : "";
    }
}
