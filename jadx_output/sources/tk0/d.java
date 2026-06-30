package tk0;

/* loaded from: classes8.dex */
public class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCFloat iPCFloat = new com.tencent.mm.ipcinvoker.type.IPCFloat();
        iPCFloat.f68403d = parcel.readFloat();
        return iPCFloat;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCFloat[i17];
    }
}
