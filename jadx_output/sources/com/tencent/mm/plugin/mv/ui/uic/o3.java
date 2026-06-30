package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o3 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151341a;

    public o3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var) {
        this.f151341a = h4Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged: ");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151341a;
        sb6.append(h4Var.R6().getItemCount());
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        if (h4Var.f151167n.f151864m == -1) {
            h4Var.S6().post(new com.tencent.mm.plugin.mv.ui.uic.m3(h4Var));
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemRangeChanged, start:");
        sb6.append(i17);
        sb6.append(", itemCount:");
        sb6.append(i18);
        sb6.append(", lastPos:");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151341a;
        sb6.append(h4Var.f151169p);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        int i19 = i18 + i17;
        int i27 = h4Var.f151169p;
        boolean z17 = false;
        if (i17 <= i27 && i27 < i19) {
            z17 = true;
        }
        if (z17) {
            h4Var.S6().post(new com.tencent.mm.plugin.mv.ui.uic.n3(h4Var));
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onItemRangeChanged, start:" + i17 + ", itemCount:" + i18 + ", lastPos:" + this.f151341a.f151169p + ", payload:" + obj);
            c(i17, i18);
        }
    }
}
