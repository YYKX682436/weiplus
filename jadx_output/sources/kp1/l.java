package kp1;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ np1.a f310918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(np1.a aVar, com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        super(0);
        this.f310918d = aVar;
        this.f310919e = audioPanelTaskBarBaseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        ((ov.b) zVar).T7(this.f310918d, 5, this.f310919e.getRecentPlayControlType());
        return jz5.f0.f302826a;
    }
}
