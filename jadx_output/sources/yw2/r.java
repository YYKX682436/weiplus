package yw2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f466668e;

    public r(yw2.a0 a0Var, android.view.View view) {
        this.f466667d = a0Var;
        this.f466668e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        yw2.a0 a0Var = this.f466667d;
        a0Var.k().getFooterLayout().removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f466668e;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), a0Var.n().getCommentEditTextLayout().getHeight());
        view2.requestLayout();
        com.tencent.mars.xlog.Log.i("Finder.TimelineDrawerBuilder", "bottomMargin=" + a0Var.n().getCommentEditTextLayout().getHeight() + " paddingBottom=" + view2.getPaddingBottom());
    }
}
