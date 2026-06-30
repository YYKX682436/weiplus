package cr0;

/* loaded from: classes12.dex */
public final class x3 implements android.os.Parcelable.Creator {
    public x3(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        java.lang.String readString2 = parcel.readString();
        kotlin.jvm.internal.o.d(readString2);
        java.lang.String readString3 = parcel.readString();
        kotlin.jvm.internal.o.d(readString3);
        java.lang.String readString4 = parcel.readString();
        kotlin.jvm.internal.o.d(readString4);
        return new com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats(readInt, readString, readString2, readString3, readString4, parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats[i17];
    }
}
