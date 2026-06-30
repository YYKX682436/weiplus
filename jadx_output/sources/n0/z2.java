package n0;

/* loaded from: classes14.dex */
public final class z2 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.ParcelableSnapshotMutableState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        n0.r4 r4Var;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        if (classLoader == null) {
            classLoader = n0.z2.class.getClassLoader();
        }
        java.lang.Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r4Var = n0.w2.f333739a;
        } else if (readInt == 1) {
            r4Var = n0.h5.f333529a;
        } else {
            if (readInt != 2) {
                throw new java.lang.IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            r4Var = n0.c4.f333474a;
        }
        return new androidx.compose.runtime.ParcelableSnapshotMutableState(readValue, r4Var);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.compose.runtime.ParcelableSnapshotMutableState[i17];
    }
}
