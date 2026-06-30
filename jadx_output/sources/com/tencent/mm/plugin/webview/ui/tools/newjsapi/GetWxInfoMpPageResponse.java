package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/GetWxInfoMpPageResponse;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class GetWxInfoMpPageResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f185876d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f185877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185878f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f185879g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f185880h;

    public GetWxInfoMpPageResponse(boolean z17, java.lang.String nickName, java.lang.String headImgUrl, java.lang.String userName, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(headImgUrl, "headImgUrl");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f185876d = z17;
        this.f185877e = nickName;
        this.f185878f = headImgUrl;
        this.f185879g = userName;
        this.f185880h = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse getWxInfoMpPageResponse = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse) obj;
        return this.f185876d == getWxInfoMpPageResponse.f185876d && kotlin.jvm.internal.o.b(this.f185877e, getWxInfoMpPageResponse.f185877e) && kotlin.jvm.internal.o.b(this.f185878f, getWxInfoMpPageResponse.f185878f) && kotlin.jvm.internal.o.b(this.f185879g, getWxInfoMpPageResponse.f185879g) && kotlin.jvm.internal.o.b(this.f185880h, getWxInfoMpPageResponse.f185880h);
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f185876d) * 31) + this.f185877e.hashCode()) * 31) + this.f185878f.hashCode()) * 31) + this.f185879g.hashCode()) * 31) + this.f185880h.hashCode();
    }

    public java.lang.String toString() {
        return "GetWxInfoMpPageResponse(success=" + this.f185876d + ", nickName=" + this.f185877e + ", headImgUrl=" + this.f185878f + ", userName=" + this.f185879g + ", errorMsg=" + this.f185880h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f185876d ? 1 : 0);
        out.writeString(this.f185877e);
        out.writeString(this.f185878f);
        out.writeString(this.f185879g);
        out.writeString(this.f185880h);
    }

    public /* synthetic */ GetWxInfoMpPageResponse(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4);
    }
}
