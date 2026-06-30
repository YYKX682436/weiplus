package ye;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.luggage.sdk.processes.main.LuggageRegisterTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.processes.main.LuggageRegisterTask[i17];
    }
}
