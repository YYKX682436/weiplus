package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f133983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f133984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f133985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133987i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f133988m;

    public c9(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var, android.view.View view2, android.view.View view3, com.tencent.neattextview.textview.view.NeatTextView neatTextView) {
        this.f133982d = view;
        this.f133983e = textView;
        this.f133984f = textView2;
        this.f133985g = e9Var;
        this.f133986h = view2;
        this.f133987i = view3;
        this.f133988m = neatTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f133982d;
        int measuredWidth = view.getMeasuredWidth();
        android.widget.TextView textView = this.f133983e;
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        android.widget.TextView textView2 = this.f133984f;
        float measureText2 = textView2.getPaint().measureText(textView2.getText().toString());
        com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = this.f133985g;
        int dimensionPixelSize = e9Var.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = this.f133986h.getVisibility() == 0 ? e9Var.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) : 0;
        float f17 = ((measuredWidth - measureText) - measureText2) - dimensionPixelSize2;
        com.tencent.mars.xlog.Log.i("Finder.DescCommentContentUIC", "updatePrefixSize content " + measuredWidth + " prefix " + measureText + " postfix " + measureText2 + " icon " + dimensionPixelSize2);
        if (f17 <= dimensionPixelSize) {
            android.view.View view2 = this.f133987i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f133987i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f133988m.setMaxWidth(view.getMeasuredWidth());
    }
}
