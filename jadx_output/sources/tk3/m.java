package tk3;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f419931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tk3.t tVar, int i17) {
        super(0);
        this.f419930d = tVar;
        this.f419931e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        tk3.t tVar = this.f419930d;
        if (tVar.p()) {
            boolean z17 = tVar.f419950e;
            if (z17) {
                tk3.d dVar = tVar.f419949d;
                if (dVar != null && (multiTaskNewFloatBallView = dVar.f419913a) != null) {
                    multiTaskNewFloatBallView.setNeedTranslateAnimation(z17);
                }
                tVar.f419950e = false;
            }
            tk3.d dVar2 = tVar.f419949d;
            if (dVar2 != null) {
                com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView2 = dVar2.f419913a;
                if (multiTaskNewFloatBallView2 != null && multiTaskNewFloatBallView2.getVisibility() == 0) {
                    com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView3 = dVar2.f419913a;
                    java.lang.Boolean valueOf = multiTaskNewFloatBallView3 != null ? java.lang.Boolean.valueOf(multiTaskNewFloatBallView3.f150555z) : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", valueOf);
                    if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
                        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView4 = dVar2.f419913a;
                        if (multiTaskNewFloatBallView4 != null) {
                            multiTaskNewFloatBallView4.q(new tk3.a(dVar2));
                        }
                    } else {
                        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView5 = dVar2.f419913a;
                        if (multiTaskNewFloatBallView5 != null) {
                            multiTaskNewFloatBallView5.p(false, false, null);
                        }
                        dVar2.a();
                    }
                } else {
                    dVar2.a();
                }
            }
            tVar.f419949d = null;
            tVar.s(0L);
            java.util.Map map = nk3.e.f338037a;
            ((java.util.LinkedHashMap) map).clear();
            map.put("suspended_ball_source", java.lang.Integer.valueOf(nk3.e.f338040d));
            map.put("suspended_ball_close_type", java.lang.Integer.valueOf(this.f419931e));
            map.put("suspended_ball_sid", nk3.e.f338038b);
            map.put("suspended_ball_startms", java.lang.Long.valueOf(nk3.e.f338039c));
            map.put("suspended_ball_endms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("close_suspended_ball", map, 33488);
        }
        return jz5.f0.f302826a;
    }
}
