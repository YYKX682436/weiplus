package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveIntPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveIntPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload> CREATOR = new j63.g();

    /* renamed from: d, reason: collision with root package name */
    public final int f142023d;

    public GameLiveAppbrandEventService$LiveIntPayload(int i17) {
        this.f142023d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload) && this.f142023d == ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload) obj).f142023d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f142023d);
    }

    public java.lang.String toString() {
        return "LiveIntPayload(param=" + this.f142023d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142023d);
    }
}
