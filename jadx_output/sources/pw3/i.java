package pw3;

/* loaded from: classes9.dex */
public class i implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel[i17];
    }
}
