package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a2 f130421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f130422e;

    public u1(com.tencent.mm.plugin.finder.uniComments.a2 a2Var, android.view.View view) {
        this.f130421d = a2Var;
        this.f130422e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = this.f130421d;
        a2Var.e().getFooterLayout().removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f130422e;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), a2Var.f().getCommentEditTextLayout().getHeight());
        view2.requestLayout();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusTimelineDrawerBuilder", "bottomMargin=" + a2Var.f().getCommentEditTextLayout().getHeight() + " paddingBottom=" + view2.getPaddingBottom());
    }
}
