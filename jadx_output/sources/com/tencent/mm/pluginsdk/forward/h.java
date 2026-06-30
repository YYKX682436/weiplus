package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.forward.m f188710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f188711e;

    public h(com.tencent.mm.pluginsdk.forward.m mVar, yz5.l lVar) {
        this.f188710d = mVar;
        this.f188711e = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        com.tencent.mm.pluginsdk.forward.g gVar = new com.tencent.mm.pluginsdk.forward.g(this.f188711e);
        this.f188710d.aj((db5.h4) menuItem, gVar);
    }
}
