package zl3;

/* loaded from: classes11.dex */
public final class g extends zl3.n {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f474061h = "MicroMsg.FlutterTingPlayerPlugin";

    /* renamed from: i, reason: collision with root package name */
    public final zl3.f f474062i = new zl3.f(this);

    public final qk.g9 b() {
        i95.m c17 = i95.n0.c(qk.g9.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return (qk.g9) c17;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterMusicInfo c(bw5.lp0 lp0Var) {
        return new com.tencent.pigeon.mm_foundation.FlutterMusicInfo(lp0Var.b(), null, rk4.j5.c(lp0Var), null, rk4.j5.a(lp0Var), rk4.j5.l(lp0Var), rk4.j5.d(lp0Var), getDuration(), null, "", null, lp0Var.d().b().c(), lp0Var.d().b().getBizUsername(), null, null, null, 58634, null);
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FlutterMusicInfo getCurrentMusic() {
        bw5.lp0 uj6 = ((rk4.z8) b()).uj();
        return (uj6 == null || !((rk4.z8) b()).nj()) ? new com.tencent.pigeon.mm_foundation.FlutterMusicInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : c(uj6);
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FLMusicIntType getCurrentPosition() {
        return new com.tencent.pigeon.mm_foundation.FLMusicIntType(java.lang.Long.valueOf(((rk4.z8) b()).Di()));
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FLMusicIntType getDuration() {
        return new com.tencent.pigeon.mm_foundation.FLMusicIntType(java.lang.Long.valueOf(((rk4.z8) b()).Ai()));
    }

    @Override // zl3.n, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion companion = com.tencent.pigeon.mm_foundation.MusicPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f474070d = new com.tencent.pigeon.mm_foundation.MusicCallbackApi(binaryMessenger2, null, 2, null);
        i95.m c17 = i95.n0.c(qk.u8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ef0.j3) ((qk.u8) c17)).wi(this.f474062i);
    }

    @Override // zl3.n, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion companion = com.tencent.pigeon.mm_foundation.MusicPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        i95.m c17 = i95.n0.c(qk.u8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ef0.j3) ((qk.u8) c17)).Ai(this.f474062i);
        this.f474070d = null;
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void pause() {
        com.tencent.mars.xlog.Log.i(this.f474061h, "pause");
        ((rk4.z8) b()).pj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void play(com.tencent.pigeon.mm_foundation.FlutterMusicInfo r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl3.g.play(com.tencent.pigeon.mm_foundation.FlutterMusicInfo):void");
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f474061h, "resume");
        ((rk4.z8) b()).wj();
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void seek(com.tencent.pigeon.mm_foundation.FLMusicIntType time) {
        kotlin.jvm.internal.o.g(time, "time");
        qk.g9 b17 = b();
        java.lang.Long value = time.getValue();
        ((rk4.z8) b17).xj(value != null ? value.longValue() : 0L);
    }

    @Override // zl3.n, com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void stop() {
        com.tencent.mars.xlog.Log.i(this.f474061h, "stop");
        ((rk4.z8) b()).zj();
    }
}
