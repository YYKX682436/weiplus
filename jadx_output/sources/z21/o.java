package z21;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.q f469658d;

    public o(z21.q qVar) {
        this.f469658d = qVar;
    }

    public void a() {
        int i17;
        z21.q qVar = this.f469658d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAddr", "initDeviceInLock");
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(z21.q.a(qVar));
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceAddr", "delete file failed, " + z21.q.a(qVar), e17);
        }
        tl.w wVar = new tl.w(qVar.f469667i ? 8000 : 16000, 1, 3);
        qVar.f469669n = wVar;
        wVar.f420160m = -19;
        wVar.i(false);
        if (!qVar.f469667i) {
            yl.h hVar = new yl.h();
            qVar.f469670o = hVar;
            if (!hVar.b(!qVar.f469667i ? z21.q.f469659t : z21.q.f469660u)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceAddr", "init speex writer failed");
                ((yl.h) qVar.f469670o).d();
                qVar.f469670o = null;
            }
        }
        if (qVar.f469667i || (i17 = wo.v1.f447833m.f447751i) <= 0) {
            qVar.f469669n.h(5, false);
        } else {
            qVar.f469669n.h(i17, true);
        }
        qVar.f469669n.j(false);
        int i18 = qVar.f469666h;
        com.tencent.qqpinyin.voicerecoapi.c cVar = new com.tencent.qqpinyin.voicerecoapi.c(i18, com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN);
        qVar.f469671p = cVar;
        com.tencent.qqpinyin.voicerecoapi.TRVADNative tRVADNative = cVar.f215263a;
        int mfeInit = tRVADNative.mfeInit(i18, com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN);
        if (mfeInit == 0 && (mfeInit = tRVADNative.mfeOpen()) == 0 && (mfeInit = tRVADNative.mfeEnableNoiseDetection(true)) == 0) {
            mfeInit = tRVADNative.mfeStart();
        }
        int i19 = mfeInit != 0 ? -1 : 0;
        if (i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceAddr", "init VoiceDetectAPI failed :" + i19);
            qVar.c();
            return;
        }
        tl.w wVar2 = qVar.f469669n;
        wVar2.f420172y = qVar.f469673r;
        if (wVar2.k()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceAddr", "start record failed");
        qVar.c();
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f469658d) {
            a();
        }
    }
}
