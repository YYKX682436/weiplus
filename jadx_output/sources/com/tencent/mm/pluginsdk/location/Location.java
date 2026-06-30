package com.tencent.mm.pluginsdk.location;

/* loaded from: classes5.dex */
public class Location implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.location.Location> CREATOR = new w25.j();

    /* renamed from: d, reason: collision with root package name */
    public final float f188735d;

    /* renamed from: e, reason: collision with root package name */
    public final float f188736e;

    public Location(float f17, float f18) {
        this.f188735d = f17;
        this.f188736e = f18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f188735d);
        parcel.writeFloat(this.f188736e);
    }

    public Location(android.os.Parcel parcel) {
        this.f188735d = parcel.readFloat();
        this.f188736e = parcel.readFloat();
    }
}
