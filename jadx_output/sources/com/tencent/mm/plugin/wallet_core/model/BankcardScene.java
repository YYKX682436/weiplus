package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class BankcardScene extends dm.zb implements android.os.Parcelable {
    public final java.lang.String M2;
    public final java.lang.String N2;
    public final java.lang.String O2;
    public final java.lang.String P2;
    public final java.lang.String Q2;
    public final java.lang.String R2;
    public final double S2;
    public final java.lang.String T2;
    public final double U2;
    public final java.lang.String V2;
    public final java.lang.String W2;
    public final java.lang.String X2;
    public final java.lang.String Y2;
    public final java.lang.String Z2;

    /* renamed from: a3, reason: collision with root package name */
    public final at4.f f179589a3;

    /* renamed from: b3, reason: collision with root package name */
    public final int f179590b3;

    /* renamed from: c3, reason: collision with root package name */
    public final java.lang.String f179591c3;

    /* renamed from: d3, reason: collision with root package name */
    public final boolean f179592d3;

    /* renamed from: e3, reason: collision with root package name */
    public final at4.k f179593e3;

    /* renamed from: f3, reason: collision with root package name */
    public final long f179594f3;

    /* renamed from: g3, reason: collision with root package name */
    public final long f179595g3;

    /* renamed from: h3, reason: collision with root package name */
    public final long f179596h3;

    /* renamed from: i3, reason: collision with root package name */
    public final java.lang.String f179597i3;

    /* renamed from: j3, reason: collision with root package name */
    public final int f179598j3;

    /* renamed from: k3, reason: collision with root package name */
    public final int f179599k3;

    /* renamed from: l3, reason: collision with root package name */
    public final java.lang.String f179600l3;

    /* renamed from: m3, reason: collision with root package name */
    public final java.lang.String f179601m3;

    /* renamed from: n3, reason: collision with root package name */
    public final int f179602n3;

    /* renamed from: o3, reason: collision with root package name */
    public final java.lang.String f179603o3;

    /* renamed from: p3, reason: collision with root package name */
    public final long f179604p3;

    /* renamed from: q3, reason: collision with root package name */
    public final java.lang.String f179605q3;

    /* renamed from: r3, reason: collision with root package name */
    public final java.lang.String f179606r3;

    /* renamed from: s3, reason: collision with root package name */
    public final java.lang.String f179607s3;

    /* renamed from: t3, reason: collision with root package name */
    public final java.lang.String f179608t3;

    /* renamed from: u3, reason: collision with root package name */
    public final java.lang.String f179609u3;

    /* renamed from: v3, reason: collision with root package name */
    public static final l75.e0 f179588v3 = dm.zb.initAutoDBInfo(com.tencent.mm.plugin.wallet_core.model.BankcardScene.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.BankcardScene> CREATOR = new at4.j();

    public BankcardScene() {
        this.R2 = null;
        this.f179591c3 = null;
        this.f179592d3 = false;
    }

    @Override // dm.zb, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
    }

    @Override // dm.zb, l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues convertTo = super.convertTo();
        convertTo.remove("fakePk");
        return convertTo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.zb, l75.f0
    public l75.e0 getDBInfo() {
        return f179588v3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_bankName);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_bankcardType);
        parcel.writeString(this.field_bindSerial);
        parcel.writeInt(this.field_cardType);
        parcel.writeInt(this.f179592d3 ? 1 : 0);
        parcel.writeString(this.field_mobile);
        parcel.writeDouble(this.field_onceQuotaKind);
        parcel.writeDouble(this.field_onceQuotaVirtual);
        parcel.writeDouble(this.field_dayQuotaKind);
        parcel.writeDouble(this.field_dayQuotaVirtual);
        parcel.writeString(this.field_bankcardTail);
        parcel.writeString(this.field_bankPhone);
        parcel.writeInt(this.field_bankcardTag);
        parcel.writeInt(this.field_bankcardState);
        parcel.writeString(this.R2);
        parcel.writeInt(this.f179590b3);
        parcel.writeString(this.f179591c3);
        parcel.writeInt(this.field_bankcardClientType);
        parcel.writeString(this.field_ext_msg);
        parcel.writeInt(this.field_support_micropay ? 1 : 0);
        parcel.writeString(this.field_arrive_type);
        parcel.writeDouble(this.field_fetch_charge_rate);
        parcel.writeDouble(this.field_full_fetch_charge_fee);
        parcel.writeString(this.field_no_micro_word);
        parcel.writeString(this.field_card_bottom_wording);
        parcel.writeString(this.f179597i3);
        parcel.writeLong(this.f179594f3);
        parcel.writeLong(this.f179596h3);
        parcel.writeLong(this.f179595g3);
        parcel.writeInt(this.f179598j3);
        parcel.writeInt(this.f179602n3);
        parcel.writeInt(this.f179599k3);
        parcel.writeString(this.f179600l3);
        parcel.writeString(this.f179601m3);
        parcel.writeString(this.f179603o3);
        parcel.writeLong(this.f179604p3);
        parcel.writeString(this.f179605q3);
        parcel.writeString(this.f179606r3);
        parcel.writeString(this.f179607s3);
        parcel.writeString(this.f179608t3);
        parcel.writeString(this.f179609u3);
    }

    public BankcardScene(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, double d17, java.lang.String str7, double d18, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, at4.f fVar, int i17, java.lang.String str13, boolean z17, at4.k kVar, long j17, long j18, long j19, java.lang.String str14, int i18, int i19, java.lang.String str15, java.lang.String str16, int i27, java.lang.String str17, long j27, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22) {
        this.R2 = null;
        this.f179591c3 = null;
        this.f179592d3 = false;
        this.M2 = str;
        this.N2 = str2;
        this.O2 = str3;
        this.P2 = str4;
        this.Q2 = str5;
        this.R2 = str6;
        this.S2 = d17;
        this.T2 = str7;
        this.U2 = d18;
        this.V2 = str8;
        this.W2 = str9;
        this.X2 = str10;
        this.Y2 = str11;
        this.Z2 = str12;
        this.f179589a3 = fVar;
        this.f179590b3 = i17;
        this.f179591c3 = str13;
        this.f179592d3 = z17;
        this.f179593e3 = kVar;
        this.f179594f3 = j17;
        this.f179595g3 = j18;
        this.f179596h3 = j19;
        this.f179597i3 = str14;
        this.f179598j3 = i18;
        this.f179599k3 = i19;
        this.f179600l3 = str15;
        this.f179601m3 = str16;
        this.f179602n3 = i27;
        this.f179603o3 = str17;
        this.f179604p3 = j27;
        this.f179605q3 = str18;
        this.f179606r3 = str19;
        this.f179607s3 = str20;
        this.f179608t3 = str21;
        this.f179609u3 = str22;
    }

    public BankcardScene(android.os.Parcel parcel) {
        this.R2 = null;
        this.f179591c3 = null;
        this.f179592d3 = false;
        this.field_bankName = parcel.readString();
        this.field_desc = parcel.readString();
        this.field_bankcardType = parcel.readString();
        this.field_bindSerial = parcel.readString();
        this.field_cardType = parcel.readInt();
        this.f179592d3 = parcel.readInt() == 1;
        this.field_mobile = parcel.readString();
        this.field_onceQuotaKind = parcel.readDouble();
        this.field_onceQuotaVirtual = parcel.readDouble();
        this.field_dayQuotaKind = parcel.readDouble();
        this.field_dayQuotaVirtual = parcel.readDouble();
        this.field_bankcardTail = parcel.readString();
        this.field_bankPhone = parcel.readString();
        this.field_bankcardTag = parcel.readInt();
        this.field_bankcardState = parcel.readInt();
        this.R2 = parcel.readString();
        this.f179590b3 = parcel.readInt();
        this.f179591c3 = parcel.readString();
        this.field_bankcardClientType = parcel.readInt();
        this.field_ext_msg = parcel.readString();
        this.field_support_micropay = parcel.readInt() == 1;
        this.field_arrive_type = parcel.readString();
        this.field_fetch_charge_rate = parcel.readDouble();
        this.field_full_fetch_charge_fee = parcel.readDouble();
        this.field_no_micro_word = parcel.readString();
        this.field_card_bottom_wording = parcel.readString();
        this.f179597i3 = parcel.readString();
        this.f179594f3 = parcel.readLong();
        this.f179596h3 = parcel.readLong();
        this.f179595g3 = parcel.readLong();
        this.f179598j3 = parcel.readInt();
        this.f179602n3 = parcel.readInt();
        this.f179599k3 = parcel.readInt();
        this.f179600l3 = parcel.readString();
        this.f179601m3 = parcel.readString();
        this.f179603o3 = parcel.readString();
        this.f179604p3 = parcel.readLong();
        this.f179605q3 = parcel.readString();
        this.f179606r3 = parcel.readString();
        this.f179607s3 = parcel.readString();
        this.f179608t3 = parcel.readString();
        this.f179609u3 = parcel.readString();
    }
}
