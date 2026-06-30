package es;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f256274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es.t f256275e;

    public s(es.t tVar, boolean z17) {
        this.f256275e = tVar;
        this.f256274d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f256274d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        es.t tVar = this.f256275e;
        kd.c.c("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", valueOf, java.lang.Integer.valueOf(tVar.f256277b));
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = tVar.f256278c;
        swipeBackLayout.f64973t = z17;
        if (!z17) {
            swipeBackLayout.f64976w = false;
        } else if (tVar.f256277b > 0) {
            es.k.b(0.0f);
        } else {
            es.k.b(1.0f);
        }
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout2 = tVar.f256278c;
        swipeBackLayout2.getClass();
        kd.c.c("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", java.lang.Boolean.valueOf(z17));
        swipeBackLayout2.f64974u = z17;
        if (z17) {
            com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout3 = tVar.f256278c;
            if (swipeBackLayout3.f64977x) {
                int i17 = tVar.f256277b;
                if (i17 == 0) {
                    es.g.a(swipeBackLayout3.f64966m, 200L, 0.0f, 0.0f, new es.p(this));
                } else {
                    es.g.a(swipeBackLayout3.f64966m, 200L, i17, 0.0f, new es.r(this));
                    es.k.a(true, tVar.f256277b);
                }
            }
        }
        tVar.f256278c.f64977x = false;
    }
}
