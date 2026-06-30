package kp1;

/* loaded from: classes11.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310912d;

    public j(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        this.f310912d = audioPanelTaskBarBaseView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
            if (Zi != null) {
                urgen.ur_0025.UR_5769.UR_1818(((jm4.k4) Zi).getCppPointer());
            }
            il4.l.f292146e = null;
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView = this.f310912d;
            audioPanelTaskBarBaseView.f92987d = true;
            ip1.r rVar = ip1.r.f293608a;
            ip1.r.f293610c = true;
            com.tencent.mm.sdk.platformtools.o4 o4Var = ip1.r.f293609b;
            if (o4Var != null) {
                o4Var.putBoolean("key_clear_data_flag", true);
            }
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ni();
            audioPanelTaskBarBaseView.d();
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
            pm0.v.X(rk4.m8.f396853d);
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.f92986o.a(kp1.i.f310909d);
        }
    }
}
