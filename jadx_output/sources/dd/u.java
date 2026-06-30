package dd;

/* loaded from: classes9.dex */
public final class u extends com.tencent.kinda.gen.VoidITransmitKvDataCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228894a;

    public u(yz5.p pVar) {
        this.f228894a = pVar;
    }

    @Override // com.tencent.kinda.gen.VoidITransmitKvDataCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.StartNativeUseCaseImpl", "quit callback");
        this.f228894a.invoke(dd.c.j(dd.d.f228871a, null, null, 3, null), java.lang.Boolean.FALSE);
    }
}
