package dl3;

/* loaded from: classes13.dex */
public class b0 implements com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener {

    /* renamed from: a, reason: collision with root package name */
    public int f235274a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f235275b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final dl3.a f235276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f235277d;

    public b0(dl3.d0 d0Var) {
        this.f235277d = d0Var;
        this.f235276c = new dl3.a(2, d0Var.f235280c);
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public long getActualTime(long j17) {
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public boolean isEnabled() {
        return this.f235277d.f235301x != null;
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public boolean isTerminal() {
        return false;
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public boolean onPcm(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17) {
        dl3.b bVar = this.f235277d.f235301x;
        if (bVar == null) {
            return false;
        }
        bVar.a(this.f235276c, 1, this.f235274a, this.f235275b, bufferInfo.byteBuffer);
        return false;
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public long onPlayerReady(int i17, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, long j17) {
        this.f235274a = audioInformation.getChannels();
        this.f235275b = (int) audioInformation.getSampleRate();
        dl3.b bVar = this.f235277d.f235301x;
        if (bVar == null) {
            return 0L;
        }
        bVar.c(this.f235276c);
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public void onPlayerSeekComplete(long j17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public void onPlayerStopped() {
        dl3.d0 d0Var = this.f235277d;
        dl3.b bVar = d0Var.f235301x;
        if (bVar != null) {
            bVar.d(this.f235276c);
        }
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = d0Var.f235282e;
        if (commonPlayer != null) {
            commonPlayer.removeAudioListener(this);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
    public boolean onPcm(com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo, com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo2, long j17) {
        dl3.b bVar = this.f235277d.f235301x;
        if (bVar == null) {
            return false;
        }
        bVar.b(this.f235276c, 3, this.f235274a, this.f235275b, floatBufferInfo.floatBuffer);
        return false;
    }
}
