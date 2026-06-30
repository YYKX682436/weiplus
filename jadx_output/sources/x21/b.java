package x21;

/* loaded from: classes14.dex */
public final class b implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x21.c f451511a;

    public b(x21.c cVar) {
        this.f451511a = cVar;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack audioTrack) {
        java.lang.Object m521constructorimpl;
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "reach end");
        if (audioTrack != null) {
            x21.c cVar = this.f451511a;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.release();
                if (cVar.f451513b) {
                    f25.m0 m0Var = cVar.f451522k;
                    if (m0Var != null) {
                        i95.m c17 = i95.n0.c(f25.n0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ((f25.n0) c17).yg(m0Var);
                    }
                    cVar.f451522k = null;
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", m524exceptionOrNullimpl);
            }
            kotlin.Result.m520boximpl(m521constructorimpl);
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack audioTrack) {
    }
}
