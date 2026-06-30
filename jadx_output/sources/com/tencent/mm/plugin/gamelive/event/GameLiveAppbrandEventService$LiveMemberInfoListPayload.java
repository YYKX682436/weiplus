package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoListPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveMemberInfoListPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload> CREATOR = new j63.h();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f142024d;

    public GameLiveAppbrandEventService$LiveMemberInfoListPayload(java.util.List list) {
        this.f142024d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload) && kotlin.jvm.internal.o.b(this.f142024d, ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload) obj).f142024d);
    }

    public int hashCode() {
        java.util.List list = this.f142024d;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public java.lang.String toString() {
        return "LiveMemberInfoListPayload(msgList=" + this.f142024d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f142024d;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload) it.next()).writeToParcel(out, i17);
        }
    }
}
