package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public class ITenpaySave$RetryPayInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo> CREATOR = new com.tencent.mm.wallet_core.tenpay.model.b();

    /* renamed from: d, reason: collision with root package name */
    public int f214044d;

    /* renamed from: e, reason: collision with root package name */
    public int f214045e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f214046f;

    public ITenpaySave$RetryPayInfo() {
        this.f214044d = -1;
        this.f214045e = -1;
        this.f214046f = "";
    }

    public void a(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("retry_pay_info")) == null) {
            return;
        }
        this.f214044d = optJSONObject.optInt("retry_interval", -1);
        this.f214045e = optJSONObject.optInt("max_retry_count", -1);
        this.f214046f = optJSONObject.optString("retry_fail_wording", "");
    }

    public boolean b() {
        return (this.f214044d == -1 || this.f214045e == -1) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f214044d);
        parcel.writeInt(this.f214045e);
        parcel.writeString(this.f214046f);
    }

    public ITenpaySave$RetryPayInfo(android.os.Parcel parcel) {
        this.f214044d = parcel.readInt();
        this.f214045e = parcel.readInt();
        this.f214046f = parcel.readString();
    }
}
