package nv;

/* loaded from: classes9.dex */
public class i3 extends com.tencent.mm.sdk.event.n {
    public i3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String url = ((com.tencent.mm.autogen.events.PomGetA8keyRedirectEvent) iEvent).f54619g.f7356a;
        com.tencent.mars.xlog.Log.i("MM.Mig.StaticPomGetA8keyRedirectEventListener", "receive PomGetA8keyRedirectEvent. url=%s", url);
        final yn1.h4 h4Var = (yn1.h4) ((mv.w) i95.n0.c(mv.w.class));
        h4Var.Ui();
        h4Var.Zi();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: nv.i3$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                final mv.w wVar = mv.w.this;
                sn1.j jVar = (sn1.j) obj;
                final bw5.ud0 ud0Var = (bw5.ud0) jVar.f410031a;
                if (jVar.f410032b != 0 || jVar.f410033c != 0 || ud0Var == null) {
                    yn1.k4.d(false);
                    return;
                }
                yn1.k4.d(true);
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nv.i3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                        if (launcherUI == null) {
                            launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        }
                        ((yn1.h4) mv.w.this).bj(launcherUI, ud0Var, mv.a.f331473i);
                    }
                });
            }
        };
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new sn1.y(url, consumer, null), 3, null);
        } else {
            yn1.k4.d(false);
        }
        return false;
    }
}
