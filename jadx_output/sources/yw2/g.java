package yw2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.n f466642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f466643e;

    public g(yw2.n nVar, android.view.View view) {
        this.f466642d = nVar;
        this.f466643e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f466642d.k().getFooterLayout().removeOnLayoutChangeListener(this);
        int i39 = i27 - i18;
        if (i39 > 0) {
            android.view.View view2 = this.f466643e;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i39);
            view2.requestLayout();
        }
    }
}
