package cr0;

/* loaded from: classes12.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.matrix.battery.AccNetworkStats accNetworkStats = new com.tencent.mm.matrix.battery.AccNetworkStats();
        accNetworkStats.readFromParcel(parcel);
        return accNetworkStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.matrix.battery.AccNetworkStats[i17];
    }
}
