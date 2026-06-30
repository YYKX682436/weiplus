package pk2;

/* loaded from: classes3.dex */
public final class f7 extends com.tencent.mm.ui.widget.dialog.k0 {

    /* renamed from: q2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.c1 f355745q2;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.Object f355746r2;

    public f7(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f211864i.setOnDismissListener(new pk2.d7(this));
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public void p(com.tencent.mm.ui.widget.dialog.c1 c1Var) {
        this.f355745q2 = c1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public void v() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.v();
        com.tencent.mars.xlog.Log.i("FinderLiveMMBottomSheet", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        android.view.View view = this.S;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new pk2.e7(this));
    }
}
