package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GetMsgParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186158d;

    /* renamed from: e, reason: collision with root package name */
    public final long f186159e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186160f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f186161g;

    public GetMsgParams(java.lang.String sessionId, long j17, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f186158d = sessionId;
        this.f186159e = j17;
        this.f186160f = i17;
        this.f186161g = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186158d);
        out.writeLong(this.f186159e);
        out.writeInt(this.f186160f);
        out.writeInt(this.f186161g ? 1 : 0);
    }
}
