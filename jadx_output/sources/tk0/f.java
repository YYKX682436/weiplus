package tk0;

/* loaded from: classes.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = new com.tencent.mm.ipcinvoker.type.IPCLong();
        iPCLong.f68405d = parcel.readLong();
        return iPCLong;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCLong[i17];
    }
}
