package u85;

/* loaded from: classes10.dex */
public final class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = new com.tencent.mm.sticker.loader.StickerLoadInfo(parcel.readInt());
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        stickerLoadInfo.f193690e = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        stickerLoadInfo.f193691f = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        stickerLoadInfo.f193692g = readString3;
        stickerLoadInfo.f193693h = parcel.readInt();
        java.lang.String readString4 = parcel.readString();
        stickerLoadInfo.f193694i = readString4 != null ? readString4 : "";
        stickerLoadInfo.f193695m = parcel.readInt();
        return stickerLoadInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sticker.loader.StickerLoadInfo[i17];
    }
}
