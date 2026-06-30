package com.tencent.mm.plugin.websearch.api.circlesearch;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/websearch/api/circlesearch/CircleSearchInfo;", "Landroid/os/Parcelable;", "tu4/a", "websearch-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class CircleSearchInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f181443d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f181444e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f181445f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f181446g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f181447h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f181448i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f181449m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f181450n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f181451o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f181452p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f181453q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Integer f181454r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f181455s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f181456t;

    /* renamed from: u, reason: collision with root package name */
    public static final tu4.a f181442u = new tu4.a(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo> CREATOR = new tu4.b();

    public CircleSearchInfo(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num2, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Integer num3, java.lang.String str9, java.lang.String str10) {
        this.f181443d = num;
        this.f181444e = str;
        this.f181445f = str2;
        this.f181446g = bool;
        this.f181447h = str3;
        this.f181448i = str4;
        this.f181449m = str5;
        this.f181450n = num2;
        this.f181451o = str6;
        this.f181452p = str7;
        this.f181453q = str8;
        this.f181454r = num3;
        this.f181455s = str9;
        this.f181456t = str10;
    }

    public final java.lang.String a(java.lang.String sessionId, int i17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return "," + this.f181454r + ",0,0," + sessionId + ',' + i17 + ',' + java.lang.System.currentTimeMillis() + ',' + this.f181447h + ',' + this.f181452p + ',' + this.f181453q + ',' + this.f181450n;
    }

    public final java.util.Map b() {
        return kz5.c1.k(new jz5.l("searchScene", this.f181443d), new jz5.l("parentSearchId", this.f181444e), new jz5.l("thirdExtInfo", this.f181445f), new jz5.l("skipImageUploading", this.f181446g), new jz5.l("recommendQuery", this.f181447h), new jz5.l("imageUrl", this.f181448i), new jz5.l("base64ImageData", this.f181449m), new jz5.l("reportInfoFor33399", this.f181451o), new jz5.l("imgPath", this.f181455s), new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f181456t));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo)) {
            return false;
        }
        com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo circleSearchInfo = (com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo) obj;
        return kotlin.jvm.internal.o.b(this.f181443d, circleSearchInfo.f181443d) && kotlin.jvm.internal.o.b(this.f181444e, circleSearchInfo.f181444e) && kotlin.jvm.internal.o.b(this.f181445f, circleSearchInfo.f181445f) && kotlin.jvm.internal.o.b(this.f181446g, circleSearchInfo.f181446g) && kotlin.jvm.internal.o.b(this.f181447h, circleSearchInfo.f181447h) && kotlin.jvm.internal.o.b(this.f181448i, circleSearchInfo.f181448i) && kotlin.jvm.internal.o.b(this.f181449m, circleSearchInfo.f181449m) && kotlin.jvm.internal.o.b(this.f181450n, circleSearchInfo.f181450n) && kotlin.jvm.internal.o.b(this.f181451o, circleSearchInfo.f181451o) && kotlin.jvm.internal.o.b(this.f181452p, circleSearchInfo.f181452p) && kotlin.jvm.internal.o.b(this.f181453q, circleSearchInfo.f181453q) && kotlin.jvm.internal.o.b(this.f181454r, circleSearchInfo.f181454r) && kotlin.jvm.internal.o.b(this.f181455s, circleSearchInfo.f181455s) && kotlin.jvm.internal.o.b(this.f181456t, circleSearchInfo.f181456t);
    }

    public int hashCode() {
        java.lang.Integer num = this.f181443d;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f181444e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f181445f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Boolean bool = this.f181446g;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str3 = this.f181447h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f181448i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f181449m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Integer num2 = this.f181450n;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str6 = this.f181451o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f181452p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f181453q;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Integer num3 = this.f181454r;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str9 = this.f181455s;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.f181456t;
        return hashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CircleSearchInfo(searchScene=" + this.f181443d + ", parentSearchId=" + this.f181444e + ", extInfo=" + this.f181445f + ", skipImageUploading=" + this.f181446g + ", recommendQuery=" + this.f181447h + ", imageUrl=" + this.f181448i + ", base64ImageData=" + this.f181449m + ", recommendQueryPullType=" + this.f181450n + ", reportInfoFor33399=" + this.f181451o + ", reportSearchStatusInfoFor34875=" + this.f181452p + ", reportExtInfoFor34875=" + this.f181453q + ", enterScene=" + this.f181454r + ", imgPath=" + this.f181455s + ", sessionId=" + this.f181456t + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        int i18 = 0;
        java.lang.Integer num = this.f181443d;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f181444e);
        out.writeString(this.f181445f);
        java.lang.Boolean bool = this.f181446g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.f181447h);
        out.writeString(this.f181448i);
        out.writeString(this.f181449m);
        java.lang.Integer num2 = this.f181450n;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f181451o);
        out.writeString(this.f181452p);
        out.writeString(this.f181453q);
        java.lang.Integer num3 = this.f181454r;
        if (num3 != null) {
            out.writeInt(1);
            i18 = num3.intValue();
        }
        out.writeInt(i18);
        out.writeString(this.f181455s);
        out.writeString(this.f181456t);
    }
}
