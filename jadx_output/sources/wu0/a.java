package wu0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface f449649a;

    public final void a() {
        com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface mJAudioChannels3aInterface = this.f449649a;
        if (mJAudioChannels3aInterface != null) {
            mJAudioChannels3aInterface.destroy();
        }
        this.f449649a = null;
        com.tencent.mars.xlog.Log.i("AudioDenoise3AHelper", "destroy 3aInterface");
    }

    public final com.tencent.mm.vfs.r6 b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
        com.tencent.mm.plugin.voip.model.s1 s1Var = com.tencent.mm.plugin.voip.model.s1.f176798a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipModelResMgr", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
        s1Var.b(sb6);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        if (r6Var.m() && r6Var.C() > 0) {
            return r6Var;
        }
        com.tencent.mars.xlog.Log.e("AudioDenoise3AHelper", "initVoipAudioModelRes: modesFile error");
        return null;
    }
}
