package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class CgiLqtPlanIndex$PlanIndexParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.o();

    /* renamed from: d, reason: collision with root package name */
    public int f177576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177577e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f177578f;

    /* renamed from: g, reason: collision with root package name */
    public long f177579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177580h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel f177581i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177582m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f177583n;

    public CgiLqtPlanIndex$PlanIndexParcel() {
        this.f177578f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f177576d);
        parcel.writeString(this.f177577e);
        parcel.writeList(this.f177578f);
        parcel.writeLong(this.f177579g);
        parcel.writeString(this.f177580h);
        parcel.writeParcelable(this.f177581i, i17);
        parcel.writeString(this.f177582m);
        parcel.writeString(this.f177583n);
    }

    public CgiLqtPlanIndex$PlanIndexParcel(android.os.Parcel parcel) {
        this.f177578f = new java.util.ArrayList();
        this.f177576d = parcel.readInt();
        this.f177577e = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f177578f = arrayList;
        parcel.readList(arrayList, com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel.class.getClassLoader());
        this.f177579g = parcel.readLong();
        this.f177580h = parcel.readString();
        this.f177581i = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel) parcel.readParcelable(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel.class.getClassLoader());
        this.f177582m = parcel.readString();
        this.f177583n = parcel.readString();
    }
}
