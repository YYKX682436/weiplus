package w21;

/* loaded from: classes14.dex */
public class g0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f442370a;

    public g0(w21.i0 i0Var) {
        this.f442370a = i0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        w21.i0 i0Var = this.f442370a;
        fp.e eVar = i0Var.f442391l;
        if (eVar != null && i0Var.f442393n) {
            eVar.a();
        }
        tl.f fVar = this.f442370a.f442383d;
        if (fVar != null) {
            fVar.a();
        }
        try {
            this.f442370a.f442384e = -1;
            this.f442370a.n();
            try {
                w21.i0.k(this.f442370a);
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "setErrorListener File[" + this.f442370a.f442381b + "] ErrMsg[" + e18.getStackTrace() + "]");
        }
        return false;
    }
}
