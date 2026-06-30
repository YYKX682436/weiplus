package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload> CREATOR = new j63.f();

    /* renamed from: d, reason: collision with root package name */
    public final int f142021d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f142022e;

    public GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload(int i17, java.lang.String str) {
        this.f142021d = i17;
        this.f142022e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload) obj;
        return this.f142021d == gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload.f142021d && kotlin.jvm.internal.o.b(this.f142022e, gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload.f142022e);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f142021d) * 31;
        java.lang.String str = this.f142022e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "LiveCurrentRoomInfoPayload(startTime=" + this.f142021d + ", topic=" + this.f142022e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142021d);
        out.writeString(this.f142022e);
    }
}
