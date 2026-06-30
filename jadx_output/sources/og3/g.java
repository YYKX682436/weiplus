package og3;

/* loaded from: classes4.dex */
public final class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(og3.a.valueOf(parcel.readString()), parcel.readString(), com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo[i17];
    }
}
