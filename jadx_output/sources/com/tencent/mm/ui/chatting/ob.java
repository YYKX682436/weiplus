package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class ob extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f202071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f202072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(com.tencent.mm.ui.chatting.tb tbVar, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f202071d = tbVar;
        this.f202072e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.chatting.tb tbVar = this.f202071d;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = tbVar.f202712e;
        if (markdownNativeMvvmView == null) {
            kotlin.jvm.internal.o.o("mvvmView");
            throw null;
        }
        boolean z17 = markdownNativeMvvmView.f204654r;
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownNativeMvvmView", "[PREVIEW_TAP] consumePreviewTapConsumed=%b", java.lang.Boolean.valueOf(z17));
        markdownNativeMvvmView.f204654r = false;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        kotlin.jvm.internal.c0 c0Var = this.f202072e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] onTap inChild=%b hadSelectionOnDown=%b isScrolling=%b tapConsumedByChild=%b", valueOf, java.lang.Boolean.valueOf(c0Var.f310112d), java.lang.Boolean.valueOf(tbVar.f202714g), java.lang.Boolean.valueOf(z17));
        if (c0Var.f310112d) {
            c0Var.f310112d = false;
        } else if (tbVar.f202714g) {
            tbVar.f202714g = false;
            em.i1 i1Var = tbVar.f202711d;
            if (i1Var == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            i1Var.b().removeCallbacks(tbVar.f202715h);
        } else if (z17) {
            c0Var.f310112d = false;
        } else {
            c0Var.f310112d = false;
            em.i1 i1Var2 = tbVar.f202711d;
            if (i1Var2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.chatting.TapToDismissFrameLayout a17 = i1Var2.a();
            java.lang.Runnable runnable = tbVar.f202716i;
            a17.removeCallbacks(runnable);
            em.i1 i1Var3 = tbVar.f202711d;
            if (i1Var3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            i1Var3.a().postDelayed(runnable, 50L);
        }
        return java.lang.Boolean.TRUE;
    }
}
