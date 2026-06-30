package sv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f413387a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f413388b;

    public a(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        audioCacheInfo = (i18 & 2) != 0 ? null : audioCacheInfo;
        this.f413387a = i17;
        this.f413388b = audioCacheInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3.a)) {
            return false;
        }
        sv3.a aVar = (sv3.a) obj;
        return this.f413387a == aVar.f413387a && kotlin.jvm.internal.o.b(this.f413388b, aVar.f413388b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f413387a) * 31;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f413388b;
        return hashCode + (audioCacheInfo == null ? 0 : audioCacheInfo.hashCode());
    }

    public java.lang.String toString() {
        return "MusicPickerCurrentSelectData(sourceType=" + this.f413387a + ", selectedAudio=" + this.f413388b + ')';
    }
}
