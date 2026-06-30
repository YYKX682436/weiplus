package w50;

@j95.b
/* loaded from: classes12.dex */
public class k extends i95.w implements x50.j, x50.i {

    /* renamed from: d, reason: collision with root package name */
    public boolean f442955d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442956e = false;

    public void Ai() {
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        i95.n0.c(qu4.e.class);
        com.tencent.mm.plugin.fts.d0 d0Var = (com.tencent.mm.plugin.fts.d0) zVar;
        d0Var.oj(new pu4.t());
        d0Var.oj(new pu4.r());
        d0Var.oj(new pu4.m());
        com.tencent.mars.xlog.Log.i("FtsExtensionService", "AIHistory UILogic registered");
    }

    public void Bi() {
        ea1.h hVar = new ea1.h();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).pj(hVar);
        hVar.create();
        ea1.g gVar = new ea1.g();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).qj(7, gVar);
        gVar.f();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new ea1.n());
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new ea1.l());
    }

    public void Di() {
        b05.i iVar = new b05.i();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).pj(iVar);
        iVar.create();
        b05.c cVar = new b05.c();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).qj(15, cVar);
        cVar.f();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new b05.j());
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new b05.g());
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        this.f442955d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_local_search_weshop_enabled, true);
        com.tencent.mars.xlog.Log.i("FtsExtensionService", "WeShopEnabled: " + this.f442955d);
        this.f442956e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_local_search_setting_enabled, false);
        com.tencent.mars.xlog.Log.i("FtsExtensionService", "SettingSearchEnabled: " + this.f442956e);
    }

    public java.lang.String wi(u13.g gVar) {
        if (gVar == null || !(gVar instanceof b05.f)) {
            return "";
        }
        tq.d dVar = ((b05.f) gVar).f16982r;
        java.lang.String str = dVar != null ? dVar.f421197b : null;
        return "{\"shopAppId\":\"" + (str != null ? str : "") + "\";\"shopLabelId\":" + (dVar != null ? dVar.f421203h : 0) + '}';
    }
}
