package rj1;

/* loaded from: classes7.dex */
public final class j implements android.os.Parcelable.Creator {
    public j(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo();
        tipsMsgInfo.field_appId = parcel.readString();
        tipsMsgInfo.field_msgId = parcel.readString();
        tipsMsgInfo.field_createTime = parcel.readLong();
        tipsMsgInfo.field_expireTime = parcel.readLong();
        tipsMsgInfo.field_busiType = parcel.readInt();
        tipsMsgInfo.field_msgType = parcel.readInt();
        tipsMsgInfo.field_dataJson = parcel.readString();
        return tipsMsgInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo[i17];
    }
}
