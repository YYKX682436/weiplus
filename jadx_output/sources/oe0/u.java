package oe0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344680a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344681b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f344682c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f344683d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344684e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f344685f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f344686g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f344687h;

    public u(java.lang.String finderUserName, long j17, java.lang.String encodedUxInfo, java.lang.String fromCommentScene, java.lang.String enterImmerseType, java.lang.String promotionRecommendInfo, java.lang.String queryStr, java.lang.String gameClientParams) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(encodedUxInfo, "encodedUxInfo");
        kotlin.jvm.internal.o.g(fromCommentScene, "fromCommentScene");
        kotlin.jvm.internal.o.g(enterImmerseType, "enterImmerseType");
        kotlin.jvm.internal.o.g(promotionRecommendInfo, "promotionRecommendInfo");
        kotlin.jvm.internal.o.g(queryStr, "queryStr");
        kotlin.jvm.internal.o.g(gameClientParams, "gameClientParams");
        this.f344680a = finderUserName;
        this.f344681b = j17;
        this.f344682c = encodedUxInfo;
        this.f344683d = fromCommentScene;
        this.f344684e = enterImmerseType;
        this.f344685f = promotionRecommendInfo;
        this.f344686g = queryStr;
        this.f344687h = gameClientParams;
    }

    public java.lang.String a() {
        java.lang.String str = "?finderUsername=" + this.f344680a + "&objectId=" + pm0.v.u(this.f344681b);
        java.lang.String str2 = this.f344682c;
        if (str2.length() > 0) {
            str = str + "&uxinfo=" + str2;
        }
        java.lang.String str3 = this.f344683d;
        if (str3.length() > 0) {
            str = str + "&commentScene=" + str3;
        }
        java.lang.String str4 = this.f344684e;
        if (str4.length() > 0) {
            str = str + "&enterImmerseType=" + str4;
        }
        java.lang.String str5 = this.f344685f;
        if (str5.length() > 0) {
            str = str + "&promotionRecommendInfo=" + str5;
        }
        java.lang.String str6 = this.f344686g;
        if (str6.length() > 0) {
            str = str + "&query=" + str6;
        }
        java.lang.String str7 = this.f344687h;
        if (str7.length() > 0) {
            str = str + "&gameClientParams=" + str7;
        }
        com.tencent.mars.xlog.Log.i("FinderExtData", "result: " + str);
        return str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe0.u)) {
            return false;
        }
        oe0.u uVar = (oe0.u) obj;
        return kotlin.jvm.internal.o.b(this.f344680a, uVar.f344680a) && this.f344681b == uVar.f344681b && kotlin.jvm.internal.o.b(this.f344682c, uVar.f344682c) && kotlin.jvm.internal.o.b(this.f344683d, uVar.f344683d) && kotlin.jvm.internal.o.b(this.f344684e, uVar.f344684e) && kotlin.jvm.internal.o.b(this.f344685f, uVar.f344685f) && kotlin.jvm.internal.o.b(this.f344686g, uVar.f344686g) && kotlin.jvm.internal.o.b(this.f344687h, uVar.f344687h);
    }

    public int hashCode() {
        return (((((((((((((this.f344680a.hashCode() * 31) + java.lang.Long.hashCode(this.f344681b)) * 31) + this.f344682c.hashCode()) * 31) + this.f344683d.hashCode()) * 31) + this.f344684e.hashCode()) * 31) + this.f344685f.hashCode()) * 31) + this.f344686g.hashCode()) * 31) + this.f344687h.hashCode();
    }

    public java.lang.String toString() {
        return "FinderExtData(finderUserName=" + this.f344680a + ", objectId=" + this.f344681b + ", encodedUxInfo=" + this.f344682c + ", fromCommentScene=" + this.f344683d + ", enterImmerseType=" + this.f344684e + ", promotionRecommendInfo=" + this.f344685f + ", queryStr=" + this.f344686g + ", gameClientParams=" + this.f344687h + ')';
    }

    public /* synthetic */ u(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? "" : str5, (i17 & 64) != 0 ? "" : str6, (i17 & 128) == 0 ? str7 : "");
    }
}
