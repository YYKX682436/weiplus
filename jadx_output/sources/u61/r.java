package u61;

/* loaded from: classes4.dex */
public final class r implements android.os.Parcelable.Creator {
    public r(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData.CREATOR.getClass();
        com.tencent.mm.plugin.account.gatewayreg.GateWayRespData createFromParcel = com.tencent.mm.plugin.account.gatewayreg.GateWayRespData.CREATOR.createFromParcel(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData = new com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData(createFromParcel, readString);
        r45.fn4 fn4Var = new r45.fn4();
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        fn4Var.fromJson(readString2);
        java.lang.String readString3 = parcel.readString();
        return new com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData(getMobileReqData, fn4Var, readString3 != null ? readString3 : "", parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData[i17];
    }
}
