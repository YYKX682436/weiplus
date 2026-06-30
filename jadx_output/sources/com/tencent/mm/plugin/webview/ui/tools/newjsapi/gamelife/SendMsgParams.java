package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/SendMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SendMsgParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.n0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186166e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f186167f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f186168g;

    /* renamed from: h, reason: collision with root package name */
    public final int f186169h;

    public SendMsgParams(java.lang.String sessionId, java.lang.String content, java.lang.String selfUserName, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f186165d = sessionId;
        this.f186166e = content;
        this.f186167f = selfUserName;
        this.f186168g = talker;
        this.f186169h = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186165d);
        out.writeString(this.f186166e);
        out.writeString(this.f186167f);
        out.writeString(this.f186168g);
        out.writeInt(this.f186169h);
    }
}
