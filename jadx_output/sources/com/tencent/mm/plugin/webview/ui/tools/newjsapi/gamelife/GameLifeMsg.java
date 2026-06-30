package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GameLifeMsg;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameLifeMsg implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186125d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186126e;

    /* renamed from: f, reason: collision with root package name */
    public final double f186127f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f186128g;

    /* renamed from: h, reason: collision with root package name */
    public final int f186129h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f186130i;

    /* renamed from: m, reason: collision with root package name */
    public final int f186131m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f186132n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f186133o;

    /* renamed from: p, reason: collision with root package name */
    public final int f186134p;

    /* renamed from: q, reason: collision with root package name */
    public final int f186135q;

    public GameLifeMsg(java.lang.String toUsername, java.lang.String fromUsername, double d17, java.lang.String content, int i17, java.lang.String sessionId, int i18, java.lang.String msgSource, java.lang.String appId, int i19, int i27) {
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(msgSource, "msgSource");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f186125d = toUsername;
        this.f186126e = fromUsername;
        this.f186127f = d17;
        this.f186128g = content;
        this.f186129h = i17;
        this.f186130i = sessionId;
        this.f186131m = i18;
        this.f186132n = msgSource;
        this.f186133o = appId;
        this.f186134p = i19;
        this.f186135q = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186125d);
        out.writeString(this.f186126e);
        out.writeDouble(this.f186127f);
        out.writeString(this.f186128g);
        out.writeInt(this.f186129h);
        out.writeString(this.f186130i);
        out.writeInt(this.f186131m);
        out.writeString(this.f186132n);
        out.writeString(this.f186133o);
        out.writeInt(this.f186134p);
        out.writeInt(this.f186135q);
    }
}
