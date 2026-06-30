package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderView$OpenFinderViewTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/h8", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiOpenFinderView$OpenFinderViewTaskData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.h8 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h8(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185905d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185906e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185907f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f185908g;

    public JsApiOpenFinderView$OpenFinderViewTaskData(java.lang.String extInfo, java.lang.String curUrl, java.lang.String lastGMsgId, java.lang.String keepAliveToken) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(curUrl, "curUrl");
        kotlin.jvm.internal.o.g(lastGMsgId, "lastGMsgId");
        kotlin.jvm.internal.o.g(keepAliveToken, "keepAliveToken");
        this.f185905d = "";
        this.f185906e = "";
        this.f185907f = "";
        this.f185908g = "";
        this.f185905d = extInfo;
        this.f185906e = curUrl;
        this.f185907f = lastGMsgId;
        this.f185908g = keepAliveToken;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f185905d);
        parcel.writeString(this.f185906e);
        parcel.writeString(this.f185907f);
        parcel.writeString(this.f185908g);
    }

    public JsApiOpenFinderView$OpenFinderViewTaskData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        this.f185905d = "";
        this.f185906e = "";
        this.f185907f = "";
        this.f185908g = "";
        java.lang.String readString = src.readString();
        this.f185905d = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f185906e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = src.readString();
        this.f185907f = readString3 == null ? "" : readString3;
        java.lang.String readString4 = src.readString();
        this.f185908g = readString4 != null ? readString4 : "";
    }
}
