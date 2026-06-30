package mx0;

/* loaded from: classes5.dex */
public final class y6 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332453a;

    public y6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f332453a = shootComposingPluginLayout;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332453a;
        if (shootComposingPluginLayout.I1) {
            shootComposingPluginLayout.y0();
            shootComposingPluginLayout.u0();
        }
        shootComposingPluginLayout.t0(false);
    }
}
