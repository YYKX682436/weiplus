package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class kc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210535d;

    public kc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210535d = showVideoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 2) {
            return;
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210535d;
        ((g90.s) vVar).Zi(showVideoUI, showVideoUI.f210236x, showVideoUI.K, 2, 4, 4);
        h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI2 = this.f210535d;
        ((g90.s) vVar2).nj(showVideoUI2.f210236x, 3, 4, 2);
        t21.v2 h17 = t21.d3.h(showVideoUI2.f210227o);
        if (h17 == null) {
            showVideoUI2.a7(showVideoUI2.f210221f, showVideoUI2);
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share]video is null");
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(h17.h(), h17.f415016n);
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        if (((g90.u) wVar).Bi(Li, 2) != 3 || ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(Li, 2) != 4) {
            h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr2 = h90.a.f279671d;
            if (((g90.u) wVar2).Bi(Li, 5) != 3) {
                showVideoUI2.a7(showVideoUI2.f210221f, showVideoUI2);
                return;
            }
        }
        com.tencent.mm.ui.tools.a1.d(this.f210535d, Li, ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Bi(Li, 2) == 3 && ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(Li, 2) == 4, true, 4, 2, new com.tencent.mm.ui.tools.s0() { // from class: com.tencent.mm.ui.tools.kc$$a
            @Override // com.tencent.mm.ui.tools.s0
            public final void a() {
                com.tencent.mm.ui.tools.ShowVideoUI showVideoUI3 = com.tencent.mm.ui.tools.kc.this.f210535d;
                showVideoUI3.a7(showVideoUI3.f210221f, showVideoUI3);
            }
        });
    }
}
