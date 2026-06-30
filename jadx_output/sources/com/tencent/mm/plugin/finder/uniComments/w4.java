package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class w4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a5 f130444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f130445e;

    public w4(com.tencent.mm.plugin.finder.uniComments.a5 a5Var, android.view.View view) {
        this.f130444d = a5Var;
        this.f130445e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130444d;
        a5Var.h().getFooterLayout().removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f130445e;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), a5Var.l().getCommentEditTextLayout().getHeight());
        view2.requestLayout();
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "bottomMargin=" + a5Var.l().getCommentEditTextLayout().getHeight() + " paddingBottom=" + view2.getPaddingBottom());
    }
}
