package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class cd implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173795d;

    public cd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f173795d = textStatusLikeListFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f173795d;
        db5.e1.u(textStatusLikeListFragment.getContext(), textStatusLikeListFragment.getString(com.tencent.mm.R.string.jcq), "", new com.tencent.mm.plugin.textstatus.ui.bd(textStatusLikeListFragment), null);
        return true;
    }
}
