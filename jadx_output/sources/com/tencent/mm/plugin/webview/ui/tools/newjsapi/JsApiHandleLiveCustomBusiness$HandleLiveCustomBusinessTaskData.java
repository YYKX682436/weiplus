package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/o3", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.o3 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o3(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185888d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185889e;

    public JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData(java.lang.String str, java.lang.String str2) {
        this.f185888d = "";
        this.f185889e = "";
        this.f185888d = str == null ? "" : str;
        this.f185889e = str2 == null ? "" : str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f185888d);
        parcel.writeString(this.f185889e);
    }

    public JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        this.f185888d = "";
        this.f185889e = "";
        java.lang.String readString = src.readString();
        this.f185888d = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f185889e = readString2 != null ? readString2 : "";
    }
}
