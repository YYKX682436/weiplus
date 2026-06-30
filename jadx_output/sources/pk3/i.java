package pk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.l f356450d;

    public i(pk3.l lVar) {
        this.f356450d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk3.l lVar = this.f356450d;
        pk3.e eVar = lVar.f356458d;
        if (eVar != null) {
            if (eVar != null) {
                com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = eVar.f356441a;
                if (multiTaskFloatBallView != null && multiTaskFloatBallView.getVisibility() == 0) {
                    com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView2 = eVar.f356441a;
                    if (multiTaskFloatBallView2 != null && multiTaskFloatBallView2.getVisibility() == 0) {
                        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView3 = eVar.f356441a;
                        java.lang.Boolean valueOf = multiTaskFloatBallView3 != null ? java.lang.Boolean.valueOf(multiTaskFloatBallView3.f150522u) : null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", valueOf);
                        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
                            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView4 = eVar.f356441a;
                            if (multiTaskFloatBallView4 != null) {
                                multiTaskFloatBallView4.m(new pk3.c(eVar));
                            }
                        } else {
                            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView5 = eVar.f356441a;
                            if (multiTaskFloatBallView5 != null) {
                                multiTaskFloatBallView5.l(false, false, null);
                            }
                            eVar.a();
                        }
                    }
                } else {
                    eVar.a();
                }
            }
            lVar.f356458d = null;
        }
    }
}
