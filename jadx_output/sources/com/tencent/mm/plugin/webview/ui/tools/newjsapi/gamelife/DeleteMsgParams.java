package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/DeleteMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DeleteMsgParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186122d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186123e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186124f;

    public DeleteMsgParams(java.lang.String sessionId, java.lang.String messageList, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(messageList, "messageList");
        this.f186122d = sessionId;
        this.f186123e = messageList;
        this.f186124f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186122d);
        out.writeString(this.f186123e);
        out.writeInt(this.f186124f ? 1 : 0);
    }
}
