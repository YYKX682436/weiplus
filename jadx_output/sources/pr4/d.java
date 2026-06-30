package pr4;

/* loaded from: classes9.dex */
public final class d implements android.os.Parcelable.Creator {
    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo[i17];
    }
}
