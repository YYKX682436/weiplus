package oj;

/* loaded from: classes11.dex */
public final class u implements android.os.Parcelable.Creator {
    public u(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.matrix.util.NativeMemInfo(parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.util.NativeMemInfo[i17];
    }
}
