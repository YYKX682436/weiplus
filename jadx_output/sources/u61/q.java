package u61;

/* loaded from: classes4.dex */
public final class q implements android.os.Parcelable.Creator {
    public q(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.account.gatewayreg.GateWayRespData createFromParcel = com.tencent.mm.plugin.account.gatewayreg.GateWayRespData.CREATOR.createFromParcel(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        return new com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData(createFromParcel, readString);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData[i17];
    }
}
