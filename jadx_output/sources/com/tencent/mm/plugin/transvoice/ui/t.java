package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v f175469d;

    public t(com.tencent.mm.plugin.transvoice.ui.v vVar) {
        this.f175469d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f175469d.getActivity().finish();
        return true;
    }
}
