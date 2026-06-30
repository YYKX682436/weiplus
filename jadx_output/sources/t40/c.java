package t40;

/* loaded from: classes3.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = new com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams();
        finderLiveGalleryParams.f66603d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        finderLiveGalleryParams.f66604e = readString;
        finderLiveGalleryParams.f66605f = parcel.readString();
        finderLiveGalleryParams.f66606g = parcel.readString();
        finderLiveGalleryParams.f66607h = parcel.readLong();
        java.lang.String readString2 = parcel.readString();
        finderLiveGalleryParams.f66608i = readString2 != null ? readString2 : "";
        return finderLiveGalleryParams;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams[i17];
    }
}
