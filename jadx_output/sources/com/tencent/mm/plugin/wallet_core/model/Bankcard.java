package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class Bankcard extends dm.yb implements android.os.Parcelable {
    public static final l75.e0 A3 = dm.yb.initAutoDBInfo(com.tencent.mm.plugin.wallet_core.model.Bankcard.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.Bankcard> CREATOR = new at4.h();
    public java.lang.String I2;
    public java.lang.String J2;
    public final java.lang.String K2;
    public final java.lang.String L2;
    public java.lang.String M2;
    public java.lang.String N2;
    public double O2;
    public java.lang.String P2;
    public double Q2;
    public java.lang.String R2;
    public java.lang.String S2;
    public java.lang.String T2;
    public java.lang.String U2;
    public java.lang.String V2;
    public final at4.f W2;
    public int X2;
    public java.lang.String Y2;
    public boolean Z2;

    /* renamed from: a3, reason: collision with root package name */
    public at4.k f179562a3;

    /* renamed from: b3, reason: collision with root package name */
    public long f179563b3;

    /* renamed from: c3, reason: collision with root package name */
    public long f179564c3;

    /* renamed from: d3, reason: collision with root package name */
    public long f179565d3;

    /* renamed from: e3, reason: collision with root package name */
    public java.lang.String f179566e3;

    /* renamed from: f3, reason: collision with root package name */
    public int f179567f3;

    /* renamed from: g3, reason: collision with root package name */
    public int f179568g3;

    /* renamed from: h3, reason: collision with root package name */
    public java.lang.String f179569h3;

    /* renamed from: i3, reason: collision with root package name */
    public java.lang.String f179570i3;

    /* renamed from: j3, reason: collision with root package name */
    public int f179571j3;

    /* renamed from: k3, reason: collision with root package name */
    public java.lang.String f179572k3;

    /* renamed from: l3, reason: collision with root package name */
    public long f179573l3;

    /* renamed from: m3, reason: collision with root package name */
    public java.lang.String f179574m3;

    /* renamed from: n3, reason: collision with root package name */
    public java.lang.String f179575n3;

    /* renamed from: o3, reason: collision with root package name */
    public java.lang.String f179576o3;

    /* renamed from: p3, reason: collision with root package name */
    public java.lang.String f179577p3;

    /* renamed from: q3, reason: collision with root package name */
    public java.lang.String f179578q3;

    /* renamed from: r3, reason: collision with root package name */
    public java.lang.String f179579r3;

    /* renamed from: s3, reason: collision with root package name */
    public java.lang.String f179580s3;

    /* renamed from: t3, reason: collision with root package name */
    public java.lang.String f179581t3;

    /* renamed from: u3, reason: collision with root package name */
    public java.util.ArrayList f179582u3;

    /* renamed from: v3, reason: collision with root package name */
    public java.lang.String f179583v3;

    /* renamed from: w3, reason: collision with root package name */
    public java.lang.String f179584w3;

    /* renamed from: x3, reason: collision with root package name */
    public int f179585x3;

    /* renamed from: y3, reason: collision with root package name */
    public java.lang.String f179586y3;

    /* renamed from: z3, reason: collision with root package name */
    public java.util.ArrayList f179587z3;

    public Bankcard() {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f179582u3 = new java.util.ArrayList();
        this.f179587z3 = new java.util.ArrayList();
    }

    public static java.lang.String u0(android.content.Context context, int i17) {
        switch (i17) {
            case 1:
                return context.getString(com.tencent.mm.R.string.f493593kv5);
            case 2:
                return context.getString(com.tencent.mm.R.string.kva);
            case 3:
                return context.getString(com.tencent.mm.R.string.kvf);
            case 4:
                return context.getString(com.tencent.mm.R.string.kv7);
            case 5:
                return context.getString(com.tencent.mm.R.string.f493591kv3);
            case 6:
                return context.getString(com.tencent.mm.R.string.kv9);
            case 7:
                return context.getString(com.tencent.mm.R.string.kvd);
            default:
                return context.getString(com.tencent.mm.R.string.kvb);
        }
    }

    public boolean A0() {
        return (this.field_cardType & 128) > 0;
    }

    public boolean D0() {
        return (this.field_cardType & 64) > 0;
    }

    public boolean F0() {
        return (this.field_cardType & 4) > 0;
    }

    @Override // dm.yb, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.yb, l75.f0
    public l75.e0 getDBInfo() {
        return A3;
    }

    public int t0(int i17, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        int i18 = this.field_bankcardState;
        if (i18 != 0) {
            return i18;
        }
        if (orders == null || !orders.f179675e.equals(this.N2)) {
            return !((i17 & this.field_bankcardTag) > 0) ? y0() ? 5 : 6 : (orders == null || orders.H.isEmpty() || orders.H.contains(this.field_bankcardType)) ? 0 : 7;
        }
        return 4;
    }

    public boolean v0() {
        return (this.field_cardType & 8) > 0;
    }

    public boolean w0() {
        return (this.field_cardType & 2) > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_bankName);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_bankcardType);
        parcel.writeString(this.field_bindSerial);
        parcel.writeInt(this.field_defaultCardState);
        parcel.writeInt(this.field_cardType);
        parcel.writeInt(this.Z2 ? 1 : 0);
        parcel.writeString(this.field_mobile);
        parcel.writeDouble(this.field_onceQuotaKind);
        parcel.writeDouble(this.field_onceQuotaVirtual);
        parcel.writeDouble(this.field_dayQuotaKind);
        parcel.writeDouble(this.field_dayQuotaVirtual);
        parcel.writeString(this.field_bankcardTail);
        parcel.writeString(this.field_bankPhone);
        parcel.writeInt(this.field_bankcardTag);
        parcel.writeInt(this.field_bankcardState);
        parcel.writeString(this.N2);
        parcel.writeInt(this.X2);
        parcel.writeString(this.Y2);
        parcel.writeInt(this.field_bankcardClientType);
        parcel.writeString(this.field_ext_msg);
        parcel.writeInt(this.field_support_micropay ? 1 : 0);
        parcel.writeString(this.field_arrive_type);
        parcel.writeDouble(this.field_fetch_charge_rate);
        parcel.writeDouble(this.field_full_fetch_charge_fee);
        parcel.writeString(this.field_no_micro_word);
        parcel.writeString(this.field_card_bottom_wording);
        parcel.writeString(this.f179566e3);
        parcel.writeLong(this.f179563b3);
        parcel.writeLong(this.f179565d3);
        parcel.writeLong(this.f179564c3);
        parcel.writeInt(this.f179567f3);
        parcel.writeInt(this.f179571j3);
        parcel.writeInt(this.f179568g3);
        parcel.writeString(this.f179569h3);
        parcel.writeString(this.f179570i3);
        parcel.writeString(this.f179572k3);
        parcel.writeLong(this.f179573l3);
        parcel.writeString(this.f179574m3);
        parcel.writeString(this.f179575n3);
        parcel.writeString(this.f179576o3);
        parcel.writeString(this.f179577p3);
        parcel.writeString(this.f179578q3);
        parcel.writeString(this.f179579r3);
        parcel.writeString(this.f179580s3);
        parcel.writeString(this.f179581t3);
        parcel.writeStringList(this.f179582u3);
        parcel.writeString(this.f179583v3);
        parcel.writeString(this.f179584w3);
        parcel.writeInt(this.f179585x3);
        parcel.writeString(this.f179586y3);
        parcel.writeStringList(this.f179587z3);
    }

    public boolean y0() {
        return (this.field_cardType & 1) <= 0;
    }

    public boolean z0() {
        return (this.field_cardType & 256) > 0;
    }

    public Bankcard(int i17) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f179582u3 = new java.util.ArrayList();
        this.f179587z3 = new java.util.ArrayList();
        this.field_bankcardTag = i17;
    }

    public Bankcard(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, double d17, java.lang.String str7, double d18, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, at4.f fVar, int i17, java.lang.String str13, boolean z17, at4.k kVar, long j17, long j18, long j19, java.lang.String str14, int i18, int i19, java.lang.String str15, java.lang.String str16, int i27, java.lang.String str17, long j27, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, java.lang.String str22) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f179582u3 = new java.util.ArrayList();
        this.f179587z3 = new java.util.ArrayList();
        this.I2 = str;
        this.J2 = str2;
        this.K2 = str3;
        this.L2 = str4;
        this.M2 = str5;
        this.N2 = str6;
        this.O2 = d17;
        this.P2 = str7;
        this.Q2 = d18;
        this.R2 = str8;
        this.S2 = str9;
        this.T2 = str10;
        this.U2 = str11;
        this.V2 = str12;
        this.W2 = fVar;
        this.X2 = i17;
        this.Y2 = str13;
        this.Z2 = z17;
        this.f179562a3 = kVar;
        this.f179563b3 = j17;
        this.f179564c3 = j18;
        this.f179565d3 = j19;
        this.f179566e3 = str14;
        this.f179567f3 = i18;
        this.f179568g3 = i19;
        this.f179569h3 = str15;
        this.f179570i3 = str16;
        this.f179571j3 = i27;
        this.f179572k3 = str17;
        this.f179573l3 = j27;
        this.f179574m3 = str18;
        this.f179575n3 = str19;
        this.f179576o3 = str20;
        this.f179577p3 = str21;
        this.f179578q3 = str22;
    }

    public Bankcard(android.os.Parcel parcel) {
        this.N2 = null;
        this.Y2 = null;
        this.Z2 = false;
        this.f179582u3 = new java.util.ArrayList();
        this.f179587z3 = new java.util.ArrayList();
        this.field_bankName = parcel.readString();
        this.field_desc = parcel.readString();
        this.field_bankcardType = parcel.readString();
        this.field_bindSerial = parcel.readString();
        this.field_defaultCardState = parcel.readInt();
        this.field_cardType = parcel.readInt();
        this.Z2 = parcel.readInt() == 1;
        this.field_mobile = parcel.readString();
        this.field_onceQuotaKind = parcel.readDouble();
        this.field_onceQuotaVirtual = parcel.readDouble();
        this.field_dayQuotaKind = parcel.readDouble();
        this.field_dayQuotaVirtual = parcel.readDouble();
        this.field_bankcardTail = parcel.readString();
        this.field_bankPhone = parcel.readString();
        this.field_bankcardTag = parcel.readInt();
        this.field_bankcardState = parcel.readInt();
        this.N2 = parcel.readString();
        this.X2 = parcel.readInt();
        this.Y2 = parcel.readString();
        this.field_bankcardClientType = parcel.readInt();
        this.field_ext_msg = parcel.readString();
        this.field_support_micropay = parcel.readInt() == 1;
        this.field_arrive_type = parcel.readString();
        this.field_fetch_charge_rate = parcel.readDouble();
        this.field_full_fetch_charge_fee = parcel.readDouble();
        this.field_no_micro_word = parcel.readString();
        this.field_card_bottom_wording = parcel.readString();
        this.f179566e3 = parcel.readString();
        this.f179563b3 = parcel.readLong();
        this.f179565d3 = parcel.readLong();
        this.f179564c3 = parcel.readLong();
        this.f179567f3 = parcel.readInt();
        this.f179571j3 = parcel.readInt();
        this.f179568g3 = parcel.readInt();
        this.f179569h3 = parcel.readString();
        this.f179570i3 = parcel.readString();
        this.f179572k3 = parcel.readString();
        this.f179573l3 = parcel.readLong();
        this.f179574m3 = parcel.readString();
        this.f179575n3 = parcel.readString();
        this.f179576o3 = parcel.readString();
        this.f179577p3 = parcel.readString();
        this.f179578q3 = parcel.readString();
        this.f179579r3 = parcel.readString();
        this.f179580s3 = parcel.readString();
        this.f179581t3 = parcel.readString();
        parcel.readStringList(this.f179582u3);
        this.f179583v3 = parcel.readString();
        this.f179584w3 = parcel.readString();
        this.f179585x3 = parcel.readInt();
        this.f179586y3 = parcel.readString();
        parcel.readStringList(this.f179587z3);
    }
}
