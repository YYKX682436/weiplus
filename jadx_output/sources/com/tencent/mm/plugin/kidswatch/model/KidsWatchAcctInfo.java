package com.tencent.mm.plugin.kidswatch.model;

/* loaded from: classes14.dex */
public class KidsWatchAcctInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo> CREATOR = new x83.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f143097d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f143098e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f143099f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f143100g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f143101h;

    public KidsWatchAcctInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        this.f143097d = i17;
        this.f143100g = str;
        this.f143098e = str2;
        this.f143101h = str4;
        this.f143099f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f143097d);
        parcel.writeString(this.f143100g);
        parcel.writeString(this.f143098e);
        parcel.writeString(this.f143101h);
        parcel.writeString(this.f143099f);
    }

    public KidsWatchAcctInfo(android.os.Parcel parcel) {
        this.f143097d = parcel.readInt();
        this.f143100g = parcel.readString();
        this.f143098e = parcel.readString();
        this.f143101h = parcel.readString();
        this.f143099f = parcel.readString();
    }
}
