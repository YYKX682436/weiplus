package tk0;

/* loaded from: classes.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = new com.tencent.mm.ipcinvoker.type.IPCString();
        iPCString.f68406d = parcel.readString();
        return iPCString;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ipcinvoker.type.IPCString[i17];
    }
}
