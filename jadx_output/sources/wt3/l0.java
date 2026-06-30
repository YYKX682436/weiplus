package wt3;

/* loaded from: classes5.dex */
public final class l0 implements android.os.Parcelable.Creator {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo lyricsInfo = new com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo(new java.util.ArrayList());
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            lyricsInfo.f155730d.add(bArr);
        }
        return lyricsInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo[i17];
    }
}
