package com.tencent.mm.plugin.game.luggage.api;

/* loaded from: classes15.dex */
public class GameAtSomeoneConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig> CREATOR = new s43.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139509d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f139510e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f139511f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f139512g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139513h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f139514i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f139515m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f139516n;

    /* renamed from: o, reason: collision with root package name */
    public int f139517o;

    /* renamed from: p, reason: collision with root package name */
    public int f139518p;

    public GameAtSomeoneConfig() {
        this.f139510e = false;
        this.f139511f = false;
        this.f139512g = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f139509d);
        parcel.writeInt(this.f139510e ? 1 : 0);
        parcel.writeInt(this.f139511f ? 1 : 0);
        parcel.writeInt(this.f139512g ? 1 : 0);
        parcel.writeString(this.f139513h);
        parcel.writeString(this.f139514i);
        parcel.writeString(this.f139515m);
        parcel.writeString(this.f139516n);
        parcel.writeInt(this.f139517o);
        parcel.writeInt(this.f139518p);
    }

    public GameAtSomeoneConfig(android.os.Parcel parcel) {
        this.f139510e = false;
        this.f139511f = false;
        this.f139512g = false;
        this.f139509d = parcel.readString();
        this.f139510e = parcel.readInt() == 1;
        this.f139511f = parcel.readInt() == 1;
        this.f139512g = parcel.readInt() == 1;
        this.f139513h = parcel.readString();
        this.f139514i = parcel.readString();
        this.f139515m = parcel.readString();
        this.f139516n = parcel.readString();
        this.f139517o = parcel.readInt();
        this.f139518p = parcel.readInt();
    }
}
