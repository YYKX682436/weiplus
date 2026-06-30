package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class hd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173961d;

    public hd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f173961d = textStatusLikeListFragment;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            qj4.s sVar = qj4.s.f363958a;
            int i18 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.f173642y;
            ai4.m0 m0Var = ai4.m0.f5173a;
            mj4.h E = m0Var.E();
            qj4.s.l(sVar, 23L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
            com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f173961d;
            in5.c cVar = (in5.c) kz5.n0.a0(textStatusLikeListFragment.f173646q, textStatusLikeListFragment.f173651v);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("menu delete: ");
            sb6.append(cVar != null);
            sb6.append(", ");
            sb6.append(textStatusLikeListFragment.f173651v);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", sb6.toString());
            if (cVar == null) {
                return;
            }
            textStatusLikeListFragment.f173646q.remove(textStatusLikeListFragment.f173651v);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusLikeListFragment.f173644o;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("rvLikeList");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(textStatusLikeListFragment.f173651v);
            }
            if (cVar instanceof kj4.c) {
                mj4.l lVar = ((kj4.c) cVar).f308454d;
                lVar.field_DeleteInMsgList = 1;
                m0Var.u(lVar);
            } else if (cVar instanceof kj4.a) {
                mj4.e eVar = ((kj4.a) cVar).f308451d;
                eVar.field_DeleteInMsgList = 1;
                m0Var.A(eVar);
            }
        }
    }
}
