package rt1;

/* loaded from: classes7.dex */
public final class c1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel(parcel.readInt() == 0 ? null : com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel[i17];
    }
}
