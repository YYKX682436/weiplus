package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.lottery.history.d f120835d;

    public c(com.tencent.mm.plugin.finder.lottery.history.d dVar) {
        this.f120835d = dVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f120835d.getActivity().finish();
        return true;
    }
}
