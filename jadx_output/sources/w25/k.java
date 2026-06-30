package w25;

/* loaded from: classes12.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.pluginsdk.location.LocationIntent locationIntent = new com.tencent.mm.pluginsdk.location.LocationIntent();
        locationIntent.f188737d = parcel.readDouble();
        locationIntent.f188738e = parcel.readDouble();
        locationIntent.f188739f = parcel.readInt();
        locationIntent.f188740g = parcel.readString();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (readString == null) {
            readString = "";
        }
        locationIntent.f188741h = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        locationIntent.f188742i = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        locationIntent.f188743m = readString3;
        locationIntent.f188744n = parcel.readInt();
        locationIntent.f188745o = (com.tencent.mm.modelgeo.Addr) parcel.readParcelable(com.tencent.mm.modelgeo.Addr.class.getClassLoader());
        java.lang.String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        locationIntent.f188746p = readString4;
        locationIntent.f188747q = parcel.readInt() == 1;
        locationIntent.f188748r = parcel.readString();
        locationIntent.f188749s = parcel.readString();
        locationIntent.f188750t = parcel.readString();
        locationIntent.f188751u = parcel.readFloat();
        locationIntent.f188752v = parcel.readString();
        java.lang.String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        locationIntent.f188753w = readString5;
        java.lang.String readString6 = parcel.readString();
        locationIntent.f188754x = readString6 != null ? readString6 : "";
        return locationIntent;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.pluginsdk.location.LocationIntent[i17];
    }
}
