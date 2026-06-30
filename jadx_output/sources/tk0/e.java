package tk0;

/* loaded from: classes.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = new com.tencent.mm.ipcinvoker.type.IPCInteger();
        iPCInteger.f68404d = parcel.readInt();
        return iPCInteger;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCInteger[i17];
    }
}
