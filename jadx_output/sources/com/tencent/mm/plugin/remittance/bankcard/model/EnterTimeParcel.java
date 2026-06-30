package com.tencent.mm.plugin.remittance.bankcard.model;

/* loaded from: classes9.dex */
public class EnterTimeParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel> CREATOR = new pw3.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f156465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156466e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156467f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156469h;

    public EnterTimeParcel(r45.dl0 dl0Var) {
        this.f156465d = dl0Var.f372546d;
        this.f156466e = dl0Var.f372547e;
        this.f156467f = dl0Var.f372548f;
        this.f156468g = dl0Var.f372549g;
        this.f156469h = dl0Var.f372550h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f156465d);
        parcel.writeString(this.f156466e);
        parcel.writeString(this.f156467f);
        parcel.writeInt(this.f156468g);
        parcel.writeString(this.f156469h);
    }

    public EnterTimeParcel(android.os.Parcel parcel) {
        this.f156465d = parcel.readInt();
        this.f156466e = parcel.readString();
        this.f156467f = parcel.readString();
        this.f156468g = parcel.readInt();
        this.f156469h = parcel.readString();
    }
}
