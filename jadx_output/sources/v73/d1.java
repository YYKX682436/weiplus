package v73;

/* loaded from: classes9.dex */
public class d1 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI f433683a;

    public d1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI honeyPayProxyUI) {
        this.f433683a = honeyPayProxyUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        this.f433683a.finish();
    }
}
