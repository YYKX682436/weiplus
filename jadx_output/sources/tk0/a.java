package tk0;

/* loaded from: classes.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = new com.tencent.mm.ipcinvoker.type.IPCBoolean();
        iPCBoolean.f68400d = parcel.readInt() == 1;
        return iPCBoolean;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean[i17];
    }
}
