package com.tencent.mm.plugin.gamelive.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LivePlayGamePayLoad", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class GameLiveAppbrandEventService$LivePlayGamePayLoad implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad> CREATOR = new j63.k();

    /* renamed from: d, reason: collision with root package name */
    public int f142029d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142030e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142031f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142032g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142033h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142034i;

    /* renamed from: m, reason: collision with root package name */
    public int f142035m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142036n;

    /* renamed from: o, reason: collision with root package name */
    public int f142037o;

    /* renamed from: p, reason: collision with root package name */
    public int f142038p;

    public GameLiveAppbrandEventService$LivePlayGamePayLoad(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, int i19, int i27) {
        this.f142029d = i17;
        this.f142030e = str;
        this.f142031f = str2;
        this.f142032g = str3;
        this.f142033h = str4;
        this.f142034i = str5;
        this.f142035m = i18;
        this.f142036n = str6;
        this.f142037o = i19;
        this.f142038p = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad)) {
            return false;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad gameLiveAppbrandEventService$LivePlayGamePayLoad = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad) obj;
        return this.f142029d == gameLiveAppbrandEventService$LivePlayGamePayLoad.f142029d && kotlin.jvm.internal.o.b(this.f142030e, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142030e) && kotlin.jvm.internal.o.b(this.f142031f, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142031f) && kotlin.jvm.internal.o.b(this.f142032g, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142032g) && kotlin.jvm.internal.o.b(this.f142033h, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142033h) && kotlin.jvm.internal.o.b(this.f142034i, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142034i) && this.f142035m == gameLiveAppbrandEventService$LivePlayGamePayLoad.f142035m && kotlin.jvm.internal.o.b(this.f142036n, gameLiveAppbrandEventService$LivePlayGamePayLoad.f142036n) && this.f142037o == gameLiveAppbrandEventService$LivePlayGamePayLoad.f142037o && this.f142038p == gameLiveAppbrandEventService$LivePlayGamePayLoad.f142038p;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f142029d) * 31;
        java.lang.String str = this.f142030e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f142031f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f142032g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f142033h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f142034i;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Integer.hashCode(this.f142035m)) * 31;
        java.lang.String str6 = this.f142036n;
        return ((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f142037o)) * 31) + java.lang.Integer.hashCode(this.f142038p);
    }

    public java.lang.String toString() {
        return "LivePlayGamePayLoad(join_team_mode=" + this.f142029d + ", title=" + this.f142030e + ", teamup_desc=" + this.f142031f + ", member_desc=" + this.f142032g + ", teamup_extra_data=" + this.f142033h + ", appid=" + this.f142034i + ", versionType=" + this.f142035m + ", path=" + this.f142036n + ", sourceId=" + this.f142037o + ", type=" + this.f142038p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f142029d);
        out.writeString(this.f142030e);
        out.writeString(this.f142031f);
        out.writeString(this.f142032g);
        out.writeString(this.f142033h);
        out.writeString(this.f142034i);
        out.writeInt(this.f142035m);
        out.writeString(this.f142036n);
        out.writeInt(this.f142037o);
        out.writeInt(this.f142038p);
    }
}
