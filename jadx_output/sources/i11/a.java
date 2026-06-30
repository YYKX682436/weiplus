package i11;

/* loaded from: classes15.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.modelgeo.Addr addr = new com.tencent.mm.modelgeo.Addr();
        addr.f71211d = parcel.readString();
        addr.f71212e = parcel.readString();
        addr.f71213f = parcel.readString();
        addr.f71214g = parcel.readString();
        addr.f71215h = parcel.readString();
        addr.f71216i = parcel.readString();
        addr.f71217m = parcel.readString();
        addr.f71218n = parcel.readString();
        addr.f71219o = parcel.readString();
        addr.f71220p = parcel.readString();
        addr.f71221q = parcel.readString();
        addr.f71222r = parcel.readString();
        addr.f71224t = parcel.readFloat();
        addr.f71225u = parcel.readFloat();
        addr.f71226v = parcel.readString();
        addr.f71228x = parcel.readString();
        addr.f71230z = parcel.readString();
        addr.B = parcel.readString();
        return addr;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.modelgeo.Addr[i17];
    }
}
