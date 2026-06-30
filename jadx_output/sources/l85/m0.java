package l85;

/* loaded from: classes12.dex */
public abstract class m0 {
    public static java.lang.Object a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(android.os.Parcel parcel, android.os.Parcelable parcelable, int i17) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i17);
        }
    }
}
