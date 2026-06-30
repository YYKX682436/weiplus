package pc;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc.r f353222e;

    public q(pc.r rVar, int i17) {
        this.f353222e = rVar;
        this.f353221d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.media.SoundPool soundPool = this.f353222e.f353223a;
        if (soundPool == null) {
            mc.p.f325531a.e("SoundPoolHelper", "soundpool is null.");
        } else {
            soundPool.play(this.f353221d, 0.8f, 0.8f, 0, 0, 1.0f);
        }
    }
}
