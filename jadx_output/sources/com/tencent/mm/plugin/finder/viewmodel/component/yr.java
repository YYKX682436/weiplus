package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class yr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f136605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f136606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f136609h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f136610i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f136611m;

    public yr(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, java.util.List list, com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var, int i17) {
        this.f136605d = weImageView;
        this.f136606e = list;
        this.f136607f = hsVar;
        this.f136608g = s0Var;
        this.f136609h = zk2Var;
        this.f136610i = xk2Var;
        this.f136611m = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f136605d;
        int i17 = 0;
        weImageView.setClickable(false);
        weImageView.setFocusable(false);
        java.util.Iterator it = this.f136606e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            in5.s0 s0Var = this.f136608g;
            if (!hasNext) {
                r45.xk2 answer = this.f136610i;
                kotlin.jvm.internal.o.f(answer, "$answer");
                this.f136607f.R6(s0Var, this.f136609h, answer, "");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            if (i17 <= this.f136611m) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = view2 instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) view2 : null;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                }
            }
            i17 = i18;
        }
    }
}
