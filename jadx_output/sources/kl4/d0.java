package kl4;

/* loaded from: classes15.dex */
public final class d0 implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308900a;

    public d0(kl4.k0 k0Var) {
        this.f308900a = k0Var;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack track) {
        kotlin.jvm.internal.o.g(track, "track");
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack track) {
        kotlin.jvm.internal.o.g(track, "track");
        kl4.k0 k0Var = this.f308900a;
        if (k0Var.f308936n || track.getPlaybackHeadPosition() < k0Var.f308944v) {
            return;
        }
        k0Var.f();
    }
}
