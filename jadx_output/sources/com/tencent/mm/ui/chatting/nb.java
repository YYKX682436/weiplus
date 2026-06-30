package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class nb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f202040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f202041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.mm.ui.chatting.tb tbVar, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f202040d = tbVar;
        this.f202041e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.chatting.tb tbVar = this.f202040d;
        em.i1 i1Var = tbVar.f202711d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(tbVar.f202716i);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = tbVar.f202712e;
        if (markdownNativeMvvmView == null) {
            kotlin.jvm.internal.o.o("mvvmView");
            throw null;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout selectableLayout$app_release = markdownNativeMvvmView.getSelectableLayout$app_release();
        boolean z17 = selectableLayout$app_release.f204669p && selectableLayout$app_release.f204660d.d();
        kotlin.jvm.internal.c0 c0Var = this.f202041e;
        c0Var.f310112d = z17;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView2 = tbVar.f202712e;
        if (markdownNativeMvvmView2 == null) {
            kotlin.jvm.internal.o.o("mvvmView");
            throw null;
        }
        markdownNativeMvvmView2.f204654r = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownNativeMvvmView", "[PREVIEW_TAP] resetPreviewTapConsumption");
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] onDown inChild=%b hadSelectionOnDown=%b", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(c0Var.f310112d));
        return jz5.f0.f302826a;
    }
}
