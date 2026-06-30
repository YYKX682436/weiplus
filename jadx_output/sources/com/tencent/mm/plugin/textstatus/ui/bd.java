package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class bd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173753d;

    public bd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f173753d = textStatusLikeListFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qj4.s sVar = qj4.s.f363958a;
        int i18 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.f173642y;
        ai4.m0 m0Var = ai4.m0.f5173a;
        mj4.h E = m0Var.E();
        qj4.s.l(sVar, 24L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f173753d;
        textStatusLikeListFragment.f173646q.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusLikeListFragment.f173644o;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("rvLikeList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        m0Var.f();
    }
}
