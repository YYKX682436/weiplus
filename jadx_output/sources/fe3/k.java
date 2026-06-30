package fe3;

/* loaded from: classes7.dex */
public class k implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo f261558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f261559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.m0 f261560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe3.j f261561e;

    public k(fe3.j jVar, java.lang.String str, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo, boolean z17, jc3.m0 m0Var) {
        this.f261561e = jVar;
        this.f261557a = str;
        this.f261558b = wxaMagicPkgInfo;
        this.f261559c = z17;
        this.f261560d = m0Var;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        fe3.j jVar = this.f261561e;
        java.lang.String str = this.f261557a;
        jVar.getClass();
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lc3.z g17 = ((ue3.f) wi6).g("MagicPkgIntervalTime" + str, java.lang.String.valueOf(currentTimeMillis), "String");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time:%d,errNo:%d,errMsg:%s", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(g17.f317944a), g17.f317945b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time fail mmkv is nil", str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347349d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkgWithBoots, url is null, lowerPkgId:" + this.f261557a);
            jc3.m0 m0Var = this.f261560d;
            if (m0Var != null) {
                com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = this.f261558b;
                if (wxaMagicPkgInfo != null) {
                    m0Var.K(wxaMagicPkgInfo);
                } else {
                    m0Var.J("url is nil");
                }
            }
            this.f261561e.j(this.f261557a, this.f261558b, 0, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Check, 2, 10000, this.f261559c);
            return;
        }
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo2 = this.f261558b;
        if (wxaMagicPkgInfo2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo2.f147866o) && !com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347357l) && com.tencent.mm.sdk.platformtools.t8.P(this.f261558b.f147866o, 0) >= com.tencent.mm.sdk.platformtools.t8.P(qVar.f347357l, 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkgWithBoots, pkgId:%s,patchId:%s,cur version:%s big than svr version:%s", qVar.f347355j, qVar.f347351f, this.f261558b.f147866o, qVar.f347357l);
            this.f261561e.j(this.f261557a, this.f261558b, 0, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Check, 2, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, this.f261559c);
            jc3.m0 m0Var2 = this.f261560d;
            if (m0Var2 != null) {
                m0Var2.J("cur version big than svr version");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "start to download magicpkg:%s,patchid:%s,url:%s", qVar.f347355j, qVar.f347351f, qVar.f347349d);
        fe3.i.INSTANCE.a(qVar, this.f261558b, this.f261557a, this.f261560d);
        this.f261561e.j(this.f261557a, this.f261558b, 0, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Check, 1, 0, this.f261559c);
        if (this.f261557a.equalsIgnoreCase("MagicPkgConfig".toLowerCase())) {
            if (fe3.e.f261541a == null) {
                synchronized (fe3.e.class) {
                    fe3.e.f261541a = new fe3.e();
                }
            }
            fe3.e.f261541a.getClass();
        }
    }
}
