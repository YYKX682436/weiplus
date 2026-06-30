package fj0;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f263098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1 f263099f;

    public b(java.lang.String str, android.app.Activity activity, com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1 dCEPHandler$startDCEPPay$observer$1) {
        this.f263097d = str;
        this.f263098e = activity;
        this.f263099f = dCEPHandler$startDCEPPay$observer$1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback = (com.tencent.kinda.gen.VoidITransmitKvDataCallback) fj0.c.f263100a.remove(this.f263097d);
        if (voidITransmitKvDataCallback != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "callback from resume");
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putString("procSts", "0001");
            create.putInt("ret_scene", 2);
            voidITransmitKvDataCallback.call(create);
            android.app.Activity activity = this.f263098e;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.MMFragmentActivity) activity).mo133getLifecycle().c(this.f263099f);
        }
    }
}
