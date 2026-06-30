package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class MMLoadMoreListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f197493d;

    /* renamed from: e, reason: collision with root package name */
    public db5.f4 f197494e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f197495f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f197496g;

    public MMLoadMoreListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197493d = null;
        this.f197494e = null;
        this.f197495f = false;
        d();
    }

    public void b() {
        if (this.f197493d != null) {
            this.f197496g.setVisibility(8);
            android.view.View view = this.f197493d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c() {
        if (this.f197493d.getParent() == null) {
            if (this.f197493d == null) {
                f();
            }
            try {
                removeFooterView(this.f197493d);
                addFooterView(this.f197493d);
            } catch (java.lang.Exception unused) {
            }
        }
        this.f197496g.setVisibility(0);
        android.view.View view = this.f197493d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d() {
        if (this.f197493d == null) {
            f();
            addFooterView(this.f197493d);
            android.view.View view = this.f197493d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void f() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.byg, null);
        this.f197493d = inflate;
        this.f197496g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gc7);
        android.view.View view = this.f197493d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void g() {
        setOnScrollListener(new db5.e4(this));
    }

    public boolean getScroll2Top() {
        return getFirstVisiblePosition() == 0 && getChildAt(0) != null && getChildAt(0).getTop() == getPaddingTop();
    }

    public void setFooterTips(java.lang.String str) {
        this.f197496g.setText(str);
    }

    public void setOnFootrClickListener(android.view.View.OnClickListener onClickListener) {
        this.f197496g.setOnClickListener(onClickListener);
    }

    public void setOnLoadMoreListener(db5.f4 f4Var) {
        this.f197494e = f4Var;
    }

    public MMLoadMoreListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197493d = null;
        this.f197494e = null;
        this.f197495f = false;
        d();
    }
}
