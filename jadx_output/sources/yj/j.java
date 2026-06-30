package yj;

/* loaded from: classes5.dex */
public final class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.advertise.cgi.MagicAdIPCCgiData(yj.h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.advertise.cgi.MagicAdIPCCgiData[i17];
    }
}
