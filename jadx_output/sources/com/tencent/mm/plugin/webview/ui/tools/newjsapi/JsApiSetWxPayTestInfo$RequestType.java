package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiSetWxPayTestInfo$RequestType", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiSetWxPayTestInfo$RequestType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.lc();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185920d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185921e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185922f;

    public JsApiSetWxPayTestInfo$RequestType(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f185920d = str;
        this.f185921e = str2;
        this.f185922f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType jsApiSetWxPayTestInfo$RequestType = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType) obj;
        return kotlin.jvm.internal.o.b(this.f185920d, jsApiSetWxPayTestInfo$RequestType.f185920d) && kotlin.jvm.internal.o.b(this.f185921e, jsApiSetWxPayTestInfo$RequestType.f185921e) && kotlin.jvm.internal.o.b(this.f185922f, jsApiSetWxPayTestInfo$RequestType.f185922f);
    }

    public int hashCode() {
        java.lang.String str = this.f185920d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f185921e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f185922f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RequestType(ipLong=" + this.f185920d + ", ipShort=" + this.f185921e + ", ipPay=" + this.f185922f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f185920d);
        out.writeString(this.f185921e);
        out.writeString(this.f185922f);
    }
}
