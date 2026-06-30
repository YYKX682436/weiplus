package es;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es.r f256272d;

    public q(es.r rVar) {
        this.f256272d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        es.r rVar = this.f256272d;
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = rVar.f256273a.f256275e.f256278c;
        if (swipeBackLayout.E != null) {
            if (swipeBackLayout.getContext() instanceof android.app.Activity) {
                com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout2 = rVar.f256273a.f256275e.f256278c;
                if (swipeBackLayout2.A != null) {
                    if (swipeBackLayout2.D) {
                        ((android.app.Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackground(rVar.f256273a.f256275e.f256278c.A);
                    }
                    rVar.f256273a.f256275e.f256278c.A = null;
                }
            }
            ((com.tencent.mm.ext.ui.SwipeBackActivity) rVar.f256273a.f256275e.f256278c.E).onSwipeBack();
            kd.c.a("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack", new java.lang.Object[0]);
        }
        es.k.b(1.0f);
        rVar.f256273a.f256275e.f256278c.f64976w = false;
    }
}
