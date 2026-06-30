package kp1;

/* loaded from: classes11.dex */
public final class g1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 f310903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f310904e;

    public g1(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5, boolean z17) {
        this.f310903d = audioPanelTaskBarViewV5;
        this.f310904e = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5 = this.f310903d;
        if (itemId == 0) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (1 == menuItem.getItemId()) {
            jm4.a0 a17 = jm4.c0.f300377d.a();
            if (a17 != null) {
                ((jm4.c0) a17).a("clicfg_ting_radio_audio_square_one_channel", this.f310904e ? "0" : "1");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
            int i18 = jm4.s0.f300422d;
            jm4.q0 q0Var = (jm4.q0) urgen.ur_0025.UR_BC1F.UR_1332();
            if (q0Var != null) {
                urgen.ur_0025.UR_BC1F.UR_4456(((jm4.s0) q0Var).getCppPointer(), true);
            }
        }
        if (2 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.r();
            jm4.a0 a18 = jm4.c0.f300377d.a();
            if (a18 != null) {
                ((jm4.c0) a18).a("clicfg_ting_radio_audio_topline_title", "2");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (3 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.r();
            jm4.a0 a19 = jm4.c0.f300377d.a();
            if (a19 != null) {
                ((jm4.c0) a19).a("clicfg_ting_radio_audio_topline_title", "1");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (4 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.r();
            jm4.a0 a27 = jm4.c0.f300377d.a();
            if (a27 != null) {
                ((jm4.c0) a27).a("clicfg_ting_radio_audio_topline_title", "3");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (5 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.q();
            jm4.a0 a28 = jm4.c0.f300377d.a();
            if (a28 != null) {
                ((jm4.c0) a28).a("clicfg_ting_radio_square_sleep", "1");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (6 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.q();
            jm4.a0 a29 = jm4.c0.f300377d.a();
            if (a29 != null) {
                ((jm4.c0) a29).a("clicfg_ting_radio_square_sleep", "2");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (7 == menuItem.getItemId()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.q();
            jm4.a0 a37 = jm4.c0.f300377d.a();
            if (a37 != null) {
                ((jm4.c0) a37).a("clicfg_ting_radio_square_sleep", "3");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (8 == menuItem.getItemId()) {
            jm4.a0 a38 = jm4.c0.f300377d.a();
            if (a38 != null) {
                ((jm4.c0) a38).a("clicfg_ting_radio_audio_square", "0");
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (9 == menuItem.getItemId()) {
            jm4.a0 a39 = jm4.c0.f300377d.a();
            if (a39 != null) {
                urgen.ur_0025.UR_5379.UR_AB2E(((jm4.c0) a39).getCppPointer());
            }
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.p(audioPanelTaskBarViewV5);
        }
        if (10 == menuItem.getItemId()) {
            bw5.fb0 fb0Var = new bw5.fb0();
            bw5.cb0 cb0Var = new bw5.cb0();
            bw5.t40 t40Var = new bw5.t40();
            java.util.LinkedList linkedList = t40Var.f33245g;
            bw5.x40 x40Var = new bw5.x40();
            bw5.v70 v70Var = new bw5.v70();
            v70Var.q("http://wx.qlogo.cn/finderhead/OwqIpF0eSc5X1ibkMZg1Z4qg4vZVkRN3cZXRwCcKUI7I/0");
            v70Var.x("Finder强插测试");
            x40Var.f34956f = v70Var;
            x40Var.f34959i[3] = true;
            linkedList.add(x40Var);
            cb0Var.f26023m = t40Var;
            cb0Var.f26025o[8] = true;
            fb0Var.f27208e = cb0Var;
            fb0Var.f27214n[2] = true;
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = audioPanelTaskBarViewV5.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            byte[] byteArray = fb0Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            ((rk4.k8) aj6).x(context, byteArray, null, null);
        }
    }
}
