package com.tencent.mm.plugin.honey_pay.model;

/* loaded from: classes9.dex */
public class HoneyPayCardType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType> CREATOR = new u73.a();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f142259d;

    public HoneyPayCardType(r45.av3 av3Var) {
        try {
            this.f142259d = av3Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HoneyPayCardType", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f142259d;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public HoneyPayCardType(android.os.Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f142259d = bArr;
        parcel.readByteArray(bArr);
    }
}
