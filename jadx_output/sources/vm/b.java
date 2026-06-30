package vm;

@j95.b
/* loaded from: classes16.dex */
public class b extends i95.w implements xs.x0 {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CaraFeatureService", "CaraFeatureNativeImplOnLoader setup");
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeAccountFeatureCenter(an.a.class);
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeFeatureCenter(an.e.class);
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeContactFeatureCenter(an.c.class);
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeLiveFeatureCenter(an.f.class);
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeDiscoverViewFeatureCenter(an.d.class);
        com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader.getInstance().registerCaraNativeSessionFeatureCenter(an.g.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.CaraFeatureService", "CaraFoundationNativeImplOnLoader setup");
        com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader.getInstance().registerCaraNativeApp(bn.a.class);
        com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader.getInstance().registerCaraNativeDevice(bn.c.class);
        com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader.getInstance().registerCaraUserContext(bn.b.class);
        com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader.getInstance().registerCaraAndroidSo(bn.d.class);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.mars.xlog.Log.i("MicroMsg.CaraFeatureService", "CaraCpp launch start");
        com.tencent.wechat.aff.cara.CaraCpp.getInstance().launch();
        com.tencent.mars.xlog.Log.i("MicroMsg.CaraFeatureService", "CaraCpp launch finish");
        ku5.u0 u0Var = ku5.t0.f312615d;
        vm.a aVar = new vm.a(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(aVar, 0L, null);
    }
}
