package y8;

/* loaded from: classes13.dex */
public final class j implements y8.i {
    public j(y8.f fVar) {
    }

    @Override // y8.i
    public android.media.MediaCodecInfo a(int i17) {
        return android.media.MediaCodecList.getCodecInfoAt(i17);
    }

    @Override // y8.i
    public boolean b(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // y8.i
    public int c() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // y8.i
    public boolean d() {
        return false;
    }
}
