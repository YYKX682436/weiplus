package com.tencent.mm.plugin.wallet_core.model.mall;

/* loaded from: classes9.dex */
public class MallFunction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.mall.MallFunction> CREATOR = new bt4.b();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179821f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179822g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179823h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179824i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179825m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f179826n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.mall.MallNews f179827o;

    /* renamed from: p, reason: collision with root package name */
    public int f179828p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179829q;

    /* renamed from: r, reason: collision with root package name */
    public int f179830r;

    public MallFunction() {
        this.f179830r = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179819d);
        parcel.writeString(this.f179820e);
        parcel.writeString(this.f179821f);
        parcel.writeString(this.f179822g);
        parcel.writeString(this.f179823h);
        parcel.writeString(this.f179824i);
        parcel.writeString(this.f179825m);
        parcel.writeStringList(this.f179826n);
        parcel.writeParcelable(this.f179827o, i17);
        parcel.writeInt(this.f179828p);
        parcel.writeString(this.f179829q);
        parcel.writeInt(this.f179830r);
    }

    public MallFunction(android.os.Parcel parcel) {
        this.f179830r = 0;
        this.f179819d = parcel.readString();
        this.f179820e = parcel.readString();
        this.f179821f = parcel.readString();
        this.f179822g = parcel.readString();
        this.f179823h = parcel.readString();
        this.f179824i = parcel.readString();
        this.f179825m = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f179826n = arrayList;
        parcel.readStringList(arrayList);
        this.f179827o = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.model.mall.MallNews.class.getClassLoader());
        this.f179828p = parcel.readInt();
        this.f179829q = parcel.readString();
        this.f179830r = parcel.readInt();
    }
}
