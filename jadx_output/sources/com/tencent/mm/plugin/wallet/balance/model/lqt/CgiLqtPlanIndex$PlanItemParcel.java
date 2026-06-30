package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
class CgiLqtPlanIndex$PlanItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.p();

    /* renamed from: d, reason: collision with root package name */
    public int f177584d;

    /* renamed from: e, reason: collision with root package name */
    public long f177585e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177586f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177587g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177588h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177589i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel f177590m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel f177591n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel f177592o;

    /* renamed from: p, reason: collision with root package name */
    public int f177593p;

    /* renamed from: q, reason: collision with root package name */
    public int f177594q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f177595r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f177596s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f177597t;

    public CgiLqtPlanIndex$PlanItemParcel(android.os.Parcel parcel) {
        this.f177584d = parcel.readInt();
        this.f177585e = parcel.readLong();
        this.f177586f = parcel.readString();
        this.f177587g = parcel.readString();
        this.f177588h = parcel.readString();
        this.f177589i = parcel.readString();
        this.f177590m = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel) parcel.readParcelable(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel.class.getClassLoader());
        this.f177591n = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel) parcel.readParcelable(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel.class.getClassLoader());
        this.f177592o = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel) parcel.readParcelable(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel.class.getClassLoader());
        this.f177593p = parcel.readInt();
        this.f177594q = parcel.readInt();
        this.f177595r = parcel.readString();
        this.f177596s = parcel.readString();
        this.f177597t = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f177584d);
        parcel.writeLong(this.f177585e);
        parcel.writeString(this.f177586f);
        parcel.writeString(this.f177587g);
        parcel.writeString(this.f177588h);
        parcel.writeString(this.f177589i);
        parcel.writeParcelable(this.f177590m, i17);
        parcel.writeParcelable(this.f177591n, i17);
        parcel.writeParcelable(this.f177592o, i17);
        parcel.writeInt(this.f177593p);
        parcel.writeInt(this.f177594q);
        parcel.writeString(this.f177595r);
        parcel.writeString(this.f177596s);
        parcel.writeString(this.f177597t);
    }
}
