package p60;

/* loaded from: classes5.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readParcelable(com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData[i17];
    }
}
