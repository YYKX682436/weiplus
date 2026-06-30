package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f133012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f133013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133014g;

    public s3(android.view.View view, com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView, java.lang.CharSequence charSequence, yz5.l lVar) {
        this.f133011d = view;
        this.f133012e = finderCollapsibleTextView;
        this.f133013f = charSequence;
        this.f133014g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f133011d.getWidth();
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f133012e;
        if (width > 0) {
            finderCollapsibleTextView.getContentTextView().setLineEndExtraWidths(new float[]{width});
        }
        finderCollapsibleTextView.setText(this.f133013f);
        this.f133014g.invoke(java.lang.Boolean.valueOf(finderCollapsibleTextView.getContentTextView().f215178e));
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = finderCollapsibleTextView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o3Var.vk(context, true, 0, finderCollapsibleTextView.isCollapse, finderCollapsibleTextView.isTopicExpand);
    }
}
