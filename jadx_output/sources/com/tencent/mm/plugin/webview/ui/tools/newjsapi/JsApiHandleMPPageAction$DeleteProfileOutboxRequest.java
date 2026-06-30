package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$DeleteProfileOutboxRequest", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final /* data */ class JsApiHandleMPPageAction$DeleteProfileOutboxRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185890d;

    /* renamed from: e, reason: collision with root package name */
    public final int f185891e;

    public JsApiHandleMPPageAction$DeleteProfileOutboxRequest(java.lang.String msgId, int i17) {
        kotlin.jvm.internal.o.g(msgId, "msgId");
        this.f185890d = msgId;
        this.f185891e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest jsApiHandleMPPageAction$DeleteProfileOutboxRequest = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest) obj;
        return kotlin.jvm.internal.o.b(this.f185890d, jsApiHandleMPPageAction$DeleteProfileOutboxRequest.f185890d) && this.f185891e == jsApiHandleMPPageAction$DeleteProfileOutboxRequest.f185891e;
    }

    public int hashCode() {
        return (this.f185890d.hashCode() * 31) + java.lang.Integer.hashCode(this.f185891e);
    }

    public java.lang.String toString() {
        return "DeleteProfileOutboxRequest(msgId=" + this.f185890d + ", bizType=" + this.f185891e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f185890d);
        out.writeInt(this.f185891e);
    }
}
