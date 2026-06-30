package kh;

/* loaded from: classes11.dex */
public final class w1 implements android.os.Parcelable.Creator {
    public w1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.matrix.battery.TaskProfiler$Timer(parcel.readInt(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.battery.TaskProfiler$Timer[i17];
    }
}
