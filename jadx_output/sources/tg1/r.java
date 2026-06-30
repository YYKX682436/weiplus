package tg1;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tg1.s f419153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.k9 f419154b;

    public r(tg1.s sVar, com.tencent.mm.plugin.appbrand.launching.k9 k9Var) {
        this.f419153a = sVar;
        this.f419154b = k9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        tg1.s sVar = this.f419153a;
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, get contact info fail");
            tg1.t.a(sVar);
            return;
        }
        boolean b17 = v5Var.u0().b();
        com.tencent.mm.plugin.appbrand.launching.k9 k9Var = this.f419154b;
        if (!(k9Var.v0("banJumpGame") && b17) && (!k9Var.v0("banJumpApp") || b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, no need to ban jump");
            tg1.t.a(sVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, return should ban jump");
        if (sVar != null) {
            tg1.b bVar = (tg1.b) sVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsLinkOpener", "[banjump] should ban, from appid:%s, to username:%s", bVar.f419122a, bVar.f419123b);
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new tg1.a(bVar));
        }
    }
}
