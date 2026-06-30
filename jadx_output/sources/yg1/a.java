package yg1;

/* loaded from: classes7.dex */
public class a extends com.tencent.luggage.bridge.impl.c {

    /* renamed from: b, reason: collision with root package name */
    public static final z81.k f462315b = new zg1.d();

    @Override // pd.c
    public void a(pd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageInitDelegateWxImpl", "onInitComponent %s", bm5.f1.a());
        ((com.tencent.mm.plugin.appbrand.jsapi.n) bVar).b(o91.d.class, this.f47202a);
    }

    @Override // pd.c
    public void b(pd.d dVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageInitDelegateWxImpl", "onInitialize %s", bm5.f1.a());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.tencent.mm.vfs.b3.E = context;
        dVar.b(o91.d.class, this.f47202a);
        dVar.b(z81.k.class, f462315b);
    }
}
