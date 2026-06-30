package nr0;

/* loaded from: classes13.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        return new com.tencent.mm.media.camera.CameraSupportInfo(readString, readInt, readInt2, readString2 != null ? readString2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.media.camera.CameraSupportInfo[i17];
    }
}
