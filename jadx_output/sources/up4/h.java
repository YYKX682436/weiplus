package up4;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.videocomposition.play.VideoCompositionPlayView f429875a;

    /* renamed from: b, reason: collision with root package name */
    public final zv3.c f429876b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.xeffect.effect.EffectManager f429877c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.h1 f429878d;

    public h(r45.h70 compositionInfo, com.tencent.mm.videocomposition.play.VideoCompositionPlayView playView) {
        kotlin.jvm.internal.o.g(compositionInfo, "compositionInfo");
        kotlin.jvm.internal.o.g(playView, "playView");
        this.f429875a = playView;
        zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(compositionInfo);
        this.f429876b = e17;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = new com.tencent.mm.xeffect.effect.EffectManager();
        this.f429877c = effectManager;
        ((zv3.f) e17).e();
        com.tencent.mm.plugin.vlog.model.h1 d17 = com.tencent.mm.plugin.vlog.model.x.d(compositionInfo, effectManager);
        this.f429878d = d17;
        d17.p(e17);
        d17.t(new android.graphics.Rect());
    }

    public final void a() {
        rs0.q a17;
        com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f429878d;
        java.util.Iterator it = h1Var.f175597c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
            if (i1Var.f175617b == 2 && (a17 = rs0.r.f399316a.a(i1Var.f175616a)) != null) {
                h1Var.b(a17.f399313b, a17.f399314c, a17.f399315d);
            }
        }
    }
}
