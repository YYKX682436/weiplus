package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/BizPoiResponse;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BizPoiResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b();

    /* renamed from: d, reason: collision with root package name */
    public final double f185872d;

    /* renamed from: e, reason: collision with root package name */
    public final double f185873e;

    /* renamed from: f, reason: collision with root package name */
    public final long f185874f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f185875g;

    public BizPoiResponse(double d17, double d18, long j17, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f185872d = d17;
        this.f185873e = d18;
        this.f185874f = j17;
        this.f185875g = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse bizPoiResponse = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse) obj;
        return java.lang.Double.compare(this.f185872d, bizPoiResponse.f185872d) == 0 && java.lang.Double.compare(this.f185873e, bizPoiResponse.f185873e) == 0 && this.f185874f == bizPoiResponse.f185874f && kotlin.jvm.internal.o.b(this.f185875g, bizPoiResponse.f185875g);
    }

    public int hashCode() {
        return (((((java.lang.Double.hashCode(this.f185872d) * 31) + java.lang.Double.hashCode(this.f185873e)) * 31) + java.lang.Long.hashCode(this.f185874f)) * 31) + this.f185875g.hashCode();
    }

    public java.lang.String toString() {
        return "BizPoiResponse(latitude=" + this.f185872d + ", longitude=" + this.f185873e + ", timestamp=" + this.f185874f + ", errorMsg=" + this.f185875g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeDouble(this.f185872d);
        out.writeDouble(this.f185873e);
        out.writeLong(this.f185874f);
        out.writeString(this.f185875g);
    }
}
