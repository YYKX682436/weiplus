package oj;

/* loaded from: classes11.dex */
public final class i0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.matrix.util.SystemInfo(parcel.readLong(), parcel.readLong(), parcel.readByte() != ((byte) 0), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.util.SystemInfo[i17];
    }
}
