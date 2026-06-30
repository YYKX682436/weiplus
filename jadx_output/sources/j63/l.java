package j63;

/* loaded from: classes5.dex */
public final class l implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload(parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload[i17];
    }
}
