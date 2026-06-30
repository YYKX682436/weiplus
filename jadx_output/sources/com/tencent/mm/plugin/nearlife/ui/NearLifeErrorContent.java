package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class NearLifeErrorContent extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f152285d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f152286e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f152287f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f152288g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f152289h;

    public NearLifeErrorContent(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f152285d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f152285d, com.tencent.mm.R.layout.c5w, this);
        this.f152286e = inflate;
        this.f152287f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k5b);
        this.f152288g = this.f152286e.findViewById(com.tencent.mm.R.id.f486099k61);
    }

    public void b(int i17) {
        if (i17 == 0) {
            this.f152287f.setVisibility(8);
            android.view.View view = this.f152288g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f152289h.setVisibility(0);
            return;
        }
        if (i17 == 1) {
            this.f152287f.setVisibility(0);
            android.view.View view2 = this.f152288g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f152289h.setVisibility(8);
            return;
        }
        if (i17 != 2) {
            return;
        }
        this.f152287f.setVisibility(8);
        android.view.View view3 = this.f152288g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f152289h.setVisibility(8);
    }

    public void setListView(android.widget.ListView listView) {
        this.f152289h = listView;
    }

    public NearLifeErrorContent(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152285d = context;
        a();
    }
}
