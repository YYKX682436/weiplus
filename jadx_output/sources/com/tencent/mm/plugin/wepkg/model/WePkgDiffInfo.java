package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class WePkgDiffInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo> CREATOR = new com.tencent.mm.plugin.wepkg.model.n();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188335d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f188336e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188337f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188338g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f188339h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f188340i;

    /* renamed from: m, reason: collision with root package name */
    public int f188341m;

    /* renamed from: n, reason: collision with root package name */
    public int f188342n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188335d);
        parcel.writeString(this.f188336e);
        parcel.writeString(this.f188337f);
        parcel.writeString(this.f188338g);
        parcel.writeString(this.f188339h);
        parcel.writeString(this.f188340i);
        parcel.writeInt(this.f188341m);
        parcel.writeInt(this.f188342n);
    }
}
