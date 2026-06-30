package p10;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350992d;

    public s(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350992d = magicDebugPanelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView.G;
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350992d;
        magicDebugPanelView.e();
        magicDebugPanelView.b();
    }
}
