package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class yc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.zc f174456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f174457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.w f174458f;

    public yc(com.tencent.mm.plugin.textstatus.ui.zc zcVar, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, in5.w wVar) {
        this.f174456d = zcVar;
        this.f174457e = wxRecyclerAdapter;
        this.f174458f = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.zc zcVar = this.f174456d;
        java.util.ArrayList arrayList2 = zcVar.f174484c;
        int size = arrayList2.size();
        java.util.ArrayList arrayList3 = zcVar.f174485d;
        int size2 = arrayList3.size();
        arrayList2.clear();
        ai4.m0 m0Var = ai4.m0.f5173a;
        arrayList2.addAll(m0Var.k());
        arrayList3.clear();
        arrayList3.addAll(m0Var.l());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "reInit: old=[" + size + ',' + size2 + "], new=[" + arrayList2.size() + ',' + arrayList3.size() + ']');
        zcVar.f174486e = size;
        zcVar.f174487f = size2;
        zcVar.f174488g = null;
        zcVar.f174489h = null;
        in5.n0.h0(this.f174457e, this.f174458f.getItemId(), false, 2, null);
        zcVar.b();
        qj4.s sVar = qj4.s.f363958a;
        int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.f173642y;
        mj4.h E = m0Var.E();
        qj4.s.l(sVar, 11L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
