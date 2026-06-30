package oh4;

/* loaded from: classes8.dex */
public final class j extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f345473m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f345474n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f345475o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f345476p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarViewRecommendV2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f345473m = jz5.h.b(oh4.d.f345465d);
        this.f345474n = jz5.h.b(oh4.c.f345464d);
        this.f345475o = jz5.h.b(new oh4.g(this));
        this.f345476p = jz5.h.b(new oh4.f(this));
        gp1.q controller = getController();
        int audioPanelShowStyle = getAudioPanelShowStyle();
        android.widget.FrameLayout parent = getContainerView();
        ip1.q qVar = (ip1.q) controller;
        qVar.getClass();
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarController", "createContentView style: " + audioPanelShowStyle + ", parent: " + parent + ", " + qVar.hashCode());
        if (audioPanelShowStyle == 0) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f396806e);
            audioPanelTaskBarViewRecommendV2 = new com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2(context);
        } else if (audioPanelShowStyle == 1) {
            ((ku5.t0) ku5.t0.f312615d).q(ip1.m.f293592d);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f396807f);
            audioPanelTaskBarViewRecommendV2 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).mj() ? new com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5(context, null) : new com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4(context, null);
        } else if (audioPanelShowStyle != 2) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f396806e);
            audioPanelTaskBarViewRecommendV2 = new com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2(context);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).aj(rk4.l.f396808g);
            audioPanelTaskBarViewRecommendV2 = new com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList(context, null);
        }
        jz5.g gVar = ip1.q.f293607l;
        qk.u8 u8Var = (qk.u8) ((jz5.n) gVar).getValue();
        ip1.h hVar = ip1.q.f293604i;
        ((ef0.j3) u8Var).Ai(hVar);
        ((ef0.j3) ((qk.u8) ((jz5.n) gVar).getValue())).wi(hVar);
        qk.u8 u8Var2 = (qk.u8) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = ip1.q.f293605j;
        ip1.k listener = (ip1.k) ((jz5.n) gVar2).getValue();
        ef0.j3 j3Var = (ef0.j3) u8Var2;
        j3Var.getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        j3Var.f252242f.remove(listener);
        qk.u8 u8Var3 = (qk.u8) ((jz5.n) gVar).getValue();
        ip1.k listener2 = (ip1.k) ((jz5.n) gVar2).getValue();
        ef0.j3 j3Var2 = (ef0.j3) u8Var3;
        j3Var2.getClass();
        kotlin.jvm.internal.o.g(listener2, "listener");
        j3Var2.f252242f.add(listener2);
        ip1.q.f293598c = true;
        ip1.q.f293597b = audioPanelTaskBarViewRecommendV2;
        a(audioPanelTaskBarViewRecommendV2);
        gp1.q controller2 = getController();
        oh4.a aVar = new oh4.a(callback);
        ((ip1.q) controller2).getClass();
        ip1.q.f293602g = aVar;
        kp1.l1 l1Var = ip1.q.f293597b;
        if (l1Var != null) {
            l1Var.setOnEnterTingPlayerCallback(aVar);
        }
        gp1.q controller3 = getController();
        oh4.b bVar = new oh4.b(this);
        ((ip1.q) controller3).getClass();
        ip1.q.f293601f = bVar;
        gp1.q controller4 = getController();
        int audioPanelShowStyle2 = getAudioPanelShowStyle();
        ((ip1.q) controller4).getClass();
        if (audioPanelShowStyle2 != 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(ip1.o.f293594d);
    }

    private final int getAudioPanelShowStyle() {
        return ((java.lang.Number) ((jz5.n) this.f345474n).getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gp1.q getController() {
        java.lang.Object value = ((jz5.n) this.f345473m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (gp1.q) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getNoticeTitleTextView() {
        return (android.widget.TextView) ((jz5.n) this.f345476p).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getTingRedDotArea() {
        return (android.view.View) ((jz5.n) this.f345475o).getValue();
    }

    @Override // lh4.h
    public void c() {
        kp1.l1 l1Var;
        ((ip1.q) getController()).getClass();
        if (ip1.q.f293598c && (l1Var = ip1.q.f293597b) != null) {
            l1Var.d();
        }
    }

    @Override // lh4.h
    public java.lang.String f() {
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        android.content.Context context = getContext();
        int wi6 = ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).wi();
        ((ov.b) zVar).getClass();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (wi6 == 2) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.mc9);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.l8r);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
