package o72;

/* loaded from: classes8.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.fav.api.DelFavoriteData delFavoriteData = new com.tencent.mm.plugin.fav.api.DelFavoriteData();
        delFavoriteData.f100215d = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100216e = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100217f = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100218g = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100219h = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100220i = java.lang.String.valueOf(parcel.readString());
        delFavoriteData.f100221m = java.lang.String.valueOf(parcel.readString());
        return delFavoriteData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.fav.api.DelFavoriteData[i17];
    }
}
