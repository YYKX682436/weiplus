package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b2 extends kotlin.jvm.internal.m implements yz5.q {
    public b2(java.lang.Object obj) {
        super(3, obj, mx0.q2.class, "applyMusicOnClose", "applyMusicOnClose(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;ZZ)V", 0);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yx0.o oVar;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        mx0.q2 q2Var = (mx0.q2) this.receiver;
        q2Var.getClass();
        java.lang.String str = audioCacheInfo != null ? audioCacheInfo.f155723t : null;
        if (str == null) {
            mx0.x.l(q2Var, false, 1, null);
        } else {
            q2Var.c().setText(str);
            q2Var.c().requestFocus();
            q2Var.f(true);
        }
        if (audioCacheInfo != null) {
            if (!(audioCacheInfo.C.length() == 0)) {
                int i17 = audioCacheInfo.f155719p;
                if (i17 == 7) {
                    oVar = yx0.o.f467486d;
                } else {
                    oVar = i17 == 1 || i17 == 2 ? yx0.o.f467487e : yx0.o.f467488f;
                }
                yx0.o oVar2 = oVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicEntranceV2Plugin", "[selectMusic] " + audioCacheInfo.f155723t + " duration:" + audioCacheInfo.f155720q + " mirBegin:" + audioCacheInfo.E + " mirEnd:" + audioCacheInfo.F + " hasTrim=" + audioCacheInfo.g() + " effectiveStartMs=" + audioCacheInfo.c() + " effectiveDurationMs=" + audioCacheInfo.b());
                com.tencent.maas.model.MJMusicInfo a17 = ou0.e.a(audioCacheInfo, true);
                java.lang.Float f17 = q2Var.d().f222353c.f256883f;
                yx0.b8 b8Var = q2Var.f332236g;
                mx0.m2 m2Var = f17 != null ? new mx0.m2(f17, q2Var) : null;
                java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
                b8Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> " + a17.getMusicID() + ' ' + oVar2);
                kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.g7(a17, b8Var, m2Var, audioCacheInfo, null, oVar2, null), 3, null);
            }
        } else {
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) q2Var.f332235f;
            kotlinx.coroutines.l.d(shootComposingPluginLayout.getScope(), null, null, new mx0.k4(shootComposingPluginLayout, null), 3, null);
            shootComposingPluginLayout.G0(false, false);
        }
        return jz5.f0.f302826a;
    }
}
