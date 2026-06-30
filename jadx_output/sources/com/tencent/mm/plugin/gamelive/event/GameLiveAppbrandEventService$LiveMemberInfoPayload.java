package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveMemberInfoPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload> CREATOR = new j63.i();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142025d;

    /* renamed from: e, reason: collision with root package name */
    public int f142026e;

    public GameLiveAppbrandEventService$LiveMemberInfoPayload(java.lang.String str, int i17) {
        this.f142025d = str;
        this.f142026e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload gameLiveAppbrandEventService$LiveMemberInfoPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload) obj;
        return kotlin.jvm.internal.o.b(this.f142025d, gameLiveAppbrandEventService$LiveMemberInfoPayload.f142025d) && this.f142026e == gameLiveAppbrandEventService$LiveMemberInfoPayload.f142026e;
    }

    public int hashCode() {
        java.lang.String str = this.f142025d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f142026e);
    }

    public java.lang.String toString() {
        return "LiveMemberInfoPayload(nickname=" + this.f142025d + ", rewardAmountInHeat=" + this.f142026e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f142025d);
        out.writeInt(this.f142026e);
    }
}
