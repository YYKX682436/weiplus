package oj;

/* loaded from: classes11.dex */
public final class v implements android.os.Parcelable.Creator {
    public v(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        java.lang.String str = readString != null ? readString : "default";
        java.lang.String readString2 = parcel.readString();
        byte b17 = (byte) 0;
        return new com.tencent.matrix.util.ProcessInfo(readInt, str, readString2 != null ? readString2 : "default", parcel.readByte() != b17, parcel.readByte() != b17);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.util.ProcessInfo[i17];
    }
}
