package sv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f413389a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f413390b;

    public b(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        audioCacheInfo = (i18 & 2) != 0 ? null : audioCacheInfo;
        this.f413389a = i17;
        this.f413390b = audioCacheInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3.b)) {
            return false;
        }
        sv3.b bVar = (sv3.b) obj;
        return this.f413389a == bVar.f413389a && kotlin.jvm.internal.o.b(this.f413390b, bVar.f413390b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f413389a) * 31;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f413390b;
        return hashCode + (audioCacheInfo == null ? 0 : audioCacheInfo.hashCode());
    }

    public java.lang.String toString() {
        return "MusicPickerLoadingSelectData(sourceType=" + this.f413389a + ", selectedAudio=" + this.f413390b + ')';
    }
}
