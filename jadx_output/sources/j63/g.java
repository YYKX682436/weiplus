package j63;

/* loaded from: classes5.dex */
public final class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload[i17];
    }
}
