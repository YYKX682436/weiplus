package yj;

/* loaded from: classes5.dex */
public final class i implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData(parcel.readInt() != 0, parcel.createByteArray(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData[i17];
    }
}
