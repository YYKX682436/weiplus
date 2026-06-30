package o72;

/* loaded from: classes8.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.fav.api.DoFavoriteData doFavoriteData = new com.tencent.mm.plugin.fav.api.DoFavoriteData();
        doFavoriteData.f100222d = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100223e = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100224f = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100225g = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100226h = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100227i = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100228m = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100229n = java.lang.String.valueOf(parcel.readString());
        doFavoriteData.f100230o = java.lang.String.valueOf(parcel.readString());
        return doFavoriteData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.fav.api.DoFavoriteData[i17];
    }
}
