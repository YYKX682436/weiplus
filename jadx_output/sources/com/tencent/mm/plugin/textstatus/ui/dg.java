package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class dg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.k f173814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView f173815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f173816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f173817g;

    public dg(ej4.k kVar, com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView, int i17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f173814d = kVar;
        this.f173815e = textStatusRecentStatusView;
        this.f173816f = i17;
        this.f173817g = recyclerView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.a onRemoveListener;
        bk4.r.f21544a.a(this.f173814d);
        com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView = this.f173815e;
        textStatusRecentStatusView.f173689g.remove(this.f173816f);
        androidx.recyclerview.widget.f2 adapter = this.f173817g.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (textStatusRecentStatusView.f173689g.isEmpty() && (onRemoveListener = textStatusRecentStatusView.getOnRemoveListener()) != null) {
            onRemoveListener.invoke();
        }
        rl5.r rVar = textStatusRecentStatusView.f173692m;
        if (rVar != null) {
            rVar.a();
        }
    }
}
