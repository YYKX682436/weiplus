package h63;

/* loaded from: classes7.dex */
public final class r implements android.os.Parcelable.Creator {
    public r(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult[i17];
    }
}
