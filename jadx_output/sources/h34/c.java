package h34;

/* loaded from: classes15.dex */
public class c implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h34.f f278489a;

    public c(h34.f fVar) {
        this.f278489a = fVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        h34.f fVar;
        fp.j jVar = new fp.j();
        synchronized (this.f278489a.f278512n) {
            if (this.f278489a.f278509h == 408) {
                com.tencent.qafpapi.QAFPNative.QAFPProcessTV(bArr, i17);
            } else {
                com.tencent.qafpapi.QAFPNative.QAFPProcess(bArr, i17);
            }
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f278489a.f278520v;
        jVar.a();
        if (currentTimeMillis > (this.f278489a.f278521w * 3000) + 4000) {
            byte[] bArr2 = new byte[com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES];
            fp.j jVar2 = new fp.j();
            int QAFPGetAudioFingerPrintTV = this.f278489a.f278509h == 408 ? com.tencent.qafpapi.QAFPNative.QAFPGetAudioFingerPrintTV(bArr2) : com.tencent.qafpapi.QAFPNative.QAFPGetAudioFingerPrint(bArr2);
            int i18 = this.f278489a.f278517s;
            jVar2.a();
            if (QAFPGetAudioFingerPrintTV >= 10240 || QAFPGetAudioFingerPrintTV <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d  out ret:%d  !stop record now", java.lang.Integer.valueOf(this.f278489a.f278517s), java.lang.Integer.valueOf(QAFPGetAudioFingerPrintTV));
                this.f278489a.b();
                return;
            }
            synchronized (this.f278489a.f278505d) {
                java.lang.System.arraycopy(bArr2, 0, this.f278489a.f278505d, 0, QAFPGetAudioFingerPrintTV);
                fVar = this.f278489a;
                fVar.f278506e = QAFPGetAudioFingerPrintTV;
                fVar.f278516r = fVar.f278521w >= 3;
                fVar.f278507f = (int) (currentTimeMillis / 1000);
            }
            gm0.j1.e().j(new h34.e(fVar));
            this.f278489a.f278521w++;
        }
        h34.f fVar2 = this.f278489a;
        if (fVar2.f278516r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicFingerPrintRecorder", "client:%d stop now! duration:%d  ", java.lang.Integer.valueOf(fVar2.f278517s), java.lang.Long.valueOf(currentTimeMillis));
            this.f278489a.b();
        }
    }
}
