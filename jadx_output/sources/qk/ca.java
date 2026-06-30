package qk;

/* loaded from: classes11.dex */
public final class ca implements android.os.Parcelable.Creator {
    public ca(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = new com.tencent.mm.api.TingMemberShipSubscribeRequest();
        java.lang.Object readValue = parcel.readValue(java.lang.Integer.TYPE.getClassLoader());
        tingMemberShipSubscribeRequest.f53211d = readValue instanceof java.lang.Integer ? (java.lang.Integer) readValue : null;
        tingMemberShipSubscribeRequest.f53213f = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        tingMemberShipSubscribeRequest.f53214g = readString;
        tingMemberShipSubscribeRequest.f53215h = parcel.readInt();
        return tingMemberShipSubscribeRequest;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.api.TingMemberShipSubscribeRequest[i17];
    }
}
