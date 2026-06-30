package es;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es.t f256270d;

    public o(es.t tVar) {
        this.f256270d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        es.t tVar = this.f256270d;
        if (tVar.f256278c.E != null) {
            kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on popOut", new java.lang.Object[0]);
            if (tVar.f256278c.getContext() instanceof android.app.Activity) {
                com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = tVar.f256278c;
                if (swipeBackLayout.A != null) {
                    if (swipeBackLayout.D) {
                        ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(tVar.f256278c.A);
                    }
                    tVar.f256278c.A = null;
                }
            }
            ((com.tencent.mm.ext.ui.SwipeBackActivity) tVar.f256278c.E).onSwipeBack();
        }
        tVar.f256278c.f64976w = false;
    }
}
