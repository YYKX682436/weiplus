package ei3;

/* loaded from: classes12.dex */
public class w implements ei3.j {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaRecorder f253153a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.h f253154b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f253155c = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f253156d = new ei3.v(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f253157e;

    /* renamed from: f, reason: collision with root package name */
    public final int f253158f;

    /* renamed from: g, reason: collision with root package name */
    public final int f253159g;

    public w(int i17, int i18, int i19) {
        this.f253157e = i17;
        this.f253158f = i18;
        this.f253159g = i19;
        if (i19 <= 0) {
            this.f253159g = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s, audioChannelCount: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // ei3.j
    public void a(boolean z17) {
        this.f253155c = z17;
    }

    @Override // ei3.j
    public int b(ei3.h hVar) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f253156d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", hVar);
        this.f253154b = hVar;
        try {
            try {
                android.media.MediaRecorder mediaRecorder = this.f253153a;
                if (mediaRecorder != null && !this.f253155c) {
                    mediaRecorder.start();
                }
                return 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e17, "start record aac.mp4 error:%s", e17.getMessage());
                n3Var.sendEmptyMessage(0);
                return -1;
            }
        } finally {
            n3Var.sendEmptyMessage(0);
        }
    }

    @Override // ei3.j
    public int c(int i17, java.lang.String str) {
        int i18 = this.f253157e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", str, java.lang.Integer.valueOf(i18));
        gp.e eVar = new gp.e();
        this.f253153a = eVar;
        eVar.setAudioSource(1);
        this.f253153a.setOutputFormat(2);
        this.f253153a.setAudioEncoder(3);
        this.f253153a.setAudioChannels(this.f253159g);
        this.f253153a.setAudioEncodingBitRate(this.f253158f);
        this.f253153a.setAudioSamplingRate(i18);
        this.f253153a.setOutputFile(str);
        try {
            this.f253153a.prepare();
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e17, "mediaRecorder prepare error: %s", e17.getMessage());
            return -1;
        }
    }

    @Override // ei3.j
    public void clear() {
        try {
            android.media.MediaRecorder mediaRecorder = this.f253153a;
            if (mediaRecorder != null) {
                if (!this.f253155c) {
                    mediaRecorder.stop();
                    this.f253153a.release();
                }
                this.f253153a = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.j
    public void d() {
    }

    @Override // ei3.j
    public tl.v e() {
        return null;
    }

    @Override // ei3.j
    public int f(ei3.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", this.f253153a, iVar);
        android.media.MediaRecorder mediaRecorder = this.f253153a;
        if (mediaRecorder == null) {
            if (iVar != null) {
                iVar.a();
            }
            return 0;
        }
        try {
            if (!this.f253155c) {
                mediaRecorder.stop();
                this.f253153a.release();
            }
            this.f253153a = null;
            if (iVar != null) {
                iVar.a();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", e17, "stop record aac.mp4 error:%s", e17.getMessage());
            return -1;
        }
    }
}
