package q6;

/* loaded from: classes15.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.appaac.haptic.sync.VibrationPattern(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.appaac.haptic.sync.VibrationPattern[i17];
    }
}
