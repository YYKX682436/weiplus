package n8;

/* loaded from: classes15.dex */
public class q extends n8.p {

    /* renamed from: j, reason: collision with root package name */
    public final android.media.AudioTimestamp f335549j;

    /* renamed from: k, reason: collision with root package name */
    public long f335550k;

    /* renamed from: l, reason: collision with root package name */
    public long f335551l;

    /* renamed from: m, reason: collision with root package name */
    public long f335552m;

    public q() {
        super(null);
        this.f335549j = new android.media.AudioTimestamp();
    }

    @Override // n8.p
    public long b() {
        return this.f335552m;
    }

    @Override // n8.p
    public long c() {
        return this.f335549j.nanoTime;
    }

    @Override // n8.p
    public void d(android.media.AudioTrack audioTrack, boolean z17) {
        super.d(audioTrack, z17);
        this.f335550k = 0L;
        this.f335551l = 0L;
        this.f335552m = 0L;
    }

    @Override // n8.p
    public boolean e() {
        android.media.AudioTrack audioTrack = this.f335540a;
        android.media.AudioTimestamp audioTimestamp = this.f335549j;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j17 = audioTimestamp.framePosition;
            if (this.f335551l > j17) {
                this.f335550k++;
            }
            this.f335551l = j17;
            this.f335552m = j17 + (this.f335550k << 32);
        }
        return timestamp;
    }
}
