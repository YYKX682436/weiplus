package com.tencent.mm.plugin.gamelive.render;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/render/GameLiveAppbrandRenderMgrService$Payload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class GameLiveAppbrandRenderMgrService$Payload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload> CREATOR = new k63.q();

    /* renamed from: d, reason: collision with root package name */
    public final int f142106d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142107e;

    public GameLiveAppbrandRenderMgrService$Payload(int i17, int i18) {
        this.f142106d = i17;
        this.f142107e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload gameLiveAppbrandRenderMgrService$Payload = (com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload) obj;
        return this.f142106d == gameLiveAppbrandRenderMgrService$Payload.f142106d && this.f142107e == gameLiveAppbrandRenderMgrService$Payload.f142107e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f142106d) * 31) + java.lang.Integer.hashCode(this.f142107e);
    }

    public java.lang.String toString() {
        return "Payload(width=" + this.f142106d + ", height=" + this.f142107e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142106d);
        out.writeInt(this.f142107e);
    }
}
