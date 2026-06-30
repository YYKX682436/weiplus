package com.tencent.mm.plugin.order.model;

/* loaded from: classes9.dex */
public class MallOrderDetailObject$HelpCenter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter> CREATOR = new dp3.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f152779f;

    public MallOrderDetailObject$HelpCenter(android.os.Parcel parcel) {
        this.f152777d = parcel.readString();
        this.f152778e = parcel.readString();
        this.f152779f = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f152777d);
        parcel.writeString(this.f152778e);
        parcel.writeByte(this.f152779f ? (byte) 1 : (byte) 0);
    }
}
