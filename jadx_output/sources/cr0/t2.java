package cr0;

/* loaded from: classes12.dex */
public final class t2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats netSceneProfiler$AccCgiStats = new com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats();
        netSceneProfiler$AccCgiStats.readFromParcel(parcel);
        return netSceneProfiler$AccCgiStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats[i17];
    }
}
