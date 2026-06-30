package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveNetWorkPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveNetWorkPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload> CREATOR = new j63.j();

    /* renamed from: d, reason: collision with root package name */
    public final int f142027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142028e;

    public GameLiveAppbrandEventService$LiveNetWorkPayload(int i17, int i18) {
        this.f142027d = i17;
        this.f142028e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload gameLiveAppbrandEventService$LiveNetWorkPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload) obj;
        return this.f142027d == gameLiveAppbrandEventService$LiveNetWorkPayload.f142027d && this.f142028e == gameLiveAppbrandEventService$LiveNetWorkPayload.f142028e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f142027d) * 31) + java.lang.Integer.hashCode(this.f142028e);
    }

    public java.lang.String toString() {
        return "LiveNetWorkPayload(netQuality=" + this.f142027d + ", threshold=" + this.f142028e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142027d);
        out.writeInt(this.f142028e);
    }
}
