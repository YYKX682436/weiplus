package tu4;

/* loaded from: classes.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Boolean valueOf;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.Integer valueOf2 = parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt());
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = java.lang.Boolean.valueOf(parcel.readInt() != 0);
        }
        return new com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo(valueOf2, readString, readString2, valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? java.lang.Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo[i17];
    }
}
