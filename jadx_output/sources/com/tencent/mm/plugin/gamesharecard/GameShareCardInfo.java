package com.tencent.mm.plugin.gamesharecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/gamesharecard/GameShareCardInfo;", "Landroid/os/Parcelable;", "plugin-gamesharecard.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class GameShareCardInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamesharecard.GameShareCardInfo> CREATOR = new l63.e();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo f142108d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f142109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f142110f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f142111g;

    /* renamed from: h, reason: collision with root package name */
    public final int f142112h;

    /* renamed from: i, reason: collision with root package name */
    public final int f142113i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f142114m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f142115n;

    public GameShareCardInfo(com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppInfo, java.lang.String gameShareId, java.lang.String gameShareData, java.lang.String title, int i17, int i18, java.lang.String str, java.lang.String desc) {
        kotlin.jvm.internal.o.g(liteAppInfo, "liteAppInfo");
        kotlin.jvm.internal.o.g(gameShareId, "gameShareId");
        kotlin.jvm.internal.o.g(gameShareData, "gameShareData");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f142108d = liteAppInfo;
        this.f142109e = gameShareId;
        this.f142110f = gameShareData;
        this.f142111g = title;
        this.f142112h = i17;
        this.f142113i = i18;
        this.f142114m = str;
        this.f142115n = desc;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamesharecard.GameShareCardInfo)) {
            return false;
        }
        com.tencent.mm.plugin.gamesharecard.GameShareCardInfo gameShareCardInfo = (com.tencent.mm.plugin.gamesharecard.GameShareCardInfo) obj;
        return kotlin.jvm.internal.o.b(this.f142108d, gameShareCardInfo.f142108d) && kotlin.jvm.internal.o.b(this.f142109e, gameShareCardInfo.f142109e) && kotlin.jvm.internal.o.b(this.f142110f, gameShareCardInfo.f142110f) && kotlin.jvm.internal.o.b(this.f142111g, gameShareCardInfo.f142111g) && this.f142112h == gameShareCardInfo.f142112h && this.f142113i == gameShareCardInfo.f142113i && kotlin.jvm.internal.o.b(this.f142114m, gameShareCardInfo.f142114m) && kotlin.jvm.internal.o.b(this.f142115n, gameShareCardInfo.f142115n);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f142108d.hashCode() * 31) + this.f142109e.hashCode()) * 31) + this.f142110f.hashCode()) * 31) + this.f142111g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f142112h)) * 31) + java.lang.Integer.hashCode(this.f142113i)) * 31;
        java.lang.String str = this.f142114m;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f142115n.hashCode();
    }

    public java.lang.String toString() {
        return "GameShareCardInfo(liteAppInfo=" + this.f142108d + ", gameShareId=" + this.f142109e + ", gameShareData=" + this.f142110f + ", title=" + this.f142111g + ", isVideo=" + this.f142112h + ", duration=" + this.f142113i + ", srcId=" + this.f142114m + ", desc=" + this.f142115n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f142108d, i17);
        out.writeString(this.f142109e);
        out.writeString(this.f142110f);
        out.writeString(this.f142111g);
        out.writeInt(this.f142112h);
        out.writeInt(this.f142113i);
        out.writeString(this.f142114m);
        out.writeString(this.f142115n);
    }
}
