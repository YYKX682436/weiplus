package zk3;

/* loaded from: classes8.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC f473479d;

    public l0(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC) {
        this.f473479d = multiTaskUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = this.f473479d;
        yk3.i iVar = multiTaskUIC.f150593f;
        if (iVar != null) {
            iVar.g("MultiTaskForSnapshotMinusScreen");
        }
        multiTaskUIC.T6(true);
    }
}
