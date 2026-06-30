package zk3;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC f473474d;

    public k0(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC) {
        this.f473474d = multiTaskUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = this.f473474d.f150602r;
        if (dynamicBgContainer != null) {
            dynamicBgContainer.b(false);
        }
    }
}
