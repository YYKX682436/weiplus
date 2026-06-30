package og3;

/* loaded from: classes10.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readBundle(com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo[i17];
    }
}
