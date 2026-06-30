package i81;

/* loaded from: classes7.dex */
public class c0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f289555d;

    public c0(i81.b0 b0Var, yz5.a aVar) {
        this.f289555d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f289555d;
        if (aVar == null) {
            return null;
        }
        aVar.invoke();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke2");
        return null;
    }
}
