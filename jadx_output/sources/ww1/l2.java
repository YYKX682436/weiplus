package ww1;

/* loaded from: classes15.dex */
public final class l2 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UniPcPayUseCaseEvent f450243a;

    public l2(com.tencent.mm.autogen.events.UniPcPayUseCaseEvent uniPcPayUseCaseEvent) {
        this.f450243a = uniPcPayUseCaseEvent;
    }

    @Override // h45.i
    public final void onKindaBusinessCallback(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 0);
        com.tencent.mm.autogen.events.UniPcPayUseCaseEvent uniPcPayUseCaseEvent = this.f450243a;
        am.qz qzVar = uniPcPayUseCaseEvent.f54911h;
        if (qzVar != null) {
            qzVar.f7754a = intExtra;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPayCodeListener", "[callback] retcode : " + intExtra);
        java.lang.Runnable runnable = uniPcPayUseCaseEvent.f54910g.f7683l;
        if (runnable != null) {
            runnable.run();
        }
    }
}
