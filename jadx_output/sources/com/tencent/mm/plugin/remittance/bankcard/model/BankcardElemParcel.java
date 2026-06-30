package com.tencent.mm.plugin.remittance.bankcard.model;

/* loaded from: classes9.dex */
public class BankcardElemParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel> CREATOR = new pw3.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156454d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156456f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156457g;

    /* renamed from: h, reason: collision with root package name */
    public final int f156458h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f156459i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156460m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f156461n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f156462o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f156463p;

    /* renamed from: q, reason: collision with root package name */
    public final long f156464q;

    public BankcardElemParcel(r45.qd qdVar) {
        this.f156454d = qdVar.f383838d;
        this.f156455e = qdVar.f383839e;
        this.f156456f = qdVar.f383840f;
        this.f156457g = qdVar.f383841g;
        this.f156458h = qdVar.f383842h;
        this.f156459i = qdVar.f383844m;
        this.f156460m = qdVar.f383845n;
        this.f156461n = qdVar.f383846o;
        this.f156462o = new java.util.ArrayList();
        java.util.Iterator it = qdVar.f383843i.iterator();
        while (it.hasNext()) {
            this.f156462o.add(new com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel((r45.dl0) it.next()));
        }
        this.f156463p = qdVar.f383848q;
        this.f156464q = qdVar.f383849r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156454d);
        parcel.writeString(this.f156455e);
        parcel.writeString(this.f156456f);
        parcel.writeInt(this.f156457g);
        parcel.writeInt(this.f156458h);
        parcel.writeTypedList(this.f156462o);
        parcel.writeString(this.f156459i);
        parcel.writeString(this.f156460m);
        parcel.writeString(this.f156461n);
        parcel.writeString(this.f156463p);
        parcel.writeLong(this.f156464q);
    }

    public BankcardElemParcel(android.os.Parcel parcel) {
        this.f156454d = parcel.readString();
        this.f156455e = parcel.readString();
        this.f156456f = parcel.readString();
        this.f156457g = parcel.readInt();
        this.f156458h = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f156462o = arrayList;
        parcel.readTypedList(arrayList, com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel.CREATOR);
        this.f156459i = parcel.readString();
        this.f156460m = parcel.readString();
        this.f156461n = parcel.readString();
        this.f156463p = parcel.readString();
        this.f156464q = parcel.readLong();
    }
}
