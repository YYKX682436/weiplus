package kh;

/* loaded from: classes12.dex */
public final class l1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats taskProfiler$AccTaskJiffyStats = new com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats();
        taskProfiler$AccTaskJiffyStats.readFromParcel(parcel);
        return taskProfiler$AccTaskJiffyStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats[i17];
    }
}
