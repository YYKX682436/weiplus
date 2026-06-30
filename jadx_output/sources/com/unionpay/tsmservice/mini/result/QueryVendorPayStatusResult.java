package com.unionpay.tsmservice.mini.result;

/* loaded from: classes13.dex */
public class QueryVendorPayStatusResult extends com.unionpay.tsmservice.mini.result.BaseResult {
    public static final android.os.Parcelable.Creator CREATOR = new com.unionpay.tsmservice.mini.result.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f220728d;

    public QueryVendorPayStatusResult(android.os.Parcel parcel) {
        this.f220728d = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeBundle(this.f220728d);
    }
}
