package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes4.dex */
public final class u implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c0 f151470d;

    public u(com.tencent.mm.plugin.mv.ui.uic.c0 c0Var) {
        this.f151470d = c0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.mv.ui.uic.c0 c0Var;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList;
        java.util.ArrayList arrayList;
        if (((ym3.o) obj).f463177a != ym3.p.f463181f || (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList = (c0Var = this.f151470d).f151069g) == null || (arrayList = musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList.f152065o) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((im3.j) obj2).f292703i) {
                xm3.t0 t0Var = c0Var.f151070h;
                int a07 = i17 + (t0Var != null ? t0Var.a0() : 0);
                com.tencent.mm.view.recyclerview.WxRecyclerView O6 = com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(O6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                O6.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            i17 = i18;
        }
        if (!(!arrayList.isEmpty())) {
            com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setVisibility(8);
            c0Var.P6().setEnabled(false);
            c0Var.P6().setText(c0Var.getActivity().getString(com.tencent.mm.R.string.f490502ww));
            return;
        }
        com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setVisibility(0);
        c0Var.P6().setEnabled(true);
        c0Var.P6().setText(c0Var.getActivity().getString(com.tencent.mm.R.string.f490502ww) + '(' + arrayList.size() + ')');
    }
}
