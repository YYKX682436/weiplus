package tk0;

/* loaded from: classes8.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCDouble iPCDouble = new com.tencent.mm.ipcinvoker.type.IPCDouble();
        iPCDouble.f68402d = parcel.readDouble();
        return iPCDouble;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCDouble[i17];
    }
}
