package com.tencent.mm.pluginsdk.model.lbs;

/* loaded from: classes15.dex */
public class Location implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.model.lbs.Location> CREATOR = new f35.a();

    /* renamed from: d, reason: collision with root package name */
    public float f189366d;

    /* renamed from: e, reason: collision with root package name */
    public float f189367e;

    /* renamed from: f, reason: collision with root package name */
    public int f189368f;

    /* renamed from: g, reason: collision with root package name */
    public int f189369g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189370h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f189371i;

    public Location(float f17, float f18, int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f189366d = f17;
        this.f189367e = f18;
        this.f189368f = i17;
        this.f189369g = i18;
        this.f189370h = str;
        this.f189371i = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f189366d);
        parcel.writeFloat(this.f189367e);
        parcel.writeInt(this.f189368f);
        parcel.writeInt(this.f189369g);
        parcel.writeString(this.f189370h);
        parcel.writeString(this.f189371i);
    }
}
