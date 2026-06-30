package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class ck implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206294e;

    public ck(android.view.View view, android.view.View view2) {
        this.f206293d = view;
        this.f206294e = view2;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.View view2 = this.f206293d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        com.tencent.mm.ui.bk.f197978a.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        android.view.View view3 = this.f206294e;
        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        return view2.onApplyWindowInsets(windowInsets);
    }
}
