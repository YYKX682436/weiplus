package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188066e;

    public u(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188065d = kVar;
        this.f188066e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ug3.k kVar = this.f188065d;
        sb6.append(kVar.f392471n);
        sb6.append(", close message notify");
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        com.tencent.mm.plugin.webwx.ui.k0.i(this.f188066e, kVar);
    }
}
