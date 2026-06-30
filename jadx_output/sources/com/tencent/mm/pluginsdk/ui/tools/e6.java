package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class e6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.g6 f191605d;

    public e6(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var) {
        this.f191605d = g6Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.d(menuItem);
        com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = this.f191605d;
        com.tencent.mm.pluginsdk.ui.tools.g6.a(g6Var, menuItem);
        yz5.l lVar = g6Var.f191652i;
        if (lVar != null) {
            lVar.invoke(menuItem);
        }
    }
}
