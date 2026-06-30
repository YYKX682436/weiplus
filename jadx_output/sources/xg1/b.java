package xg1;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg1.c f454355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg1.c cVar, java.lang.String str) {
        super(0);
        this.f454355d = cVar;
        this.f454356e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f454356e;
        xg1.c cVar = this.f454355d;
        try {
            android.content.Intent intent = new android.content.Intent(cVar.f454358a, java.lang.Class.forName(str));
            android.content.Context context = cVar.f454358a;
            jz5.g gVar = cVar.f454364g;
            boolean bindService = context.bindService(intent, (xg1.e) ((jz5.n) gVar).getValue(), 64);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: bind " + str + " ret = " + bindService);
            xg1.c.f454357h = !bindService ? null : (xg1.e) ((jz5.n) gVar).getValue();
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: ", e17);
            xg1.c.f454357h = null;
            xg1.h.f454370a.a(cVar.f454363f);
        }
        return jz5.f0.f302826a;
    }
}
