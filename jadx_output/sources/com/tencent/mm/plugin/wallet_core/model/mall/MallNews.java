package com.tencent.mm.plugin.wallet_core.model.mall;

/* loaded from: classes9.dex */
public class MallNews implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.mall.MallNews> CREATOR = new bt4.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179832e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f179833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179835h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179836i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179837m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179838n;

    /* renamed from: o, reason: collision with root package name */
    public int f179839o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179840p;

    /* renamed from: q, reason: collision with root package name */
    public int f179841q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f179842r;

    /* renamed from: s, reason: collision with root package name */
    public int f179843s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179844t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179845u;

    /* renamed from: v, reason: collision with root package name */
    public int f179846v;

    /* renamed from: w, reason: collision with root package name */
    public int f179847w;

    public MallNews(java.lang.String str) {
        this.f179831d = "0";
        this.f179832e = "0";
        this.f179833f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj instanceof com.tencent.mm.plugin.wallet_core.model.mall.MallNews) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) obj;
            java.lang.String str2 = this.f179833f;
            if (str2 != null && str2.equals(mallNews.f179833f) && (str = this.f179834g) != null && str.equals(mallNews.f179834g)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return java.lang.String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s, walletRegion: %d", this.f179833f, this.f179834g, this.f179835h, this.f179836i, this.f179837m, this.f179838n, this.f179831d, this.f179842r, this.f179840p, java.lang.Integer.valueOf(this.f179843s), this.f179844t, java.lang.Integer.valueOf(this.f179847w));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179833f);
        parcel.writeString(this.f179834g);
        parcel.writeString(this.f179835h);
        parcel.writeString(this.f179836i);
        parcel.writeString(this.f179837m);
        parcel.writeString(this.f179838n);
        parcel.writeInt(this.f179839o);
        parcel.writeString(this.f179840p);
        parcel.writeString(this.f179831d);
        parcel.writeString(this.f179832e);
        parcel.writeInt(this.f179846v);
        parcel.writeString(this.f179842r);
        parcel.writeInt(this.f179843s);
        parcel.writeString(this.f179844t);
        parcel.writeInt(this.f179847w);
    }

    public MallNews(android.os.Parcel parcel) {
        this.f179831d = "0";
        this.f179832e = "0";
        this.f179833f = parcel.readString();
        this.f179834g = parcel.readString();
        this.f179835h = parcel.readString();
        this.f179836i = parcel.readString();
        this.f179837m = parcel.readString();
        this.f179838n = parcel.readString();
        this.f179839o = parcel.readInt();
        this.f179840p = parcel.readString();
        this.f179831d = parcel.readString();
        this.f179832e = parcel.readString();
        this.f179846v = parcel.readInt();
        this.f179842r = parcel.readString();
        this.f179843s = parcel.readInt();
        this.f179844t = parcel.readString();
        this.f179847w = parcel.readInt();
    }
}
