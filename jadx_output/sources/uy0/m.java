package uy0;

/* loaded from: classes4.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo[i17];
    }
}
