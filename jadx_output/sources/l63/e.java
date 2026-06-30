package l63;

/* loaded from: classes8.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamesharecard.GameShareCardInfo((com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo) parcel.readParcelable(com.tencent.mm.plugin.gamesharecard.GameShareCardInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamesharecard.GameShareCardInfo[i17];
    }
}
