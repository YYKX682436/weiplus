package ww1;

/* loaded from: classes15.dex */
public class w0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f450319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f450320b;

    public w0(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f450320b = l1Var;
        this.f450319a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "start play money");
        ww1.l1 l1Var = this.f450320b;
        if (l1Var.f450233d != null && l1Var.f450236g && l1Var.f450234e == null) {
            l1Var.o(this.f450319a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "has played");
        }
        l1Var.f450233d = null;
    }
}
