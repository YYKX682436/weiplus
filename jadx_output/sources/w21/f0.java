package w21;

/* loaded from: classes14.dex */
public class f0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f442363a;

    public f0(w21.i0 i0Var) {
        this.f442363a = i0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.i0 i0Var = this.f442363a;
        fp.e eVar = i0Var.f442391l;
        if (eVar != null && i0Var.f442393n) {
            eVar.a();
        }
        try {
            this.f442363a.f442384e = 0;
            this.f442363a.n();
            try {
                w21.i0.k(this.f442363a);
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "setCompletion File[" + this.f442363a.f442381b + "] ErrMsg[" + e18.getStackTrace() + "]");
        }
    }
}
