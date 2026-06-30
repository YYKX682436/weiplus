package com.tencent.mm.plugin.remittance.bankcard.model;

/* loaded from: classes9.dex */
public class TransferRecordParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel> CREATOR = new pw3.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156470d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156471e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156472f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156473g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156474h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f156475i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156476m;

    public TransferRecordParcel(r45.up6 up6Var) {
        this.f156470d = up6Var.f387553d;
        this.f156471e = up6Var.f387554e;
        this.f156472f = up6Var.f387555f;
        this.f156473g = up6Var.f387556g;
        this.f156474h = up6Var.f387557h;
        this.f156475i = up6Var.f387558i;
        this.f156476m = up6Var.f387559m;
    }

    public static java.util.ArrayList a(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel((r45.up6) it.next()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156470d);
        parcel.writeString(this.f156471e);
        parcel.writeString(this.f156472f);
        parcel.writeString(this.f156473g);
        parcel.writeString(this.f156474h);
        parcel.writeString(this.f156475i);
        parcel.writeString(this.f156476m);
    }

    public TransferRecordParcel(android.os.Parcel parcel) {
        this.f156470d = parcel.readString();
        this.f156471e = parcel.readString();
        this.f156472f = parcel.readString();
        this.f156473g = parcel.readString();
        this.f156474h = parcel.readString();
        this.f156475i = parcel.readString();
        this.f156476m = parcel.readString();
    }
}
