package f35;

/* loaded from: classes15.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.pluginsdk.model.lbs.Location location = new com.tencent.mm.pluginsdk.model.lbs.Location();
        location.f189366d = parcel.readFloat();
        location.f189367e = parcel.readFloat();
        location.f189368f = parcel.readInt();
        location.f189369g = parcel.readInt();
        location.f189370h = parcel.readString();
        location.f189371i = parcel.readString();
        return location;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.pluginsdk.model.lbs.Location[i17];
    }
}
