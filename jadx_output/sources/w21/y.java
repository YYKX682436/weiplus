package w21;

/* loaded from: classes14.dex */
public class y implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f442515a;

    public y(w21.d0 d0Var) {
        this.f442515a = d0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.d0 d0Var = this.f442515a;
        if (d0Var.f442312d != null && d0Var.f442327s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "silkPlayer play onCompletion abandonFocus");
            this.f442515a.f442312d.a();
        }
        try {
            this.f442515a.f442318j = 0;
            this.f442515a.v();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "setCompletion File[" + this.f442515a.f442317i + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
