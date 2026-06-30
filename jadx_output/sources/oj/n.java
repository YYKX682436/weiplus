package oj;

/* loaded from: classes11.dex */
public final class n implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.matrix.util.MemInfo memInfo = new com.tencent.matrix.util.MemInfo((com.tencent.matrix.util.ProcessInfo) parcel.readParcelable(com.tencent.matrix.util.ProcessInfo.class.getClassLoader()), (com.tencent.matrix.util.StatusInfo) parcel.readParcelable(com.tencent.matrix.util.StatusInfo.class.getClassLoader()), (com.tencent.matrix.util.JavaMemInfo) parcel.readParcelable(com.tencent.matrix.util.JavaMemInfo.class.getClassLoader()), (com.tencent.matrix.util.NativeMemInfo) parcel.readParcelable(com.tencent.matrix.util.NativeMemInfo.class.getClassLoader()), (com.tencent.matrix.util.SystemInfo) parcel.readParcelable(com.tencent.matrix.util.SystemInfo.class.getClassLoader()), (com.tencent.matrix.util.PssInfo) parcel.readParcelable(com.tencent.matrix.util.PssInfo.class.getClassLoader()), (com.tencent.matrix.util.PssInfo) parcel.readParcelable(com.tencent.matrix.util.PssInfo.class.getClassLoader()), null);
        memInfo.f53096d = parcel.readLong();
        return memInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.util.MemInfo[i17];
    }
}
