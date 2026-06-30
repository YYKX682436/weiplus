package kp1;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310894d;

    public e(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        this.f310894d = audioPanelTaskBarBaseView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView = this.f310894d;
            android.content.Context context = audioPanelTaskBarBaseView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kp1.b bVar = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.f92986o;
            audioPanelTaskBarBaseView.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            k0Var.f211872n = kp1.g.f310901d;
            k0Var.f211881s = new kp1.j(audioPanelTaskBarBaseView);
            k0Var.v();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AudioPanelTaskBarBaseView", th6, "onLongClickTaskBar exception", new java.lang.Object[0]);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
