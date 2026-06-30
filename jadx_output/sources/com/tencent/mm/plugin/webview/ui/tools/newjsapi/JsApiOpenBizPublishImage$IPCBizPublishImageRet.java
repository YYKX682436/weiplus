package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenBizPublishImage$IPCBizPublishImageRet", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class JsApiOpenBizPublishImage$IPCBizPublishImageRet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.g6();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f185892d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185893e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.type.IPCString f185894f;

    public JsApiOpenBizPublishImage$IPCBizPublishImageRet(boolean z17, java.lang.String errMsg, com.tencent.mm.ipcinvoker.type.IPCString extraData) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        this.f185892d = z17;
        this.f185893e = errMsg;
        this.f185894f = extraData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet jsApiOpenBizPublishImage$IPCBizPublishImageRet = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet) obj;
        return this.f185892d == jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185892d && kotlin.jvm.internal.o.b(this.f185893e, jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185893e) && kotlin.jvm.internal.o.b(this.f185894f, jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185894f);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f185892d) * 31) + this.f185893e.hashCode()) * 31) + this.f185894f.hashCode();
    }

    public java.lang.String toString() {
        return "IPCBizPublishImageRet(isSuc=" + this.f185892d + ", errMsg=" + this.f185893e + ", extraData=" + this.f185894f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f185892d ? 1 : 0);
        out.writeString(this.f185893e);
        out.writeParcelable(this.f185894f, i17);
    }
}
