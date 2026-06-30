package com.tencent.mm.plugin.wallet.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/api/LuckyMoneyNewYearStateInfo;", "Landroid/os/Parcelable;", "CREATOR", "pr4/d", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LuckyMoneyNewYearStateInfo implements android.os.Parcelable {
    public static final pr4.d CREATOR = new pr4.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f177555d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f177556e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f177557f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f177558g;

    /* renamed from: h, reason: collision with root package name */
    public long f177559h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177561m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f177562n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f177563o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f177564p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f177565q;

    /* renamed from: r, reason: collision with root package name */
    public final int f177566r;

    /* renamed from: s, reason: collision with root package name */
    public final int f177567s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f177568t;

    public LuckyMoneyNewYearStateInfo() {
        this.f177555d = "";
        this.f177556e = "";
        this.f177560i = "";
        this.f177561m = "";
        this.f177563o = "";
        this.f177564p = "";
        this.f177565q = "";
        this.f177568t = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f177555d);
        parcel.writeString(this.f177556e);
        parcel.writeByte(this.f177557f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f177558g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f177559h);
        parcel.writeString(this.f177560i);
        parcel.writeString(this.f177561m);
        parcel.writeByte(this.f177562n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f177563o);
        parcel.writeString(this.f177564p);
        parcel.writeString(this.f177565q);
        parcel.writeInt(this.f177566r);
        parcel.writeInt(this.f177567s);
        parcel.writeString(this.f177568t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyMoneyNewYearStateInfo(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f177555d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f177556e = readString2 == null ? "" : readString2;
        this.f177557f = parcel.readByte() != 0;
        this.f177558g = parcel.readByte() != 0;
        this.f177559h = parcel.readLong();
        java.lang.String readString3 = parcel.readString();
        this.f177560i = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f177561m = readString4 == null ? "" : readString4;
        this.f177562n = parcel.readByte() != 0;
        java.lang.String readString5 = parcel.readString();
        this.f177563o = readString5 == null ? "" : readString5;
        java.lang.String readString6 = parcel.readString();
        this.f177564p = readString6 == null ? "" : readString6;
        java.lang.String readString7 = parcel.readString();
        this.f177565q = readString7 == null ? "" : readString7;
        this.f177566r = parcel.readInt();
        this.f177567s = parcel.readInt();
        java.lang.String readString8 = parcel.readString();
        this.f177568t = readString8 != null ? readString8 : "";
    }
}
