package nb;

/* loaded from: classes13.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.iqoo.secure.antifraud.thirdpart.CheckRiskResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.iqoo.secure.antifraud.thirdpart.CheckRiskResult[i17];
    }
}
