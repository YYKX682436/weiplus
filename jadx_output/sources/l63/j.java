package l63;

/* loaded from: classes8.dex */
public final class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo[i17];
    }
}
