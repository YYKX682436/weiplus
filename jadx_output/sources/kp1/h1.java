package kp1;

/* loaded from: classes11.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 f310907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f310908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5, boolean z17) {
        super(0);
        this.f310907d = audioPanelTaskBarViewV5;
        this.f310908e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5 = this.f310907d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(audioPanelTaskBarViewV5.getContext(), 1, false);
        boolean z17 = this.f310908e;
        k0Var.f211872n = new kp1.f1(z17);
        k0Var.f211881s = new kp1.g1(audioPanelTaskBarViewV5, z17);
        k0Var.v();
        return jz5.f0.f302826a;
    }
}
