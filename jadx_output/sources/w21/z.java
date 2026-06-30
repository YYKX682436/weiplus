package w21;

/* loaded from: classes14.dex */
public class z implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f442518a;

    public z(w21.d0 d0Var) {
        this.f442518a = d0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "onError");
        w21.d0 d0Var = this.f442518a;
        fp.e eVar = d0Var.f442312d;
        if (eVar != null && d0Var.f442327s) {
            eVar.a();
        }
        tl.f fVar = this.f442518a.f442314f;
        if (fVar != null) {
            fVar.a();
        }
        try {
            this.f442518a.f442318j = -1;
            this.f442518a.v();
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "setErrorListener File[" + this.f442518a.f442317i + "] ErrMsg[" + e17.getStackTrace() + "]");
            return false;
        }
    }
}
