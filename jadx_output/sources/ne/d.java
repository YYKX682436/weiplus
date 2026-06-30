package ne;

/* loaded from: classes7.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        k91.z3 z3Var;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        k91.z3 z3Var2 = k91.z3.UNKNOWN;
        int readInt2 = parcel.readInt();
        k91.z3[] values = k91.z3.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z3Var = z3Var2;
                break;
            }
            z3Var = values[i17];
            if (z3Var.ordinal() == readInt2) {
                break;
            }
            i17++;
        }
        return new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig(z17, readInt, z3Var, parcel.readString(), parcel.readInt() != 0, k91.y3.valueOf(parcel.readString()), k91.y3.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig[i17];
    }
}
