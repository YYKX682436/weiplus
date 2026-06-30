package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class p1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f161416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg f161417e;

    public p1(com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg previewHdHeadImg, boolean z17) {
        this.f161417e = previewHdHeadImg;
        this.f161416d = z17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg previewHdHeadImg = this.f161417e;
        com.tencent.mm.plugin.setting.ui.setting.tq tqVar = (com.tencent.mm.plugin.setting.ui.setting.tq) previewHdHeadImg.component(com.tencent.mm.plugin.setting.ui.setting.tq.class);
        boolean z17 = this.f161416d;
        tqVar.P6(new com.tencent.mm.plugin.setting.ui.setting.oq(z17));
        g4Var.a(5, com.tencent.mm.R.string.phm);
        g4Var.a(1, com.tencent.mm.R.string.ipw);
        if (com.tencent.mm.storage.z3.L4(previewHdHeadImg.f160157d)) {
            return;
        }
        if (z17) {
            g4Var.o(4, previewHdHeadImg.getString(com.tencent.mm.R.string.p9q), previewHdHeadImg.getString(com.tencent.mm.R.string.p9s));
            com.tencent.mm.plugin.setting.ui.setting.tq tqVar2 = (com.tencent.mm.plugin.setting.ui.setting.tq) previewHdHeadImg.component(com.tencent.mm.plugin.setting.ui.setting.tq.class);
            xj.m mVar = tqVar2.f161587d;
            if (mVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "reportAdExpose: aid=" + mVar.f454753a);
                i95.m c17 = i95.n0.c(xj.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                xj.i.gg((xj.i) c17, mVar.f454753a, wj.w0.f446541d, null, 4, null);
                tqVar2.f161588e = true;
            }
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str = previewHdHeadImg.f160157d;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap b17 = com.tencent.mm.modelavatar.g.b(str, true, -1, null);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        if (com.tencent.mm.vfs.w6.j(com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".last", true, false))) {
            g4Var.a(3, com.tencent.mm.R.string.ixz);
        }
        if (b17 != null) {
            g4Var.a(2, com.tencent.mm.R.string.frw);
        }
    }
}
