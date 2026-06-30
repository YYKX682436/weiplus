package lh;

/* loaded from: classes12.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = new com.tencent.matrix.battery.accumulate.AccPowerStats(null);
        accPowerStats.readFromParcel(parcel);
        return accPowerStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.battery.accumulate.AccPowerStats[i17];
    }
}
