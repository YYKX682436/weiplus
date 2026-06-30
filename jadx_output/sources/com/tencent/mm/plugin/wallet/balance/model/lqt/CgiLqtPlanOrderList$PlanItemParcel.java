package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class CgiLqtPlanOrderList$PlanItemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel> CREATOR = new com.tencent.mm.plugin.wallet.balance.model.lqt.t();

    /* renamed from: d, reason: collision with root package name */
    public int f177603d;

    /* renamed from: e, reason: collision with root package name */
    public long f177604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177606g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel f177607h;

    /* renamed from: i, reason: collision with root package name */
    public int f177608i;

    /* renamed from: m, reason: collision with root package name */
    public int f177609m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f177610n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f177611o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f177612p;

    public CgiLqtPlanOrderList$PlanItemParcel(android.os.Parcel parcel) {
        this.f177603d = parcel.readInt();
        this.f177604e = parcel.readLong();
        this.f177605f = parcel.readString();
        this.f177606g = parcel.readString();
        this.f177607h = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel) parcel.readParcelable(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel.class.getClassLoader());
        this.f177608i = parcel.readInt();
        this.f177609m = parcel.readInt();
        this.f177610n = parcel.readString();
        this.f177611o = parcel.readString();
        this.f177612p = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f177603d);
        parcel.writeLong(this.f177604e);
        parcel.writeString(this.f177605f);
        parcel.writeString(this.f177606g);
        parcel.writeParcelable(this.f177607h, i17);
        parcel.writeInt(this.f177608i);
        parcel.writeInt(this.f177609m);
        parcel.writeString(this.f177610n);
        parcel.writeString(this.f177611o);
        parcel.writeString(this.f177612p);
    }
}
