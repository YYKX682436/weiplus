package com.tencent.mm.plugin.game.luggage.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/model/H5CgiPreloadModel;", "Landroid/os/Parcelable;", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class H5CgiPreloadModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel> CREATOR = new d53.a();

    /* renamed from: d, reason: collision with root package name */
    public long f139852d;

    /* renamed from: e, reason: collision with root package name */
    public long f139853e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f139854f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139855g;

    public H5CgiPreloadModel(long j17, long j18, boolean z17, java.lang.String str) {
        this.f139852d = j17;
        this.f139853e = j18;
        this.f139854f = z17;
        this.f139855g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel)) {
            return false;
        }
        com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel h5CgiPreloadModel = (com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel) obj;
        return this.f139852d == h5CgiPreloadModel.f139852d && this.f139853e == h5CgiPreloadModel.f139853e && this.f139854f == h5CgiPreloadModel.f139854f && kotlin.jvm.internal.o.b(this.f139855g, h5CgiPreloadModel.f139855g);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f139852d) * 31) + java.lang.Long.hashCode(this.f139853e)) * 31) + java.lang.Boolean.hashCode(this.f139854f)) * 31;
        java.lang.String str = this.f139855g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "H5CgiPreloadModel(timeStamp=" + this.f139852d + ", cgiCostTimeMs=" + this.f139853e + ", isRequestFail=" + this.f139854f + ", cgiResponseStr=" + this.f139855g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeLong(this.f139852d);
        out.writeLong(this.f139853e);
        out.writeInt(this.f139854f ? 1 : 0);
        out.writeString(this.f139855g);
    }
}
