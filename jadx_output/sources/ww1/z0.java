package ww1;

/* loaded from: classes15.dex */
public class z0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f450369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f450370b;

    public z0(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f450370b = l1Var;
        this.f450369a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "no need to play money this time");
        ww1.l1 l1Var = this.f450370b;
        ww1.l1.b(l1Var);
        l1Var.f450236g = false;
        l1Var.f450233d = null;
        boolean z17 = tw1.f.Di().f422451d;
        ww1.k1 k1Var = this.f450369a;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14404, 4, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14404, 4, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b));
        }
        if (l1Var.f450235f.isEmpty()) {
            ww1.l1.i();
        } else {
            l1Var.u();
        }
    }
}
