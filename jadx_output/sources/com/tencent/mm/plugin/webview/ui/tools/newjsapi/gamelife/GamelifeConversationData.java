package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GamelifeConversationData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186136d;

    /* renamed from: e, reason: collision with root package name */
    public final int f186137e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186138f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f186139g;

    /* renamed from: h, reason: collision with root package name */
    public final int f186140h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f186141i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f186142m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f186143n;

    public GamelifeConversationData(java.lang.String sessionId, int i17, int i18, java.lang.String draftMsg, int i19, java.lang.String selfUsername, java.lang.String talker, java.lang.String digest) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(draftMsg, "draftMsg");
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(digest, "digest");
        this.f186136d = sessionId;
        this.f186137e = i17;
        this.f186138f = i18;
        this.f186139g = draftMsg;
        this.f186140h = i19;
        this.f186141i = selfUsername;
        this.f186142m = talker;
        this.f186143n = digest;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186136d);
        out.writeInt(this.f186137e);
        out.writeInt(this.f186138f);
        out.writeString(this.f186139g);
        out.writeInt(this.f186140h);
        out.writeString(this.f186141i);
        out.writeString(this.f186142m);
        out.writeString(this.f186143n);
    }
}
