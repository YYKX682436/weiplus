package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveTopicPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveTopicPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload> CREATOR = new j63.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142068d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f142069e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f142070f;

    public GameLiveAppbrandEventService$LiveTopicPayload(java.lang.String topic, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f142068d = topic;
        this.f142069e = z17;
        this.f142070f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload gameLiveAppbrandEventService$LiveTopicPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload) obj;
        return kotlin.jvm.internal.o.b(this.f142068d, gameLiveAppbrandEventService$LiveTopicPayload.f142068d) && this.f142069e == gameLiveAppbrandEventService$LiveTopicPayload.f142069e && kotlin.jvm.internal.o.b(this.f142070f, gameLiveAppbrandEventService$LiveTopicPayload.f142070f);
    }

    public int hashCode() {
        int hashCode = ((this.f142068d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f142069e)) * 31;
        java.lang.String str = this.f142070f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "LiveTopicPayload(topic=" + this.f142068d + ", ret=" + this.f142069e + ", errMsg=" + this.f142070f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f142068d);
        out.writeInt(this.f142069e ? 1 : 0);
        out.writeString(this.f142070f);
    }
}
