package tk0;

/* loaded from: classes7.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCByte iPCByte = new com.tencent.mm.ipcinvoker.type.IPCByte();
        iPCByte.f68401d = parcel.readByte();
        return iPCByte;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCByte[i17];
    }
}
