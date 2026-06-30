package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/AddConversationParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AddConversationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186119d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186120e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f186121f;

    public AddConversationParams(java.lang.String sessionId, java.lang.String selfUserName, java.lang.String talker) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f186119d = sessionId;
        this.f186120e = selfUserName;
        this.f186121f = talker;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186119d);
        out.writeString(this.f186120e);
        out.writeString(this.f186121f);
    }
}
