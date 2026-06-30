package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class rc implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210683b;

    public rc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, java.lang.String str) {
        this.f210683b = showVideoUI;
        this.f210682a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f210682a, str2);
        ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.ui.tools.pc(this));
        q75.c.f(str2, this.f210683b.getContext());
        if (this.f210683b.getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 4);
        }
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210683b;
        if (showVideoUI.f210229q) {
            t21.v2 h17 = t21.d3.h(showVideoUI.f210227o);
            if (h17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteVideoPlayUI", "save video");
                return;
            }
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(h17.h(), h17.f415016n);
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Ui(Li, 2, str2, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(Li.Q0(), Li.getMsgId(), 2);
        }
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f210682a, str2);
        ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.ui.tools.qc(this));
    }
}
