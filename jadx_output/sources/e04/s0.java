package e04;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UniPcPayUseCaseEvent f246083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f246084e;

    public s0(e04.p pVar, com.tencent.mm.autogen.events.UniPcPayUseCaseEvent uniPcPayUseCaseEvent) {
        this.f246084e = pVar;
        this.f246083d = uniPcPayUseCaseEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.qz qzVar;
        com.tencent.mm.autogen.events.UniPcPayUseCaseEvent uniPcPayUseCaseEvent = this.f246083d;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，errorCode：%s", java.lang.Integer.valueOf(uniPcPayUseCaseEvent.f54911h.f7754a));
        java.lang.ref.WeakReference weakReference = uniPcPayUseCaseEvent.f54910g.f7682k;
        if (weakReference == null || weakReference.get() == null || (qzVar = uniPcPayUseCaseEvent.f54911h) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QBarStringHandler", "[do UniPcPay] event.data.contextRef.get() == null || event.result == null ");
            return;
        }
        int i17 = qzVar.f7754a;
        e04.p pVar = this.f246084e;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，scan continue ");
            pVar.D(true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay] callback，scan finish");
        am.pz pzVar = uniPcPayUseCaseEvent.f54910g;
        pzVar.f7682k = null;
        pzVar.f7683l = null;
        pVar.D(false);
    }
}
