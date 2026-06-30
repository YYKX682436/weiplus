package com.tencent.mm.plugin.wallet_core.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/wallet_core/utils/WCPaySessionInfoRecorder$JsApiPayInfo", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/wallet_core/utils/o0", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WCPaySessionInfoRecorder$JsApiPayInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.wallet_core.utils.o0 CREATOR = new com.tencent.mm.plugin.wallet_core.utils.o0(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n0 f180838d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.s0 f180839e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.utils.q0 f180840f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180841g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f180842h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f180843i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f180844m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f180845n;

    /* renamed from: o, reason: collision with root package name */
    public final long f180846o;

    public WCPaySessionInfoRecorder$JsApiPayInfo(com.tencent.mm.plugin.wallet_core.utils.n0 chatType, com.tencent.mm.plugin.wallet_core.utils.s0 sendType, com.tencent.mm.plugin.wallet_core.utils.q0 sessionType, java.lang.String sessionName, java.lang.String timelineObjId, java.lang.String msgSvrId, java.lang.String msgSendUserName, java.lang.String initRawUrl, long j17) {
        kotlin.jvm.internal.o.g(chatType, "chatType");
        kotlin.jvm.internal.o.g(sendType, "sendType");
        kotlin.jvm.internal.o.g(sessionType, "sessionType");
        kotlin.jvm.internal.o.g(sessionName, "sessionName");
        kotlin.jvm.internal.o.g(timelineObjId, "timelineObjId");
        kotlin.jvm.internal.o.g(msgSvrId, "msgSvrId");
        kotlin.jvm.internal.o.g(msgSendUserName, "msgSendUserName");
        kotlin.jvm.internal.o.g(initRawUrl, "initRawUrl");
        this.f180838d = chatType;
        this.f180839e = sendType;
        this.f180840f = sessionType;
        this.f180841g = sessionName;
        this.f180842h = timelineObjId;
        this.f180843i = msgSvrId;
        this.f180844m = msgSendUserName;
        this.f180845n = initRawUrl;
        this.f180846o = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo)) {
            return false;
        }
        com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo wCPaySessionInfoRecorder$JsApiPayInfo = (com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo) obj;
        return this.f180838d == wCPaySessionInfoRecorder$JsApiPayInfo.f180838d && this.f180839e == wCPaySessionInfoRecorder$JsApiPayInfo.f180839e && this.f180840f == wCPaySessionInfoRecorder$JsApiPayInfo.f180840f && kotlin.jvm.internal.o.b(this.f180841g, wCPaySessionInfoRecorder$JsApiPayInfo.f180841g) && kotlin.jvm.internal.o.b(this.f180842h, wCPaySessionInfoRecorder$JsApiPayInfo.f180842h) && kotlin.jvm.internal.o.b(this.f180843i, wCPaySessionInfoRecorder$JsApiPayInfo.f180843i) && kotlin.jvm.internal.o.b(this.f180844m, wCPaySessionInfoRecorder$JsApiPayInfo.f180844m) && kotlin.jvm.internal.o.b(this.f180845n, wCPaySessionInfoRecorder$JsApiPayInfo.f180845n) && this.f180846o == wCPaySessionInfoRecorder$JsApiPayInfo.f180846o;
    }

    public int hashCode() {
        return (((((((((((((((this.f180838d.hashCode() * 31) + this.f180839e.hashCode()) * 31) + this.f180840f.hashCode()) * 31) + this.f180841g.hashCode()) * 31) + this.f180842h.hashCode()) * 31) + this.f180843i.hashCode()) * 31) + this.f180844m.hashCode()) * 31) + this.f180845n.hashCode()) * 31) + java.lang.Long.hashCode(this.f180846o);
    }

    public java.lang.String toString() {
        return "JsApiPayInfo(chatType=" + this.f180838d + ", sendType=" + this.f180839e + ", sessionType=" + this.f180840f + ", sessionName=" + this.f180841g + ", timelineObjId=" + this.f180842h + ", msgSvrId=" + this.f180843i + ", msgSendUserName=" + this.f180844m + ", initRawUrl=" + this.f180845n + ", initTimestamp=" + this.f180846o + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f180838d.f180949d);
        dest.writeInt(this.f180839e.f180985d);
        dest.writeInt(this.f180840f.f180969d);
        dest.writeString(this.f180841g);
        dest.writeString(this.f180842h);
        dest.writeString(this.f180843i);
        dest.writeString(this.f180844m);
        dest.writeString(this.f180845n);
        dest.writeLong(this.f180846o);
    }

    public /* synthetic */ WCPaySessionInfoRecorder$JsApiPayInfo(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, str2, i17, str3, str4, (i18 & 32) != 0 ? "" : str5, (i18 & 64) != 0 ? 0L : j17);
    }

    public WCPaySessionInfoRecorder$JsApiPayInfo(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17) {
        this(com.tencent.mm.plugin.wallet_core.utils.n0.f180939e.a(str), com.tencent.mm.plugin.wallet_core.utils.s0.f180980e.a(str2), com.tencent.mm.plugin.wallet_core.utils.q0.f180965e.a(i17), str3 == null ? "" : str3, "", str4 == null ? "" : str4, str2 == null ? "" : str2, str5 == null ? "" : str5, j17);
    }

    public WCPaySessionInfoRecorder$JsApiPayInfo(java.lang.String str, java.lang.String str2) {
        this(com.tencent.mm.plugin.wallet_core.utils.n0.f180939e.b(str), com.tencent.mm.plugin.wallet_core.utils.s0.f180980e.a(str), com.tencent.mm.plugin.wallet_core.utils.q0.f180966f, "", "", "", "", "", 0L);
    }
}
