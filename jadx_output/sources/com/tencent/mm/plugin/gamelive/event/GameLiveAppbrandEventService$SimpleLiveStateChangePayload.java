package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$SimpleLiveStateChangePayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class GameLiveAppbrandEventService$SimpleLiveStateChangePayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload> CREATOR = new j63.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f142071d;

    public GameLiveAppbrandEventService$SimpleLiveStateChangePayload(java.util.Map data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f142071d = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload) && kotlin.jvm.internal.o.b(this.f142071d, ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload) obj).f142071d);
    }

    public int hashCode() {
        return this.f142071d.hashCode();
    }

    public java.lang.String toString() {
        return "SimpleLiveStateChangePayload(data=" + this.f142071d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.Map map = this.f142071d;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeInt(((java.lang.Number) entry.getValue()).intValue());
        }
    }
}
