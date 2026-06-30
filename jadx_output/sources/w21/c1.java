package w21;

/* loaded from: classes14.dex */
public class c1 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d1 f442307a;

    public c1(w21.d1 d1Var) {
        this.f442307a = d1Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        w21.d1 d1Var = this.f442307a;
        fp.e eVar = d1Var.f442339e;
        if (eVar != null && d1Var.f442341g) {
            eVar.a();
        }
        tl.f fVar = d1Var.f442338d;
        if (fVar != null) {
            fVar.a();
        }
        try {
            d1Var.f442335a.reset();
            d1Var.f442335a.release();
            d1Var.f442340f = -1;
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "setErrorListener File[" + d1Var.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
            return false;
        }
    }
}
