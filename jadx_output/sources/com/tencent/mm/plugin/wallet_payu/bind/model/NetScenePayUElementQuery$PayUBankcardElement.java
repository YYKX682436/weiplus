package com.tencent.mm.plugin.wallet_payu.bind.model;

/* loaded from: classes9.dex */
public class NetScenePayUElementQuery$PayUBankcardElement implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181228d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181229e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181230f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181231g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181232h = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f181228d);
        parcel.writeString(this.f181229e);
        parcel.writeString(this.f181230f);
        parcel.writeString(this.f181231g);
        parcel.writeString(this.f181232h);
    }
}
