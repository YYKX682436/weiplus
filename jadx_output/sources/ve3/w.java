package ve3;

/* loaded from: classes7.dex */
public final class w implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readParcelable(com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData[i17];
    }
}
