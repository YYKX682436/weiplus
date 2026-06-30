package kf1;

/* loaded from: classes15.dex */
public class d extends kf1.a {

    /* renamed from: e, reason: collision with root package name */
    public xl.d f307169e;

    /* renamed from: f, reason: collision with root package name */
    public kf1.g f307170f;

    /* renamed from: g, reason: collision with root package name */
    public long f307171g;

    /* renamed from: h, reason: collision with root package name */
    public int f307172h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f307173i = new kf1.b(this);

    public jf1.c d() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "pauseRecord");
        xl.d dVar = this.f307169e;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DefaultLuggageRecorder", "mRecorderPcm is null, err");
            return new jf1.c("may be not start", new java.lang.Object[0]);
        }
        boolean z18 = true;
        xl.g gVar = dVar.f455079a;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecorderPcm", "pauseRecord fail, recorder is null, return");
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            if (gVar.f455092a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecorderPcm", "mAudioRecord is null, return");
            } else {
                z18 = false;
            }
            if (!z18) {
                gVar.f455098g = false;
            }
        }
        int currentTimeMillis = (int) (this.f307172h + (java.lang.System.currentTimeMillis() - this.f307171g));
        this.f307172h = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "pauseRecordTime mRecordingTime:%d mLastStartTime:%d", java.lang.Integer.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f307171g));
        ik1.h0.a().removeCallbacks(this.f307173i);
        a();
        return jf1.c.f299350d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jf1.c e(kf1.g r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.d.e(kf1.g):jf1.c");
    }

    public jf1.c f() {
        boolean z17;
        boolean z18;
        xl.d dVar = this.f307169e;
        boolean z19 = false;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DefaultLuggageRecorder", "mRecorderPcm is null, err");
            return new jf1.c("may be not start", new java.lang.Object[0]);
        }
        if (dVar.f455079a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecorderPcm", "stopRecord fail, recorder is null, return");
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            xl.g gVar = dVar.f455079a;
            if (gVar.f455092a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecorderPcm", "mAudioRecord is null, return");
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                gVar.f455098g = false;
                try {
                    gVar.f455092a.stop();
                    synchronized (gVar) {
                        android.media.AudioRecord audioRecord = gVar.f455092a;
                        if (audioRecord != null) {
                            audioRecord.setRecordPositionUpdateListener(null);
                            gVar.f455092a.release();
                            gVar.f455092a = null;
                        }
                    }
                    z19 = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.RecorderPcm", "", e17);
                }
            }
            synchronized (dVar.f455083e) {
                kh1.e eVar = dVar.f455080b;
                if (eVar != null) {
                    eVar.flush();
                    dVar.f455080b.close();
                    dVar.f455080b = null;
                }
            }
            synchronized (dVar) {
                xl.g gVar2 = dVar.f455079a;
                synchronized (gVar2) {
                    android.media.AudioRecord audioRecord2 = gVar2.f455092a;
                    if (audioRecord2 != null) {
                        audioRecord2.setRecordPositionUpdateListener(null);
                        gVar2.f455092a.release();
                        gVar2.f455092a = null;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecorderPcm", "stopRecord:%b", java.lang.Boolean.valueOf(z19));
        }
        java.lang.String str = this.f307170f.f307176a;
        int i17 = this.f307172h;
        int k17 = (int) com.tencent.mm.vfs.w6.k(str);
        c(str, i17, k17);
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "stopRecord() filePath:%s duration:%d fileSize:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k17));
        release();
        return jf1.c.f299350d;
    }

    public synchronized void release() {
        this.f307170f = null;
        xl.d dVar = this.f307169e;
        if (dVar != null) {
            synchronized (dVar) {
                xl.g gVar = dVar.f455079a;
                synchronized (gVar) {
                    android.media.AudioRecord audioRecord = gVar.f455092a;
                    if (audioRecord != null) {
                        audioRecord.setRecordPositionUpdateListener(null);
                        gVar.f455092a.release();
                        gVar.f455092a = null;
                    }
                }
            }
            this.f307169e = null;
        }
    }
}
