package kn0;

/* loaded from: classes3.dex */
public final class s implements android.os.Parcelable.Creator {
    public s(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.live.core.core.model.UserVolumeInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.live.core.core.model.UserVolumeInfo[i17];
    }
}
