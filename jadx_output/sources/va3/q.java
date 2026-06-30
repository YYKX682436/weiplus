package va3;

/* loaded from: classes15.dex */
public class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = new com.tencent.mm.plugin.location.model.LocationInfo();
        locationInfo.f144585d = parcel.readString();
        locationInfo.f144586e = parcel.readDouble();
        locationInfo.f144587f = parcel.readDouble();
        locationInfo.f144588g = parcel.readInt();
        locationInfo.f144589h = parcel.readString();
        locationInfo.f144590i = parcel.readString();
        locationInfo.f144591m = parcel.readString();
        locationInfo.f144592n = parcel.readString();
        locationInfo.f144593o = parcel.readInt();
        locationInfo.f144595q = parcel.readInt() == 1;
        locationInfo.f144596r = parcel.readString();
        locationInfo.f144597s = parcel.readString();
        locationInfo.f144598t = parcel.readString();
        locationInfo.f144599u = parcel.readFloat();
        locationInfo.f144600v = parcel.readString();
        locationInfo.f144601w = parcel.readString();
        return locationInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.location.model.LocationInfo[i17];
    }
}
