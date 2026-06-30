package tl;

/* loaded from: classes12.dex */
public class i implements android.media.MediaRecorder.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.t f420051a;

    public i(tl.t tVar) {
        this.f420051a = tVar;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(android.media.MediaRecorder mediaRecorder, int i17, int i18) {
        tl.t tVar = this.f420051a;
        tl.a aVar = tVar.f420125e;
        if (aVar != null) {
            aVar.a();
        }
        try {
            tVar.f420135o.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioRecorder", e17.getMessage());
        }
        tVar.f420138r = tl.s.ERROR;
    }
}
