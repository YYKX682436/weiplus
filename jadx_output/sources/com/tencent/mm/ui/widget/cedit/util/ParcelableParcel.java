package com.tencent.mm.ui.widget.cedit.util;

/* loaded from: classes13.dex */
public class ParcelableParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.ClassLoaderCreator<com.tencent.mm.ui.widget.cedit.util.ParcelableParcel> CREATOR = new jl5.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcel f211627d;

    public ParcelableParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int i17;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.f211627d = obtain;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            throw new java.lang.IllegalArgumentException("Negative size read from parcel");
        }
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            i17 = dataPosition;
        } else {
            if ((readInt <= 0 || dataPosition > Integer.MAX_VALUE - readInt) && (readInt >= 0 || dataPosition < Integer.MIN_VALUE - readInt)) {
                throw new java.lang.IllegalArgumentException("Addition overflow: " + dataPosition + " + " + readInt);
            }
            i17 = dataPosition + readInt;
        }
        parcel.setDataPosition(i17);
        obtain.appendFrom(parcel, dataPosition, readInt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Parcel parcel2 = this.f211627d;
        parcel.writeInt(parcel2.dataSize());
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }
}
