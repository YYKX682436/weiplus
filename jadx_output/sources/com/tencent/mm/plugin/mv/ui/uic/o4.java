package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes4.dex */
public final class o4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151342d;

    public o4(com.tencent.mm.plugin.mv.ui.uic.v4 v4Var) {
        this.f151342d = v4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151342d;
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) v4Var.f151494n).getValue();
            int size = v4Var.f151491h.f152065o.size() - 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(size));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
