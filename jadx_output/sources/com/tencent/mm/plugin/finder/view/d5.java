package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class d5 {
    public d5(kotlin.jvm.internal.i iVar) {
    }

    public static com.tencent.mm.plugin.finder.view.f5 a(com.tencent.mm.plugin.finder.view.d5 d5Var, long j17, int i17, com.tencent.mm.ui.MMFragmentActivity context, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        if ((i27 & 32) != 0) {
            z17 = false;
        }
        d5Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.f5 f5Var = new com.tencent.mm.plugin.finder.view.f5(i18, z17, null, 4, null);
        f5Var.f132073g = j17;
        f5Var.f132074h = i17;
        f5Var.f132068b = context;
        f5Var.f132067a = null;
        f5Var.f132072f = true;
        return f5Var;
    }

    public final com.tencent.mm.plugin.finder.view.f5 b(com.tencent.mm.ui.MMFragmentActivity context, android.view.View parent, int i17, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.view.f5 f5Var = new com.tencent.mm.plugin.finder.view.f5(i17, z17, null, 4, null);
        f5Var.f132068b = context;
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() == 1) {
            f5Var.f132067a = null;
        } else {
            f5Var.f132067a = com.tencent.mm.plugin.finder.view.i5.a(com.tencent.mm.plugin.finder.view.FinderCommentDrawer.V, context, parent, null, z17, false, i18, 4, null);
        }
        return f5Var;
    }
}
