package le;

/* loaded from: classes7.dex */
public abstract class e extends com.tencent.luggage.bridge.impl.c {
    @Override // pd.c
    public void a(pd.b bVar) {
        ((com.tencent.mm.plugin.appbrand.jsapi.n) bVar).b(o91.d.class, this.f47202a);
    }

    @Override // pd.c
    public void b(pd.d dVar) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.tencent.mm.vfs.b3.E = context;
        dVar.b(o91.d.class, this.f47202a);
        dVar.b(kf1.h.class, new kf1.k());
        dVar.b(jf1.b.class, new jf1.a());
    }
}
