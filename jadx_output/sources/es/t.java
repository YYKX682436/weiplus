package es;

/* loaded from: classes15.dex */
public class t extends es.w implements es.b {

    /* renamed from: a, reason: collision with root package name */
    public int f256276a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f256277b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ext.ui.SwipeBackLayout f256278c;

    public t(com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout, es.l lVar) {
        this.f256278c = swipeBackLayout;
    }

    @Override // es.w
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = this.f256278c;
        if (!swipeBackLayout.f64974u) {
            kd.c.e("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mHasTranslucent is false", new java.lang.Object[0]);
            return;
        }
        swipeBackLayout.f64968o = java.lang.Math.abs(i17 / (swipeBackLayout.f64966m.getWidth() + swipeBackLayout.f64969p.getIntrinsicWidth()));
        swipeBackLayout.f64962f = i17;
        swipeBackLayout.f64963g = i18;
        swipeBackLayout.invalidate();
        es.n nVar = swipeBackLayout.f64979z;
        if (nVar != null) {
            float f17 = swipeBackLayout.f64968o;
            al5.g3 g3Var = ((pa3.q) nVar).f352998a.f5585g;
            kotlin.jvm.internal.o.d(g3Var);
            ((ak3.h) g3Var).R(i17, i18, i19, i27, f17);
        }
        if (java.lang.Float.compare(swipeBackLayout.f64968o, 1.0f) >= 0 && !swipeBackLayout.f64975v) {
            swipeBackLayout.f64975v = true;
            swipeBackLayout.B.post(new es.o(this));
        } else if (java.lang.Float.compare(swipeBackLayout.f64968o, 0.01f) <= 0) {
            swipeBackLayout.f64976w = false;
            kd.c.e("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s", java.lang.Float.valueOf(swipeBackLayout.f64968o), java.lang.Boolean.valueOf(swipeBackLayout.f64975v));
        }
        if (swipeBackLayout.f64967n.f256286a == 1) {
            es.k.b(swipeBackLayout.f64968o);
        }
    }
}
