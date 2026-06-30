package u61;

/* loaded from: classes4.dex */
public final class p implements android.os.Parcelable.Creator {
    public p(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.account.gatewayreg.GateWayRespData createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.account.gatewayreg.GateWayRespData(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), null, parcel.readInt(), parcel.readInt(), null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.account.gatewayreg.GateWayRespData[i17];
    }
}
