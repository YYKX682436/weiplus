package j63;

/* loaded from: classes.dex */
public final class o implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            linkedHashMap.put(parcel.readString(), java.lang.Integer.valueOf(parcel.readInt()));
        }
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload(linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload[i17];
    }
}
