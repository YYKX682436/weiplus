package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f151120e;

    public f(com.tencent.mm.plugin.mv.ui.uic.q qVar, j75.d dVar) {
        this.f151119d = qVar;
        this.f151120e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.oc5 oc5Var = ((pm3.b) this.f151120e).f356870b;
        java.lang.String str = oc5Var.f382151f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oc5Var.f382152g;
        java.lang.String str3 = str2 != null ? str2 : "";
        com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151119d;
        int O6 = com.tencent.mm.plugin.mv.ui.uic.q.O6(qVar, oc5Var, str, str3);
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) qVar.f151362e).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(O6));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        wxLinearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        qVar.getRecyclerView().post(new com.tencent.mm.plugin.mv.ui.uic.e(qVar));
    }
}
