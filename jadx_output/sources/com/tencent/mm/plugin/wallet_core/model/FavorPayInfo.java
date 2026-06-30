package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class FavorPayInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.FavorPayInfo> CREATOR = new at4.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179667d;

    /* renamed from: e, reason: collision with root package name */
    public int f179668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179670g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179671h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f179672i;

    public FavorPayInfo() {
        this.f179672i = new java.util.LinkedList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.String.format("FavorPayInfo %s isNeedBankPay %s needBankType %s defaultFavorCompId %s changeBankcardTips %s", this.f179667d, java.lang.Integer.valueOf(this.f179668e), this.f179669f, this.f179670g, this.f179671h));
        if (this.f179672i != null) {
            stringBuffer.append("bind_serial_list :");
            java.util.Iterator it = this.f179672i.iterator();
            while (it.hasNext()) {
                stringBuffer.append(((java.lang.String) it.next()) + ",");
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179667d);
        parcel.writeInt(this.f179668e);
        parcel.writeString(this.f179669f);
        parcel.writeString(this.f179670g);
        parcel.writeString(this.f179671h);
        parcel.writeStringList(this.f179672i);
    }

    public FavorPayInfo(android.os.Parcel parcel) {
        this.f179672i = new java.util.LinkedList();
        this.f179667d = parcel.readString();
        this.f179668e = parcel.readInt();
        this.f179669f = parcel.readString();
        this.f179670g = parcel.readString();
        this.f179671h = parcel.readString();
        this.f179672i = parcel.createStringArrayList();
    }
}
