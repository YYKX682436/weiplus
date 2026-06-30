package jl5;

/* loaded from: classes13.dex */
public class a implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ui.widget.cedit.util.ParcelableParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.widget.cedit.util.ParcelableParcel[i17];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new com.tencent.mm.ui.widget.cedit.util.ParcelableParcel(parcel, classLoader);
    }
}
