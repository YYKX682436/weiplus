package w21;

/* loaded from: classes14.dex */
public class b1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.d1 f442302a;

    public b1(w21.d1 d1Var) {
        this.f442302a = d1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        w21.d1 d1Var = this.f442302a;
        fp.e eVar = d1Var.f442339e;
        if (eVar != null && d1Var.f442341g) {
            eVar.a();
        }
        tl.e eVar2 = d1Var.f442337c;
        if (eVar2 != null) {
            eVar2.onCompletion();
        }
        try {
            d1Var.f442335a.reset();
            d1Var.f442335a.release();
            d1Var.f442340f = 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePlayer", "setCompletion File[" + d1Var.f442336b + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}
