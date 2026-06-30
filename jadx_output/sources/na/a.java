package na;

/* loaded from: classes13.dex */
public final class a implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new com.google.android.material.stateful.ExtendableSavedState(parcel, classLoader, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.google.android.material.stateful.ExtendableSavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.material.stateful.ExtendableSavedState(parcel, null, null);
    }
}
