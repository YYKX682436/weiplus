package e60;

/* loaded from: classes11.dex */
public final class w0 implements android.os.Parcelable.Creator {
    public w0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.feature.gallery.api.GalleryParams galleryParams = new com.tencent.mm.feature.gallery.api.GalleryParams();
        galleryParams.f67105d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        galleryParams.f67106e = readString;
        galleryParams.f67107f = parcel.readString();
        return galleryParams;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.gallery.api.GalleryParams[i17];
    }
}
