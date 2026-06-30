package er0;

/* loaded from: classes12.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = new com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats();
        accProcLifeStats.readFromParcel(parcel);
        return accProcLifeStats;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats[i17];
    }
}
