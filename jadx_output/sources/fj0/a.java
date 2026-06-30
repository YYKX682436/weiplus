package fj0;

/* loaded from: classes9.dex */
public final class a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263096d;

    public a(java.lang.String str) {
        this.f263096d = str;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "mmSetOnActivityResultCallback: " + i17 + ", " + i18 + ", " + intent);
        com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback = (com.tencent.kinda.gen.VoidITransmitKvDataCallback) fj0.c.f263100a.remove(this.f263096d);
        if (voidITransmitKvDataCallback != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "callback from activity result");
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putString("procSts", "0001");
            create.putInt("ret_scene", 2);
            voidITransmitKvDataCallback.call(create);
        }
    }
}
