package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
class Snack implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.widget.snackbar.Snack> CREATOR = new com.tencent.mm.ui.widget.snackbar.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f212451d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f212452e;

    /* renamed from: f, reason: collision with root package name */
    public final int f212453f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Parcelable f212454g;

    /* renamed from: h, reason: collision with root package name */
    public final int f212455h;

    /* renamed from: i, reason: collision with root package name */
    public final int f212456i;

    /* renamed from: m, reason: collision with root package name */
    public final int f212457m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f212458n;

    public Snack(java.lang.String str, java.lang.String str2, int i17, android.os.Parcelable parcelable, int i18, int i19, int i27, android.view.View view) {
        this.f212451d = str;
        this.f212452e = str2;
        this.f212453f = i17;
        this.f212454g = parcelable;
        this.f212455h = i18;
        this.f212456i = i19;
        this.f212457m = i27;
        this.f212458n = view;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f212451d);
        parcel.writeString(this.f212452e);
        parcel.writeInt(this.f212453f);
        parcel.writeParcelable(this.f212454g, 0);
        parcel.writeInt(this.f212455h);
        parcel.writeInt(this.f212456i);
        parcel.writeInt(this.f212457m);
    }

    public Snack(android.os.Parcel parcel) {
        this.f212451d = parcel.readString();
        this.f212452e = parcel.readString();
        this.f212453f = parcel.readInt();
        this.f212454g = parcel.readParcelable(parcel.getClass().getClassLoader());
        this.f212455h = (short) parcel.readInt();
        this.f212456i = parcel.readInt();
        this.f212457m = parcel.readInt();
    }
}
