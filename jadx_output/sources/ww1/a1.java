package ww1;

/* loaded from: classes15.dex */
public class a1 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f450084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f450085b;

    public a1(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f450085b = l1Var;
        this.f450084a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.F2fRcvVoiceListener", "no need play money error");
        ww1.l1 l1Var = this.f450085b;
        ww1.l1.b(l1Var);
        l1Var.f450236g = false;
        l1Var.f450233d = null;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        ww1.k1 k1Var = this.f450084a;
        g0Var.d(14404, 3, k1Var.f450224c, 7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k1Var.f450223b));
        return false;
    }
}
