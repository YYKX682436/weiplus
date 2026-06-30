package w21;

/* loaded from: classes14.dex */
public class c0 implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f442304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f442305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w21.a0 f442306c;

    public c0(w21.a0 a0Var, java.util.concurrent.Future future, java.lang.Runnable runnable) {
        this.f442306c = a0Var;
        this.f442304a = future;
        this.f442305b = runnable;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack audioTrack) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "onMarkerReached: ");
        java.util.concurrent.Future future = this.f442304a;
        if (future != null && !future.cancel(false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "onMarkerReached: reached too late");
            return;
        }
        java.util.concurrent.Future future2 = this.f442306c.f442296e.G;
        if (future2 != null && !future2.isDone()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
        }
        this.f442306c.f442296e.C = null;
        this.f442306c.f442296e.B = false;
        this.f442306c.f442296e.G = ((ku5.t0) ku5.t0.f312615d).g(this.f442305b);
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack audioTrack) {
    }
}
