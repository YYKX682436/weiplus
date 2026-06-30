package in0;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292743d;

    public c(in0.q qVar) {
        this.f292743d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        in0.q qVar = this.f292743d;
        qVar.f420759f.removeCallbacks(this);
        qVar.f420759f.postDelayed(this, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
