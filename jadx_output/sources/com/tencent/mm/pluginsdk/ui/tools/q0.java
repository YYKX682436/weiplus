package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public final class q0 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r0 f191848a;

    public q0(com.tencent.mm.pluginsdk.ui.tools.r0 r0Var) {
        this.f191848a = r0Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        try {
            this.f191848a.notifyDataSetChanged();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th6, "onchanged err", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        try {
            com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = this.f191848a;
            r0Var.notifyItemRangeChanged(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th6, "onItemRangeChanged err", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        try {
            com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = this.f191848a;
            r0Var.notifyItemRangeInserted(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th6, "onItemRangeInserted err", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = this.f191848a;
        try {
            r0Var.notifyItemMoved(r0Var.y() + i17, r0Var.y() + i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th6, "onItemRangeMoved err", new java.lang.Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        try {
            com.tencent.mm.pluginsdk.ui.tools.r0 r0Var = this.f191848a;
            r0Var.notifyItemRangeRemoved(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th6, "onItemRangeRemoved err", new java.lang.Object[0]);
        }
    }
}
