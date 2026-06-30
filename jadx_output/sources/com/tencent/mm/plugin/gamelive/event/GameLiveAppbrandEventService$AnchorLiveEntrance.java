package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$AnchorLiveEntrance", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GameLiveAppbrandEventService$AnchorLiveEntrance implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance> CREATOR = new j63.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f142012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142013e;

    /* renamed from: f, reason: collision with root package name */
    public final long f142014f;

    public GameLiveAppbrandEventService$AnchorLiveEntrance(int i17, int i18, long j17) {
        this.f142012d = i17;
        this.f142013e = i18;
        this.f142014f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance gameLiveAppbrandEventService$AnchorLiveEntrance = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance) obj;
        return this.f142012d == gameLiveAppbrandEventService$AnchorLiveEntrance.f142012d && this.f142013e == gameLiveAppbrandEventService$AnchorLiveEntrance.f142013e && this.f142014f == gameLiveAppbrandEventService$AnchorLiveEntrance.f142014f;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f142012d) * 31) + java.lang.Integer.hashCode(this.f142013e)) * 31) + java.lang.Long.hashCode(this.f142014f);
    }

    public java.lang.String toString() {
        return "AnchorLiveEntrance(id=" + this.f142012d + ", entranceType=" + this.f142013e + ", entranceId=" + this.f142014f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142012d);
        out.writeInt(this.f142013e);
        out.writeLong(this.f142014f);
    }
}
