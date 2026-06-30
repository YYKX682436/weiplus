package pw3;

/* loaded from: classes9.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel[i17];
    }
}
