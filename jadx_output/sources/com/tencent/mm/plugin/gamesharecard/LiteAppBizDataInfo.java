package com.tencent.mm.plugin.gamesharecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/gamesharecard/LiteAppBizDataInfo;", "Landroid/os/Parcelable;", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class LiteAppBizDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo> CREATOR = new l63.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142116d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f142117e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f142118f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f142119g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f142120h;

    /* renamed from: i, reason: collision with root package name */
    public final int f142121i;

    public LiteAppBizDataInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i17) {
        this.f142116d = str;
        this.f142117e = str2;
        this.f142118f = str3;
        this.f142119g = str4;
        this.f142120h = num;
        this.f142121i = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo)) {
            return false;
        }
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = (com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo) obj;
        return kotlin.jvm.internal.o.b(this.f142116d, liteAppBizDataInfo.f142116d) && kotlin.jvm.internal.o.b(this.f142117e, liteAppBizDataInfo.f142117e) && kotlin.jvm.internal.o.b(this.f142118f, liteAppBizDataInfo.f142118f) && kotlin.jvm.internal.o.b(this.f142119g, liteAppBizDataInfo.f142119g) && kotlin.jvm.internal.o.b(this.f142120h, liteAppBizDataInfo.f142120h) && this.f142121i == liteAppBizDataInfo.f142121i;
    }

    public int hashCode() {
        java.lang.String str = this.f142116d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f142117e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f142118f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f142119g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.f142120h;
        return ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f142121i);
    }

    public java.lang.String toString() {
        return "LiteAppBizDataInfo(id=" + this.f142116d + ", path=" + this.f142117e + ", query=" + this.f142118f + ", bizData=" + this.f142119g + ", source=" + this.f142120h + ", priority=" + this.f142121i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f142116d);
        out.writeString(this.f142117e);
        out.writeString(this.f142118f);
        out.writeString(this.f142119g);
        java.lang.Integer num = this.f142120h;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeInt(this.f142121i);
    }
}
