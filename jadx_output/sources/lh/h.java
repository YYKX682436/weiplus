package lh;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    public h(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.matrix.battery.accumulate.AccProcessStats accProcessStats = new com.tencent.matrix.battery.accumulate.AccProcessStats();
        accProcessStats.f52550d = parcel.readLong();
        accProcessStats.f52551e = parcel.readLong();
        accProcessStats.f52552f = parcel.readLong();
        return accProcessStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.battery.accumulate.AccProcessStats[i17];
    }
}
