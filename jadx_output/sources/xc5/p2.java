package xc5;

/* loaded from: classes12.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f453550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(xc5.s2 s2Var, mf3.k kVar) {
        super(1);
        this.f453550d = s2Var;
        this.f453551e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xc5.v2 v2Var;
        mf3.s sVar;
        mf3.k kVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        xc5.s2 s2Var = this.f453550d;
        s2Var.f453567y = false;
        mf3.k kVar2 = this.f453551e;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoBottomBarLayer", "download origin video success. mediaId: " + kVar2.getId());
            lg3.a aVar = s2Var.f453565w;
            if (aVar != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(kVar2, new vf3.f(vf3.e.f436381h, null, 0, 0.0f, 14, null));
            }
            kVar2.f(mf3.w.f326128d);
            s2Var.i0();
            xc5.u2 u2Var = (xc5.u2) s2Var.g(xc5.u2.class);
            if (u2Var != null && (sVar = (v2Var = (xc5.v2) u2Var).f326110m) != null && (kVar = sVar.f326117a) != null) {
                v2Var.B = ((java.lang.Number) ((ig3.i) v2Var.U()).a().f302833d).intValue();
                v2Var.C = ((ig3.i) v2Var.U()).b();
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoPreviewLayer", "reload, savedProgressMs:" + v2Var.B + " wasPlaying:" + v2Var.C);
                v2Var.A = true;
                gg3.b bVar = (gg3.b) v2Var.H(gg3.b.class);
                if (bVar != null) {
                    bVar.a5(kVar, v2Var);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoBottomBarLayer", "download origin video failed. mediaId: " + kVar2.getId());
            kVar2.f(mf3.w.f326128d);
            lg3.a aVar2 = s2Var.f453565w;
            if (aVar2 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar2, new vf3.f(vf3.e.f436382i, null, 0, 0.0f, 14, null));
            }
        }
        s2Var.a0();
        return jz5.f0.f302826a;
    }
}
