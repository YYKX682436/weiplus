package n8;

/* loaded from: classes15.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f335540a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f335541b;

    /* renamed from: c, reason: collision with root package name */
    public int f335542c;

    /* renamed from: d, reason: collision with root package name */
    public long f335543d;

    /* renamed from: e, reason: collision with root package name */
    public long f335544e;

    /* renamed from: f, reason: collision with root package name */
    public long f335545f;

    /* renamed from: g, reason: collision with root package name */
    public long f335546g;

    /* renamed from: h, reason: collision with root package name */
    public long f335547h;

    /* renamed from: i, reason: collision with root package name */
    public long f335548i;

    public p(n8.o oVar) {
    }

    public long a() {
        if (this.f335546g != -9223372036854775807L) {
            return java.lang.Math.min(this.f335548i, this.f335547h + ((((android.os.SystemClock.elapsedRealtime() * 1000) - this.f335546g) * this.f335542c) / 1000000));
        }
        int playState = this.f335540a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f335540a.getPlaybackHeadPosition() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        if (this.f335541b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f335545f = this.f335543d;
            }
            playbackHeadPosition += this.f335545f;
        }
        if (this.f335543d > playbackHeadPosition) {
            this.f335544e++;
        }
        this.f335543d = playbackHeadPosition;
        return playbackHeadPosition + (this.f335544e << 32);
    }

    public long b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public long c() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void d(android.media.AudioTrack audioTrack, boolean z17) {
        this.f335540a = audioTrack;
        this.f335541b = z17;
        this.f335546g = -9223372036854775807L;
        this.f335543d = 0L;
        this.f335544e = 0L;
        this.f335545f = 0L;
        if (audioTrack != null) {
            this.f335542c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }
}
