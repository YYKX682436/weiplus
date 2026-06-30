package wt3;

/* loaded from: classes5.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        audioCacheInfo.f155711e = parcel.readInt();
        audioCacheInfo.f155712f = parcel.readString();
        audioCacheInfo.f155715i = parcel.readString();
        audioCacheInfo.f155716m = parcel.readByte() != 0;
        audioCacheInfo.f155717n = parcel.readByte() != 0;
        audioCacheInfo.f155726w = parcel.readInt();
        audioCacheInfo.f155727x = parcel.readLong();
        audioCacheInfo.f155718o = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        audioCacheInfo.f155723t = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        audioCacheInfo.f155724u = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        audioCacheInfo.f155725v = readString3;
        r45.mh4 mh4Var = audioCacheInfo.f155710d;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                mh4Var.parseFrom(createByteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (parcel.dataAvail() > 0) {
            if (parcel.readByte() != 0) {
                audioCacheInfo.G = java.lang.Long.valueOf(parcel.readLong());
                audioCacheInfo.H = java.lang.Long.valueOf(parcel.readLong());
            }
        }
        return audioCacheInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo[i17];
    }
}
