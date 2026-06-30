package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.lottery.history.b f120833d;

    public a(com.tencent.mm.plugin.finder.lottery.history.b bVar) {
        this.f120833d = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f120833d.getActivity().finish();
        return true;
    }
}
