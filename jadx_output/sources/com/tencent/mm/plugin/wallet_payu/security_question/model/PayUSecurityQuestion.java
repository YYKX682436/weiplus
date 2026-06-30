package com.tencent.mm.plugin.wallet_payu.security_question.model;

/* loaded from: classes9.dex */
public class PayUSecurityQuestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion> CREATOR = new zt4.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f181272d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f181273e;

    public PayUSecurityQuestion(java.lang.String str, java.lang.String str2) {
        this.f181272d = str;
        this.f181273e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f181272d);
        parcel.writeString(this.f181273e);
    }

    public PayUSecurityQuestion(android.os.Parcel parcel) {
        this.f181272d = parcel.readString();
        this.f181273e = parcel.readString();
    }
}
