package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final /* data */ class GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload> CREATOR = new j63.e();

    /* renamed from: d, reason: collision with root package name */
    public long f142015d;

    /* renamed from: e, reason: collision with root package name */
    public long f142016e;

    /* renamed from: f, reason: collision with root package name */
    public long f142017f;

    /* renamed from: g, reason: collision with root package name */
    public long f142018g;

    /* renamed from: h, reason: collision with root package name */
    public long f142019h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f142020i;

    public GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload(long j17, long j18, long j19, long j27, long j28, java.util.List list) {
        this.f142015d = j17;
        this.f142016e = j18;
        this.f142017f = j19;
        this.f142018g = j27;
        this.f142019h = j28;
        this.f142020i = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload) obj;
        return this.f142015d == gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142015d && this.f142016e == gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142016e && this.f142017f == gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142017f && this.f142018g == gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142018g && this.f142019h == gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142019h && kotlin.jvm.internal.o.b(this.f142020i, gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142020i);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Long.hashCode(this.f142015d) * 31) + java.lang.Long.hashCode(this.f142016e)) * 31) + java.lang.Long.hashCode(this.f142017f)) * 31) + java.lang.Long.hashCode(this.f142018g)) * 31) + java.lang.Long.hashCode(this.f142019h)) * 31;
        java.util.List list = this.f142020i;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "LiveCommentWrapperInfoPayload(liveId=" + this.f142015d + ", currOnlineCount=" + this.f142016e + ", totalViewCount=" + this.f142017f + ", currLikeCount=" + this.f142018g + ", totalRewardCount=" + this.f142019h + ", msgList=" + this.f142020i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f142015d);
        out.writeLong(this.f142016e);
        out.writeLong(this.f142017f);
        out.writeLong(this.f142018g);
        out.writeLong(this.f142019h);
        java.util.List list = this.f142020i;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload) it.next()).writeToParcel(out, i17);
        }
    }
}
