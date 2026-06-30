package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class y0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.z0 f183367d;

    public y0(com.tencent.mm.plugin.webview.modeltools.z0 z0Var) {
        this.f183367d = z0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.webview.modeltools.z0 z0Var = this.f183367d;
        z0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPublishImageEntryHelper", "onPublishImageClick");
        nw4.n nVar = z0Var.f183376a.f183844p0;
        if (nVar == null) {
            return true;
        }
        nVar.i0("onPublishImageEntryClick", null, null);
        return true;
    }
}
