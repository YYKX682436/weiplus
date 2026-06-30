package nq4;

/* loaded from: classes14.dex */
public final class b implements yx3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq4.a f339002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339003b;

    public b(nq4.a aVar, java.lang.String str) {
        this.f339002a = aVar;
        this.f339003b = str;
    }

    @Override // yx3.y
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: dealWithError");
        java.lang.String str = this.f339003b;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "Remove TTS cache " + str + " result: " + com.tencent.mm.vfs.w6.h(str));
    }

    @Override // yx3.y
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onUnLock");
        nq4.e.f339012e.set(false);
    }

    @Override // yx3.y
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onLock");
        nq4.e.f339012e.set(true);
    }

    @Override // yx3.y
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onCompletion");
        nq4.e.f339008a.a();
        nq4.a aVar = this.f339002a;
        if (aVar != null) {
            aVar.onDone();
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairerConfigVoIPMPAlwaysRefreshTTSFileEnable()) == 1) {
            java.lang.String str = this.f339003b;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "Remove TTS cache " + str + " result: " + com.tencent.mm.vfs.w6.h(str));
        }
    }

    @Override // yx3.y
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onStart");
        nq4.f fVar = nq4.f.f339014a;
        nq4.f.f339019f = true;
    }
}
