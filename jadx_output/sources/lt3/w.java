package lt3;

/* loaded from: classes4.dex */
public final class w implements android.os.Parcelable.Creator {
    public w(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig videoMixer$MixConfig = new com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig();
        videoMixer$MixConfig.f155641d = parcel.readInt();
        videoMixer$MixConfig.f155642e = parcel.readInt();
        videoMixer$MixConfig.f155643f = parcel.readInt();
        videoMixer$MixConfig.f155644g = parcel.readInt();
        videoMixer$MixConfig.f155645h = parcel.readInt();
        videoMixer$MixConfig.f155646i = parcel.readInt();
        videoMixer$MixConfig.f155647m = parcel.readInt();
        videoMixer$MixConfig.f155648n = parcel.readInt();
        return videoMixer$MixConfig;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig[i17];
    }
}
