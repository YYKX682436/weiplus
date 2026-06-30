package sn0;

/* loaded from: classes3.dex */
public final class b extends co0.s {

    /* renamed from: e2, reason: collision with root package name */
    public static sn0.b f409964e2;

    /* renamed from: d2, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f409965d2;

    public b() {
        super(false, 1, null);
        this.f409965d2 = new com.tencent.mm.sdk.platformtools.b4("anchor_secondary_sei_sender", (com.tencent.mm.sdk.platformtools.a4) new sn0.a(this), true);
    }

    @Override // tn0.w0
    public void O0(java.lang.String privateMapKey) {
        kotlin.jvm.internal.o.g(privateMapKey, "privateMapKey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(privateMapKey)) {
            return;
        }
        cl0.g gVar = new cl0.g();
        gVar.h("privateMapKey", privateMapKey);
        cl0.g gVar2 = new cl0.g();
        gVar2.h("api", "updatePrivateMapKey");
        gVar2.h("params", gVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreSecondaryDevice", "updatePrivateMapKey:" + gVar2 + ' ');
        T().callExperimentalAPI(gVar2.toString());
    }

    @Override // co0.s, tn0.w0
    public boolean X() {
        return false;
    }

    @Override // co0.s
    public boolean Z0() {
        return true;
    }

    @Override // tn0.w0, vn0.f
    public void a(int i17) {
        super.a(i17);
        this.f409965d2.d();
    }

    @Override // co0.s, tn0.w0, vn0.f
    public void e(long j17) {
        super.e(j17);
        if (j17 > 0) {
            this.f409965d2.c(1000L, 1000L);
        }
    }

    @Override // co0.s
    public void e1(boolean z17) {
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam;
        mn0.b0 b0Var = this.R1.f282409a;
        if (b0Var != null) {
            ((mn0.y) b0Var).G(z17);
        }
        if (z17) {
            com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam2 = this.L;
            if (audioMusicParam2 != null) {
                T().getAudioEffectManager().pausePlayMusic(audioMusicParam2.f46245id);
                return;
            }
            return;
        }
        if (!this.N || (audioMusicParam = this.L) == null) {
            return;
        }
        T().getAudioEffectManager().resumePlayMusic(audioMusicParam.f46245id);
    }

    @Override // co0.s
    public boolean g1() {
        return true;
    }

    @Override // tn0.w0
    public android.graphics.Point z(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        return ko0.t.f309903a.a(this.U1, this.V1);
    }
}
