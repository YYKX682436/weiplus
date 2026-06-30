package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeSessionIdData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GetGamelifeSessionIdData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186152d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186154f;

    public GetGamelifeSessionIdData(java.lang.String sessionId, java.lang.String errmsg, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        this.f186152d = sessionId;
        this.f186153e = errmsg;
        this.f186154f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186152d);
        out.writeString(this.f186153e);
        out.writeInt(this.f186154f ? 1 : 0);
    }
}
