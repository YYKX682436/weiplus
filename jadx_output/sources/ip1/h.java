package ip1;

/* loaded from: classes8.dex */
public final class h implements rk4.o5 {
    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarController", "audioPanelTaskBar MusicPlayerEvent.callback event: " + i17);
        if (i17 == 1 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 11 || i17 == 12) {
            if (i17 == 3) {
                ip1.r rVar = ip1.r.f293608a;
                ip1.r.f293610c = false;
                com.tencent.mm.sdk.platformtools.o4 o4Var = ip1.r.f293609b;
                if (o4Var != null) {
                    o4Var.putBoolean("key_clear_data_flag", false);
                }
            }
            kp1.l1 l1Var = ip1.q.f293597b;
            if (l1Var != null) {
                ((com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView) l1Var).o();
            }
        }
    }
}
