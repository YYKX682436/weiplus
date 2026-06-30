package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes5.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.plugin.wallet_core.id_verify.x xVar, android.content.Context context) {
        xVar.getClass();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = of5.b.a(context).getString(com.tencent.mm.R.string.kea);
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490507x1);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
