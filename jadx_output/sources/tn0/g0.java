package tn0;

/* loaded from: classes10.dex */
public final class g0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420672e;

    public g0(tn0.w0 w0Var, java.lang.String str) {
        this.f420671d = w0Var;
        this.f420672e = str;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        int videoHeight;
        int videoWidth;
        tn0.w0 w0Var = this.f420671d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = w0Var.X;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "startPushLocalVideo success");
        go0.f0 f0Var = w0Var.f420771r;
        ts0.c cVar = ts0.c.f421541a;
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(this.f420672e, true);
        if (d17 != null) {
            videoHeight = d17.f162385d;
        } else {
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = w0Var.X;
            videoHeight = iTPPlayer3 != null ? iTPPlayer3.getVideoHeight() : 0;
        }
        ts0.c.f421542b = videoHeight;
        if (d17 != null) {
            videoWidth = d17.f162384c;
        } else {
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer4 = w0Var.X;
            videoWidth = iTPPlayer4 != null ? iTPPlayer4.getVideoWidth() : 0;
        }
        ts0.c.f421543c = videoWidth;
        ts0.c.f421544d = d17 != null ? d17.f162395n : 0;
        ts0.c.f421548h = false;
        f0Var.w(cVar);
        w0Var.f420771r.setOnDrawListener(new tn0.f0(w0Var));
    }
}
