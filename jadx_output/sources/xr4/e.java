package xr4;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.wallet_core.g {
    public e(xr4.f fVar) {
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("PayStartBalanceFetchEvent", "balance fetch process end");
        am.yh yhVar = new com.tencent.mm.autogen.events.JsapiResultEvent().f54449g;
        yhVar.f8461a = 17;
        yhVar.f8462b = -1;
        return null;
    }
}
