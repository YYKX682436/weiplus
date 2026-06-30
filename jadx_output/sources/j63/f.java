package j63;

/* loaded from: classes4.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload(parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload[i17];
    }
}
