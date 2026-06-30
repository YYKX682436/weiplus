package w35;

/* loaded from: classes8.dex */
public final class c implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w35.d f442727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442728b;

    public c(w35.d dVar, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        this.f442727a = dVar;
        this.f442728b = wVar;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        com.tencent.mm.pluginsdk.model.p3 p3Var;
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        w35.d dVar = this.f442727a;
        kb0.g gVar = dVar.f442729e;
        if (gVar != null) {
            gVar.f(false);
        }
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(dVar.f442723a.f189315h);
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = this.f442728b;
        if (Bi && (p3Var = dVar.f442723a.f189319l) != null && (k0Var = p3Var.f189406c) != null) {
            ((kb0.f) k0Var).a(false, wVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppCancel, itemType: " + wVar.h());
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        com.tencent.mm.pluginsdk.model.p3 p3Var;
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        w35.d dVar = this.f442727a;
        kb0.g gVar = dVar.f442729e;
        if (gVar != null) {
            java.util.HashMap i17 = kz5.c1.i(new jz5.l("has_install_yuanbao", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) gVar.f306204h).getValue()).intValue())));
            i17.putAll(gVar.f306201e);
            java.util.Map map = gVar.f306198b;
            if (map != null) {
                i17.putAll(map);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_exp", i17, 35480);
        }
        jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
        com.tencent.mm.pluginsdk.model.g2 g2Var = dVar.f442723a;
        if (!((jb0.g) xVar).Bi(g2Var.f189315h) || (p3Var = g2Var.f189319l) == null || (k0Var = p3Var.f189406c) == null) {
            return;
        }
        ((kb0.f) k0Var).b(this.f442728b);
    }

    @Override // xj.l
    public void onJumpAppFail() {
        w35.a aVar = this.f442727a.f442724b;
        if (aVar != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppFail, itemType: " + this.f442728b.h());
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        java.lang.String str;
        w35.d dVar = this.f442727a;
        w35.a aVar = dVar.f442724b;
        if (aVar != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
        }
        kb0.g gVar = dVar.f442729e;
        if (gVar != null) {
            gVar.f(true);
        }
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(dVar.f442723a.f189315h);
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = this.f442728b;
        if (Bi) {
            xj.m mVar = wVar.f191022o;
            if (mVar != null && (str = mVar.f454758f) != null) {
                com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(str, dVar.f442725c);
            }
            com.tencent.mm.pluginsdk.model.p3 p3Var = dVar.f442723a.f189319l;
            if (p3Var != null && (k0Var = p3Var.f189406c) != null) {
                ((kb0.f) k0Var).a(true, wVar);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayControllerAd", "onJumpAppSuccess, itemType: " + wVar.h());
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        w35.d dVar = this.f442727a;
        kb0.g gVar = dVar.f442729e;
        if (gVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("jump_yuanbao_download_end", gVar.f306201e, 35480);
        }
        w35.a aVar = dVar.f442724b;
        if (aVar != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayControllerAd", "onJumpDownloadPage, itemType: " + this.f442728b.h());
    }
}
