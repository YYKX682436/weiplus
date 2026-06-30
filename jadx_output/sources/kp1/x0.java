package kp1;

/* loaded from: classes11.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 f310950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f310951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 audioPanelTaskBarViewV4, boolean z17) {
        super(0);
        this.f310950d = audioPanelTaskBarViewV4;
        this.f310951e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 audioPanelTaskBarViewV4 = this.f310950d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(audioPanelTaskBarViewV4.getContext(), 1, false);
        boolean z17 = this.f310951e;
        k0Var.f211872n = new kp1.v0(z17);
        k0Var.f211881s = new kp1.w0(audioPanelTaskBarViewV4, z17);
        k0Var.v();
        return jz5.f0.f302826a;
    }
}
