package z53;

/* loaded from: classes7.dex */
public final class b0 implements android.os.Parcelable.Creator {
    public b0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper[i17];
    }
}
